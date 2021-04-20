package com.te.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springmvc.bean.EmployeeBean;
import com.te.springmvc.customexception.EmployeeExp;

@Repository
public class EmployeeHibernateImpl implements EmployeeDAO {

	EntityManager manager = null;
	EntityTransaction transaction = null;
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public EmployeeBean authenticate(int id, String password) {

		try {

			manager = factory.createEntityManager();
			EmployeeBean bean = manager.find(EmployeeBean.class, id);
			if (bean != null) {
				if (bean.getPassword().equals(password)) {
					System.out.println("login successfull");
					return bean;
				} else {
					System.out.println("invalid credenitials");
					return null;
				}

			} else {

				System.out.println("user not found");
				throw new EmployeeExp("user not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new EmployeeExp("user not found");
		}finally {
			if (manager != null) {
				manager.close();
			}
	}
	}

	@Override
	public EmployeeBean getEmployee(int id) {

		manager = factory.createEntityManager();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);

		return bean;
	}

	@Override
	public boolean deleteEmp(int id) {

		manager = factory.createEntityManager();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		transaction = manager.getTransaction();

		try {
			if (bean != null) {
				transaction.begin();
				manager.remove(bean);
				transaction.commit();
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		
	}
		return false;
	}

	@Override
	public List<EmployeeBean> getAllEmp() {
		try {

			manager = factory.createEntityManager();

			String data = " from EmployeeBean ";

			Query query = manager.createQuery(data);

			List<EmployeeBean> beans = query.getResultList();

			return beans;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}

		}
		return null;

	}

	@Override
	public boolean addEmployee(EmployeeBean bean) {

		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		try {
			if (bean != null) {
				transaction.begin();
				manager.persist(bean);
				transaction.commit();
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return false;

	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		boolean isUpdated = false;
		try {
			transaction.begin();
			EmployeeBean info = manager.find(EmployeeBean.class, bean.getId());

			if (bean.getName() != null && bean.getName() != "") {
				info.setName(bean.getName());
			}
			if (bean.getPassword() != null && bean.getPassword() != "") {
				info.setPassword(bean.getPassword());
			}
			if (bean.getDob() != null) {
				info.setDob(bean.getDob());
			}
			transaction.commit();
			isUpdated = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (manager != null) {
				manager.close();
			}

	}
		return isUpdated;

}
}
