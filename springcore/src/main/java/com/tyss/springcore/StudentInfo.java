package com.tyss.springcore;

import lombok.Data;

@Data
public class StudentInfo {
	
	private int sid;
	private String name;
	private String email;
	private StudentAddressInfo address;

	
	
	public void StudentDetails() {
		System.out.println(sid+""+email+""+name);
		System.out.println(address);
	}
	
}
