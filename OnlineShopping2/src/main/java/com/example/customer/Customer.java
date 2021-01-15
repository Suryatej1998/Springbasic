package com.example.customer;


public class Customer {
    
	private int customerid;
	private String customername;
	private int phonenumber;
	private String shiptoaddress;
	
	
	public int getCustomerid() {
		return customerid;
	}
	public void setId(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setName(String customername) {
		this.customername = customername;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getShiptoaddress() {
		return shiptoaddress;
	}
	public void setShiptoaddress(String shiptoaddress) {
		this.shiptoaddress = shiptoaddress;
	}
	
	
}
