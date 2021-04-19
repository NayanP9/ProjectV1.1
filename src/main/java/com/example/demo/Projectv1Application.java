package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustRepo;

@SpringBootApplication
public class Projectv1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Projectv1Application.class, args);
	}
	
    @Autowired
    private CustRepo CustRepo;
	 
	@Override
	public void run(String... args) throws Exception 
	{
		this.CustRepo.save(new Customer("Nayan",24, 9511, "abc@gmail.com"));
		this.CustRepo.save(new Customer("Huzefa",24,9801, "def@gmail.com"));
		this.CustRepo.save(new Customer("Omkar",28, 9841, "ghi@gmail.com"));
		this.CustRepo.save(new Customer("Bhavin",35, 9119, "jkl@gmail.com"));
		
		
		
	}

}
