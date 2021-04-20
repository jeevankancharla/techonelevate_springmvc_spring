package com.tyss.springcore;

import lombok.Data;

@Data
public class EmployeeAddressInfo {
	
	private int doorNo;
	private String address;
	private String city;
	private String state;
	private int pincode;
	
	
	public EmployeeAddressInfo(int doorNo, String address, String city, String state, int pincode) {
		super();
		this.doorNo = doorNo;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	

}
