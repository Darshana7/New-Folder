package com.te.crud.daolayer;

import com.te.crud.model.Employee;

public interface DaoLayer {

	boolean save(Employee emp);
	
	public boolean remove(int id);

	boolean update(Employee emp );

	boolean retrieve(Employee emp);

}
