package com.mvsk.smc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvsk.smc.entities.Company;
import com.mvsk.smc.service.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/company") Company create(@RequestBody Company company) {
		 

		 return companyService.save(company); }
		 
		
		 
		 
		 @GetMapping("/company") Iterable<Company> read() {return companyService.findAll();}
		 
		 
		 @PutMapping("/company") Company update(@RequestBody Company company) { return
				 companyService.save(company); }
		  
		  
		  @DeleteMapping("/company/{id}") void delete(@PathVariable String id) {
			  companyService.deleteById(id); }

}
