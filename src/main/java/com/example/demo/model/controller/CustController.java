package com.example.demo.model.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustRepo;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class CustController 
{
	@Autowired
	private CustRepo CustRepo;
	
	@GetMapping("Customer")
	public List<Customer> getCustomer()
	{
		return this.CustRepo.findAll();
	}
	

	
	

}
