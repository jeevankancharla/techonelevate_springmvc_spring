package com.te.springmvc.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
public class EmployeeBean implements Serializable {
	@Id
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	@DateTimeFormat
	private Date dob;
	@Column
	private String password;

}
