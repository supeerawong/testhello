package com.webapi;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class TestFetchOrderByOwnerCode {
	//TestFetchOrderByOwnerCode
	public static void testfetchorderbyownercode(String url,Map<String, String> uriParams, String token, String tradeDate) throws Exception {
		System.out.println("Test Fetch Order By OwnerCode");
		//setURL
		String uri = "http://"+url+"/trade/fi/fetch/order/{ownerCode}";
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(uri);
		System.out.println(builder.buildAndExpand(uriParams).toUri());
		RestTemplate restTemplate = new RestTemplate();
		
		//create request body
		String input = "\""+tradeDate+"\"";

		//settimeout
		setTimeout(restTemplate,60000);
		
		//setheaders
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.set("WMSL-Token", token);
		HttpEntity<String> entity = new HttpEntity<String>(input, headers);
		
		// send request and parse result
		ResponseEntity<String> Response = restTemplate.exchange(builder.buildAndExpand(uriParams).toUri(), HttpMethod.POST, entity, String.class);
		JSONObject userJson = new JSONObject(Response.getBody());
		System.out.println(userJson.toString().replaceAll(",", "\n"));
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
