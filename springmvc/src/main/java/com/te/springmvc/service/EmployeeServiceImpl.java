package com.te.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.te.springmvc.bean.EmployeeBean;
import com.te.springmvc.dao.EmployeeDAO;

@Repository
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
private EmployeeDAO dao;

	@Override
	public EmployeeBean authenticate(int id, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(id, password);
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployee(id);
	}

	@Override
	public boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmp(id);
	}

	@Override
	public List<EmployeeBean> getAllEmp() {
		
		return dao.getAllEmp();
	}

	@Override
	public boolean addEmployee(EmployeeBean bean) {
		
		return dao.addEmployee(bean);
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(bean);
	}

}
