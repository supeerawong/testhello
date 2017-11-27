package com.webapi;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Testlogin {
	public static String login(String url,String username,String password) throws JSONException, JsonProcessingException {
		System.out.println("Test Login");
		String uri = "http://"+url+"/authen/login";
		RestTemplate restTemplate = new RestTemplate();
		// create request body
		String input = createlogin(username, password);

		// set headers
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		HttpEntity<String> entity = new HttpEntity<String>(input, headers);
		
		// settimeout
		setTimeout(restTemplate,20000);
		
		// send request and parse result
		ResponseEntity<String> loginResponse = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
		JSONObject userJson = new JSONObject(loginResponse.getBody());
		System.out.println(userJson.toString().replaceAll(",", "\n"));
		String token = userJson.get("token").toString();
		//System.out.println(token);	
		return token;
	}
	
	//SetTimeOut
	private static void setTimeout(RestTemplate restTemplate, int timeout) {
	restTemplate.setRequestFactory(new SimpleClientHttpRequestFactory());
	SimpleClientHttpRequestFactory rf = (SimpleClientHttpRequestFactory) restTemplate.getRequestFactory();
	rf.setReadTimeout(timeout);
	rf.setConnectTimeout(timeout);
	}
	
	private static gateways_api_login createOject(String username,String password) {
		gateways_api_login login = new gateways_api_login();
		login.setlogin(username, password);
		return login;
	}
	
	private static String createlogin(String username,String password) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		gateways_api_login login = createOject(username, password);
			String JsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(login);
			return JsonString;
	}
}
