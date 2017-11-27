package com.webapi;

public class gateway_New_Bulk_Order {
	private String sourceId;
	private String gatewayRefId;
	private String destRefId;
	private String brokerCode;
	private String destSystem;
	private String msgType;
	private String department;
	private String tradeEngine;
	private PlateformFIOrder platformFIOrder;
	
	//sourceId
	public void setsourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getsourceId() {
		return this.sourceId;
	}
	
	//gatewayRefID
	public void setgatewayRefId(String gatewayRefId) {
		this.gatewayRefId = gatewayRefId;
	}
	public String getgatewayRefId() {
		return this.gatewayRefId;
	}
	
	//destRefID
	public void setdestRefId(String destRefId) {
		this.destRefId = destRefId;
	}
	public String getdestRefId() {
		return this.destRefId;
	}
	
	//brokerCode
	public void setbrokerCode(String brokerCode) {
		this.brokerCode = brokerCode;
	}
	public String getbrokerCode() {
		return this.brokerCode;
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
	
	//department
	public void setdepartment(String department) {
		this.department = department;
	}
	public String getdepartment() {
		return this.department;
	}
	
	//tradeEngine
	public void settradeEngine(String tradeEngine) {
		this.tradeEngine = tradeEngine;
	}
	public String gettradeEngine() {
		return this.tradeEngine;
	}

	//platformFIOrder
	public void setplatformFIOrder(PlateformFIOrder platformFIOrder) {
		this.platformFIOrder = platformFIOrder;
	}
	public PlateformFIOrder getplatformFIOrder() {
		return this.platformFIOrder;
	}
	
	//setgateway_New_Bulk_Order
	public void setgateway_New_Bulk_Order(String sourceId,String gatewayRefId,String destRefId,String brokerCode,String destSystem,String msgType,String department,String tradeEngine,PlateformFIOrder platformFIOrder) {
		setsourceId(sourceId);
		setgatewayRefId(gatewayRefId);
		setdestRefId(destRefId);
		setbrokerCode(brokerCode);
		setdestSystem(destSystem);
		setmsgType(msgType);
		setdepartment(department);
		settradeEngine(tradeEngine);
		setplatformFIOrder(platformFIOrder);
	}
}
