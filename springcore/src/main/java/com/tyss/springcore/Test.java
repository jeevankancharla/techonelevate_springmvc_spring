package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
////		EmployeeAddressInfo addressInfo = new EmployeeAddressInfo();
////		addressInfo.setAddress1("gandhi nagar");
////		addressInfo.setCity("kurnool");
////		addressInfo.setDoorNo(123);
////		addressInfo.setPincode(8789);
////		addressInfo.setState("AP");
////		
////		EmployeePrimaryInfo info = new EmployeePrimaryInfo();
////		info.setEid(1);
////		info.setEmail("ramu@gmail.com");
////			info.setName("ramu");	
////		info.setAddress(addressInfo);
//		
//		
		
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		EmployeePrimaryInfo info = applicationContext.getBean(EmployeePrimaryInfo.class);
		      info.Details();
		
	}//end of main

}//end of class
