package com.tyss.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
 ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		StudentInfo info =  applicationContext.getBean(StudentInfo.class);
		info.StudentDetails();
		

	}

}
