package com.webapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FIAllocation {
	private String gatewayRefId;
	private String destRefId;
	private String destSystem;
	private String msgType;
	private String tradeEngine;
	private String ownerCode;
	private String counterPartyCode;
	private List<Request> request;
	
	//gatewayRefId
	public void setgatewayRefId(String gatewayRefId) {
		this.gatewayRefId = gatewayRefId;
	}
	public String getgatewayRefId() {
		return this.gatewayRefId;
	}
	
	//destRefId
	public void setdestRefId(String destRefId) {
		this.destRefId = destRefId;
	}
	public String getdestRefId() {
		return this.destRefId;
	}

	//destSystem
	public void setdestSystem(String destSystem) {
		this.destSystem = destSystem;
	}
	public String getdestSystem() {
		return this.destSystem;
	}
	
	//msgType
	public void setmsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getmsgType() {
		return this.msgType;
	}
		
	//tradeEngine
	public void settradeEngine(String tradeEngine) {
		this.tradeEngine = tradeEngine;
	}
	public String gettradeEngine() {
		return this.tradeEngine;
	}
	
	//ownerCode
	public void setownerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	public String getownerCode() {
		return this.ownerCode;
	}
	
	//counterPartyCode
	public void setcounterPartyCode(String counterPartyCode) {
		this.counterPartyCode = counterPartyCode;
	}
	public String getcounterPartyCode() {
		return this.counterPartyCode;
	}
	
	//request
	public void setrequest(Request request) {
		this.request = Stream.of(request).collect(Collectors.toList());
		//this.request.add(request);
	}
	public List<Request> getrequest(){
		return this.request;
	}
	
	//setFIAllocation
	public void setFIAllocation(String gatewayRefId, String destRefId, String destSystem, String msgType, String tradeEngine, String ownerCode, String counterPartyCode, Request request) {
		setgatewayRefId(gatewayRefId);
		setdestRefId(destRefId);
		setdestSystem(destSystem);
		setmsgType(msgType);
		settradeEngine(tradeEngine);
		setrequest(request);
		setownerCode(ownerCode);
		setcounterPartyCode(counterPartyCode);
	}
}
