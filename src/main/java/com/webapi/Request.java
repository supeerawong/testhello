package com.webapi;

public class Request {
	
	public int preexecutionallocid;
	public int executionid;
	public Integer orderinvestid;
	public double investtxid;
	public double allocatedunit;
	public double allocatedcommission;
	public double allocatedvat;
	public double price;
	public double calcallocatedunit;
	public Character activeflag;
	public Integer sourcerefid;
	public String createtime;
	public double amount;
	public String portfoliocode;
	public String ownercode;
	
	//preexecutionallocid
	public void setpreexecutionallocid(int preexecutionallocid) {
		this.preexecutionallocid = preexecutionallocid;
	}
	public int getpreexecutionallocid() {
		return this.preexecutionallocid;
	}
	
	//executionid
	public void setexecutionid(int executionid) {
		this.executionid = executionid;
	}
	public int getexecutionid() {
		return this.executionid;
	}
	
	//orderinvestid
	public void setorderinvestid(Integer orderinvestid) {
		this.orderinvestid = orderinvestid;
	}
	public Integer getorderinvestid() {
		return this.orderinvestid;
	}
	
	//investtxid
	public void setinvesttxid(double investtxid) {
		this.investtxid = investtxid;
	}
	public double getinvesttxid() {
		return this.investtxid;
	}
	
	//allocatedunit
	public void setallocatedunit(double allocatedunit) {
		this.allocatedunit = allocatedunit;
	}
	public double getallocatedunit() {
		return this.allocatedunit;
	}
	
	//allocatedcommission
	public void setallocatedcommission(double allocatedcommission) {
		this.allocatedcommission = allocatedcommission;
	}
	public double getallocatedcommission() {
		return this.allocatedcommission;
	}
	
	//allocatedvat
	public void setallocatedvat(double allocatedvat) {
		this.allocatedvat = allocatedvat;
	}
	public double getallocatedvat() {
		return this.allocatedvat;
	}
	
	//price
	public void setprice(double price) {
		this.price = price;
	}
	public double getprice() {
		return this.price;
	}

	//calcallocatedunit
	public void setcalcallocatedunit(double calcallocatedunit) {
		this.calcallocatedunit = calcallocatedunit;
	}
	public double getcalcallocatedunit() {
		return this.calcallocatedunit;
	}
	
	//activeflag
	public void setactiveflag(Character activeflag) {
		this.activeflag = activeflag;
	}
	public Character getactiveflag() {
		return this.activeflag;
	}
		
	//sourcerefid
	public void setsourcerefid(Integer sourcerefid) {
		this.sourcerefid = sourcerefid;
	}
	public Integer getsourcerefid() {
		return this.sourcerefid;
	}
	
	//createtime
	public void setcreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getcreatetime() {
		return this.createtime;
	}
	
	//amount
	public void setamount(double amount) {
		this.amount = amount;
	}
	public double getamount() {
		return this.amount;
	}
	
	//portfoliocode
	public void setportfoliocode(String portfoliocode) {
		this.portfoliocode = portfoliocode;
	}
	public String getportfoliocode() {
		return this.portfoliocode;
	}
	
	//ownercode
	public void setownercode(String ownercode) {
		this.ownercode = ownercode;
	}
	public String getownercode() {
		return this.ownercode;
	}
	
	//setrequest
	public void setrequest(int preexecutionallocid, int executionid, Integer orderinvestid, double investtxid, double allocatedunit, double allocatedcommission, double allocatedvat, double price, double calcallocatedunit, Character activeflag, Integer sourcerefid, String createtime, double amount, String portfoliocode, String ownercode) {
		setpreexecutionallocid(preexecutionallocid);
		setexecutionid(executionid);
		setorderinvestid(orderinvestid);
		setinvesttxid(investtxid);
		setallocatedunit(allocatedunit);
		setallocatedcommission(allocatedcommission);
		setallocatedvat(allocatedvat);
		setprice(price);
		setcalcallocatedunit(calcallocatedunit);
		setactiveflag(activeflag);
		setsourcerefid(sourcerefid);
		setcreatetime(createtime);
		setamount(amount);
		setportfoliocode(portfoliocode);
		setownercode(ownercode);
	}
}
