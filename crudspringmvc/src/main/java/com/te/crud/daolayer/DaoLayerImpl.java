package com.te.crud.daolayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;
import com.te.crud.model.Employee;

@Repository
public class DaoLayerImpl implements DaoLayer{
	
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud");
		return factory.createEntityManager();
	}
	

	@Override
	public boolean save(Employee emp) {
		//case 2:executes successfully without any exception
		//case 3:executes successfully with an exception
		try {
			EntityManager manager = getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(emp);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean remove(int id) {
		try {
			EntityManager manager=getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Employee find = manager.find(Employee.class, id);
			manager.remove(find);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	@Override
	public boolean update(Employee emp) {
		try {
			EntityManager manager=getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			//Object "";
			/*
			 * Query
			 * query=manager.createQuery("select id from Employee where firstname=:n");
			 * query.setParameter("n", firstname); Object singleResult =
			 * query.getSingleResult();
			 * 
			 */
			Employee find1 = manager.find(Employee.class,emp.getId());
			find1.setDesignation(emp.getDesignation());
			find1.setFirstname(emp.getFirstname());
			find1.setDoj(emp.getDoj());
			find1.setLastname(emp.getLastname());
			find1.setMail(emp.getMail());
			find1.setSalary(emp.getSalary());
			
//			Query query2=manager.createQuery("update Employee set firstname=:f , lastname =:l,designation =:d ,salary =:s, doj =:do, mail =:m  where emp_id=:id");
//			query2.setParameter("f",find1.getFirstname());
//			query2.setParameter("l",find1.getLastname());
//			query2.setParameter("d",find1.getDesignation());
//			query2.setParameter("s",find1.getSalary());
//			query2.setParameter("do",find1.getDoj());
//			query2.setParameter("m",find1.getMail());
//			query2.executeUpdate();
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean retrieve(Employee emp) {
		try {
			EntityManager manager = getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	
	
}
