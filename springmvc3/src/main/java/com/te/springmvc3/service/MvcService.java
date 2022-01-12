package com.te.springmvc3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.te.springmvc3.daolayer.DaoLayer;
import com.te.springmvc3.model.Register;

@Component
public class MvcService {
	
	@Autowired
	DaoLayer layer;
	
	
	public void save(Register reg) {
		if(reg!=null) {
		layer.put(reg);
		}
	
	}

}