package com.webapi;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestFIAllocation {
	
	//TestFIAllocation
	public static void testFIAllocation(String url,Map<String, String> uriParams, String token, String gatewayRefId, String destRefId, String destSystem, String msgType, String tradeEngine, String ownerCode, String counterPartyCode, int preexecutionallocid, int executionid, Integer orderinvestid, double investtxid, double allocatedunit, double allocatedcommission, double allocatedvat, double price, double calcallocatedunit, Character activeflag, Integer sourcerefid, String createtime, double amount, String portfoliocode, String ownercode) throws Exception {
		System.out.print("Test FI Allocation");
		//setURL
		String uri = "http://"+url+"/trade/fi/alloc";
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(uri);
		System.out.println(builder.buildAndExpand(uriParams).toUri());
		RestTemplate restTemplate = new RestTemplate();
		
		// create request body
		String input = createFIAllocation(gatewayRefId, destRefId, destSystem, msgType, tradeEngine, ownerCode, counterPartyCode, preexecutionallocid, executionid, orderinvestid, investtxid, allocatedunit, allocatedcommission, allocatedvat, price, calcallocatedunit, activeflag, sourcerefid, createtime, amount, portfoliocode, ownercode);
				
		//settimeout
		setTimeout(restTemplate,60000);
		
		// set headers
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.set("WMSL-Token", token);
		HttpEntity<String> entity = new HttpEntity<String>(input, headers);
		
		// send request and parse result
		ResponseEntity<String> Response = restTemplate.exchange(builder.buildAndExpand(uriParams).toUri(), HttpMethod.POST, entity, String.class);
		//JSONObject userJson = new JSONObject(Response.getBody());
		//System.out.println(userJson.toString().replaceAll(",", "\n"));
		System.out.println(Response.toString().replaceAll(",", "\n"));
	}
	
	//CreateBodyForFIAllocation
	private static String createFIAllocation(String gatewayRefId, String destRefId, String destSystem, String msgType, String tradeEngine, String ownerCode, String counterPartyCode, int preexecutionallocid, int executionid, Integer orderinvestid, double investtxid, double allocatedunit, double allocatedcommission, double allocatedvat, double price, double calcallocatedunit, Character activeflag, Integer sourcerefid, String createtime, double amount, String portfoliocode, String ownercode) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Request request = new Request();
		request.setrequest(preexecutionallocid, executionid, orderinvestid, investtxid, allocatedunit, allocatedcommission, allocatedvat, price, calcallocatedunit, activeflag, sourcerefid, createtime, amount, portfoliocode, ownercode);
		FIAllocation fiallocation = new FIAllocation();
		fiallocation.setFIAllocation(gatewayRefId, destRefId, destSystem, msgType, tradeEngine, ownercode, counterPartyCode, request);
		String JsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(fiallocation);
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
