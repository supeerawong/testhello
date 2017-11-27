package com.webapi;

public class PlateformFIOrder {
	public String yield;
	public String price;
	public String unit;
	public String amount;
	public String securityCode;
	public String counterPartyCode;
	public String ownerCode;
	public String investTxType;
	public String tradeDate;
	public String settleDate;
	public String userId;
	public Character isLocked;
	public String status;
	public int sourceRefId;
	public int sendOrderId;
	
	//securityCode
	public void setsecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public String getsecurityCode() {
		return this.securityCode;
	}
	
	//counterPartyCode
	public void setcounterPartyCode(String counterPartyCode) {
		this.counterPartyCode = counterPartyCode;
	}
	public String getcounterPartyCode() {
		return this.counterPartyCode;
	}
	
	//ownerCode
	public void setownerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	public String getownerCode() {
		return this.ownerCode;
	}
	
	//investTxType
	public void setinvestTxType(String investTxType) {
		this.investTxType = investTxType;
	}
	public String getinvestTxType() {
		return this.investTxType;
	}
	
	//tradeDate
	public void settradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String gettradeDate() {
		return this.tradeDate;
	}
	
	//settleDate
	public void setsettleDate(String settleDate) {
		this.settleDate = settleDate;
	}
	public String getsettleDate() {
		return this.settleDate;
	}

	//userId
	public void setuserId(String userId) {
		this.userId = userId;
	}
	public String getuserId() {
		return this.userId;
	}
	
	//isLocked
	public void setisLocked(Character isLocked) {
		this.isLocked = isLocked;
	}
	public Character getisLocked() {
		return this.isLocked;
	}
	
	//status
	public void setstatus(String status) {
		this.status = status;
	}
	public String getstatus() {
		return this.status;
	}
	
	//sourceRefId
	public void setsourceRefId(int sourceRefId) {
		this.sourceRefId = sourceRefId;
	}
	public int getsourceRefId() {
		return this.sourceRefId;
	}
	
	//sendOrderId
	public void setsendOrderId(int sendOrderId) {
		this.sendOrderId = sendOrderId;
	}
	public int getsendOrderId() {
		return this.sendOrderId;
	}

	//setPlateformFLOrder
	public void setPlateformFIOrder(String securityCode,String counterPartyCode,String ownerCode,String investTxType,String tradeDate,String settleDate,String userId,Character isLocked,String status,int sourceRefId,int sendOrderId) {
		setsecurityCode(securityCode);
		setcounterPartyCode(counterPartyCode);
		setownerCode(ownerCode);
		setinvestTxType(investTxType);
		settradeDate(tradeDate);
		setsettleDate(settleDate);
		setuserId(userId);
		setisLocked(isLocked);
		setstatus(status);
		setsourceRefId(sourceRefId);
		setsendOrderId(sendOrderId);
	}
}
