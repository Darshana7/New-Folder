package com.te.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.crud.daolayer.DaoLayer;
import com.te.crud.model.Employee;

@Service
public class CrudServiceImpl implements CrudService{
	
	@Autowired
	private DaoLayer dao;
	
	@Override
	public boolean add(Employee emp) {
		
		//emp object is null
		if(emp==null) {
			return false;
		}
		return dao.save(emp);
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	

//	@Override
//	public boolean getDetails() {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean delete(int id) {
		if(id==0)
			return false;
		return dao.remove(id);
	}


	public boolean update(Employee emp ) {
		if(emp==null) 
			return false;
		return dao.update(emp);
		
	}

	public boolean retrieve(Employee emp) {
		if(emp==null)
			return false;
		return dao.retrieve(emp);
	}

	
}
