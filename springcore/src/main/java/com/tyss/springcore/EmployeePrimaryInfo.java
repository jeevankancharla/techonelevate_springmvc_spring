package com.tyss.springcore;

import lombok.Data;

@Data
public class EmployeePrimaryInfo {
	
	private int eid;
	private String name;
	private String email;
	
	private EmployeeAddressInfo address;
	
	
	
	public EmployeePrimaryInfo(int eid, String name, String email, EmployeeAddressInfo address) {
		
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	public void Details() {
		System.out.println(eid+""+name+""+email);
		System.out.println(address);
	}
	

}
