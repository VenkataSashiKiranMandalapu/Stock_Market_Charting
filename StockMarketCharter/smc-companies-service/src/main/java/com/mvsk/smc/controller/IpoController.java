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
import com.mvsk.smc.entities.IPO;
import com.mvsk.smc.service.IpoService;

@RestController
public class IpoController {

	@Autowired
	private IpoService ipoService;
	
	@PostMapping("/ipo") IPO create(@RequestBody IPO ipo) {
		 
		 return ipoService.save(ipo); }
		 
		
		 
		 
		 @GetMapping("/ipo") Iterable<IPO> read() {return ipoService.findAll();}
		 
		 
		 @PutMapping("/ipo") IPO update(@RequestBody IPO ipo) { return
				 ipoService.save(ipo); }
		  
		  
		  @DeleteMapping("/ipo/{id}") void delete(@PathVariable Integer id) {
			  ipoService.deleteById(id); }
		  
		  @GetMapping("/ipo_planned")
		  Iterable<IPO> ipoPlanned() {
			 return ipoService.iposPlanned();}
		  
		  
		  
		  @GetMapping("/ipo_planned/{company_name}")
		  Iterable<IPO> iposPlannedForCompany(@PathVariable String company_name) {
			  ;return ipoService.iposPlannedForCompany(company_name);}
	
}
