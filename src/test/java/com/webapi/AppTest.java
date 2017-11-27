package com.webapi;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
	static String url = "192.168.0.74:8084/wmsl-gateway-web-app";
	static String platform = "192.168.0.74:8083/wmsl-gateway-web-app";
	static Map<String, String> uriParams = new HashMap<String, String>();
	static String username = "admin";
	static String password = "admin";
	static String token = new String();
	static String market = "fi";
	static String sourceId = "111";
	static String gatewayRefId = "WMSL201710181135250000005800";
	static String destRefId = "WMSL201710181135260000005801";
	static String brokerCode = "platform";
	static String destSystem = "platform";
	static String msgType = "new";
	static String department = "invest";
	static String tradeEngine = "platform";
	static String securityCode = "TISCO205A.SET";
	static String counterPartyCode = "GSB";
	static String ownerCode = "APPLE";
	static String investTxType = "BUY";
	static String tradeDate = "2017-10-17";
	static String settleDate = "2017-10-19";
	static String userId = "APPLE_SYS_INVS3";
	static Character isLocked = 'N';
	static String status = "";
	static int sourceRefId = 0;
	static int sendOrderId = 0;
	static int preexecutionallocid = -1;
	static int executionid = 287;
	static Integer orderinvestid = 3485;
	static double investtxid = -1;
	static double allocatedunit = 5000.000000;
	static double allocatedcommission = 0.00;
	static double allocatedvat = 0.00;
	static double price = 1000.00;
	static double calcallocatedunit = 5000.000000;
	static Character activeflag = 'A';
	static Integer sourcerefid = 371;
	static String createtime = "2017-11-08T00:00:00+07:00";
	static double amount = 5000000.00;
	static String portfoliocode = "FI-HTM-GOV";
	static String ownercode = "APPLE";
    
   public void testloginpass() throws JsonProcessingException, JSONException {
		uriParams.put("market", market);
		uriParams.put("ownerCode", ownerCode);
		uriParams.put("counterPartyCode", counterPartyCode);
		uriParams.put("securityCode", securityCode);
		token = Testlogin.login(url, username, password);
		assertNotNull(token);
	}
	public void testNewBulkOrder() throws Exception {
		uriParams.put("market", market);
		uriParams.put("ownerCode", ownerCode);
		uriParams.put("counterPartyCode", counterPartyCode);
		uriParams.put("securityCode", securityCode);
		token = Testlogin.login(url, username, password);
		TestNewBulkOrder.testNewBulkOrder(url, uriParams, token, sourceId, gatewayRefId, destRefId, brokerCode, destSystem, msgType, department, tradeEngine, securityCode, counterPartyCode, ownerCode, investTxType, tradeDate, settleDate, userId, isLocked, status, sourceRefId, sendOrderId);
	}
	public void testCancelBulkOrder() throws Exception {
		uriParams.put("market", market);
		uriParams.put("ownerCode", ownerCode);
		uriParams.put("counterPartyCode", counterPartyCode);
		uriParams.put("securityCode", securityCode);
		token = Testlogin.login(url, username, password);
		TestCancelBulkOrder.testCancelBulkOrder(url, uriParams, token, sourceId, gatewayRefId, destRefId, brokerCode, destSystem, msgType, department, tradeEngine, securityCode, counterPartyCode, ownerCode, investTxType, tradeDate, settleDate, userId, isLocked, status, sourceRefId, sendOrderId);
	}
	public void testfetchorderhistorybyownercode() throws Exception {
		uriParams.put("market", market);
		uriParams.put("ownerCode", ownerCode);
		uriParams.put("counterPartyCode", counterPartyCode);
		uriParams.put("securityCode", securityCode);
		token = Testlogin.login(url, username, password);
		TestFetchOrderHistoryByOwnerCode.testfetchorderhistorybyownercode(platform, uriParams, token, tradeDate);
	}
	public void test00() {
		int a=0;
		int b=1;
		assertEquals(1,a+b);
	}
	public void test01() {
		assertTrue(true);
	}

}
