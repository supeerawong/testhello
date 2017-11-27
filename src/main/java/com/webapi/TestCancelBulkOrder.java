package com.webapi;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestCancelBulkOrder {
	//TestCancelBulkOrder
	public static void testCancelBulkOrder(String url,Map<String, String> uriParams,String token, String sourceId,String gatewayRefId,String destRefId,String brokerCode,String destSystem,String msgType,String department,String tradeEngine,String securityCode,String counterPartyCode,String ownerCode,String investTxType,String tradeDate,String settleDate,String userId,Character isLocked,String status,int sourceRefId,int sendOrderId) throws Exception {
		System.out.println("Test Cancel Bulk Order");
		//setURL
		String uri = "http://"+url+"/trade/{market}/cancel/{ownerCode}";
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(uri);
		System.out.println(builder.buildAndExpand(uriParams).toUri());
		RestTemplate restTemplate = new RestTemplate();
		
		// create request body
		msgType = "cancel";
		String input = createcancelbulkorder(sourceId, gatewayRefId, destRefId, brokerCode, destSystem, msgType, department, tradeEngine, securityCode, counterPartyCode, ownerCode, investTxType, tradeDate, settleDate, userId, isLocked, status, sourceRefId, sendOrderId);
				
		// set headers
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.set("WMSL-Token", token);
		HttpEntity<String> entity = new HttpEntity<String>(input, headers);
		
		// settimeout
		setTimeout(restTemplate,60000);
		
		// send request and parse result
		ResponseEntity<String> Response = restTemplate.exchange(builder.buildAndExpand(uriParams).toUri(), HttpMethod.DELETE, entity, String.class);
		JSONObject userJson = new JSONObject(Response.getBody());
		System.out.println(userJson.toString().replaceAll(",", "\n"));
				
	}
	
	//CreateRequestForCancelBulkOrder
	private static String createcancelbulkorder(String sourceId,String gatewayRefId,String destRefId,String brokerCode,String destSystem,String msgType,String department,String tradeEngine,String securityCode,String counterPartyCode,String ownerCode,String investTxType,String tradeDate,String settleDate,String userId,Character isLocked,String status,int sourceRefId,int sendOrderId) throws JSONException, Exception{
		ObjectMapper mapper = new ObjectMapper();
		PlateformFIOrder platformFIOrder = new PlateformFIOrder();
		platformFIOrder.setPlateformFIOrder(securityCode, counterPartyCode, ownerCode, investTxType, tradeDate, settleDate, userId, isLocked, status, sourceRefId, sendOrderId);
		gateway_New_Bulk_Order newbulkorder = new gateway_New_Bulk_Order();
		newbulkorder.setgateway_New_Bulk_Order(sourceId, gatewayRefId, destRefId, brokerCode, destSystem, "cancel", department, tradeEngine, platformFIOrder);
		String JsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(newbulkorder);
		return JsonString;
		}

	//SetTimeOut
	private static void setTimeout(RestTemplate restTemplate, int timeout) {
	//Explicitly setting ClientHttpRequestFactory instance to     
	//SimpleClientHttpRequestFactory instance to leverage 
	//set*Timeout methods
	restTemplate.setRequestFactory(new SimpleClientHttpRequestFactory());
	SimpleClientHttpRequestFactory rf = (SimpleClientHttpRequestFactory) restTemplate.getRequestFactory();
	rf.setReadTimeout(timeout);
	rf.setConnectTimeout(timeout);
	}
}
