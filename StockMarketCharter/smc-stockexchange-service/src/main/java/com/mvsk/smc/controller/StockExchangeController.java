package com.mvsk.smc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvsk.smc.entities.Stock_Exchange;
import com.mvsk.smc.service.StockExchangeService;



@RestController	
public class StockExchangeController {
	
	@Autowired
	private StockExchangeService stockExchangeService;
	
	@PostMapping("/stockExchange") Stock_Exchange create(@RequestBody Stock_Exchange stockExchange) {
		 
System.out.println(stockExchange);
		 return stockExchangeService.save(stockExchange); }
		 
		
		 
		 
		 @GetMapping("/stockExchange") Iterable<Stock_Exchange> read() {return stockExchangeService.findAll();}
		 
		 
		 @PutMapping("/stockExchange") Stock_Exchange update(@RequestBody Stock_Exchange stockExchange) { return
				 stockExchangeService.save(stockExchange); }
		  
		  
		  @DeleteMapping("/stockExchange/{id}") void delete(@PathVariable Integer id) {
			  stockExchangeService.deleteById(id); }
		

}
