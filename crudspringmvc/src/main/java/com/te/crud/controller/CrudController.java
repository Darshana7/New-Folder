package com.te.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.crud.model.Employee;
import com.te.crud.service.CrudService;
import com.te.crud.service.CrudServiceImpl;

import antlr.collections.List;

@Controller
public class CrudController {
	
	@Autowired
	private CrudServiceImpl service;
	
	@GetMapping("/add")
	public String add() {
		return "insert";
	}
	
	@PostMapping("/add")
	public String addEmp(Employee emp) {
		//case 1 : emp object is null
		//case 2 : emp object is not null and no exception
		//case 3 : emp object is not null and with exception
		
		boolean add=service.add(emp);//case 1 : value add is false case 2 : true case case3 :false
		if(add) {
			return "success";
		}else {
			return "failure";
		}
		
	}
	
	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}
	
	@PostMapping("/delete")
	public String deleteEmpById(int id) {
		if(service.delete(id))
			return "success";
		return "failure";
	}
	
	@GetMapping("/update")
	public String update() {
		return "update";
	}
	
	@PostMapping("/update")
	public String update(Employee emp) {
		if(service.update(emp))
			return "success";
		return "failure";
	}
	
	@GetMapping("/retrieve")
	public String retrieve() {
		return "retrieve";
	}
	
	@PostMapping("/retrieve")
	public String retrieve(Employee emp, ModelMap map) {
		List<Employee> retrieve=service.retrieve(emp);
		if(retrieve=null) {
			return "failure";
		} else {
			map.addAttribute("emp",retrieve);
			retrive.sh
		}
		
	}

}
