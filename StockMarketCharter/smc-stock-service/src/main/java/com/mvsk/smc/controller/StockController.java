package com.mvsk.smc.controller;

import java.text.DateFormat; 
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mvsk.smc.entities.Stock;
import com.mvsk.smc.service.StockService;


@RestController
public class StockController {

	@Autowired
	private StockService stockService;

	// private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	// private static final DateTimeFormatter dtf =
	// DateTimeFormatter.ofPattern("dd/MM/yyyy");

	LocalDate date = LocalDate.now();
	LocalDate weekAgo = LocalDate.now().minusDays(7);
	LocalDate monthAgo = LocalDate.now().minusDays(30);
	LocalDate yearAgo = LocalDate.now().minusDays(365);

	@GetMapping("date")
	void date() {
		System.out.println(date);
		System.out.println(weekAgo);
		System.out.println(monthAgo);
		System.out.println(yearAgo);

	}

	@GetMapping("stock/{company_name}")
	List<Stock> stockDetails(@PathVariable String company_name) {
		System.out.println(company_name);
		return stockService.getStockbyName(company_name);
	}

	
	  @GetMapping("stock/{company_name}/week") Iterable<Stock>
	  stockDetailsWeek(@PathVariable String company_name) { return
	  stockService.stockDetailsWeek(company_name,date,weekAgo); }
	  
	  
	  @GetMapping("stock/{company_name}/month") Iterable<Stock>
	  stockDetailsMonth(@PathVariable String company_name) { return
	  stockService.stockDetailsMonth(company_name,date,monthAgo); }
	  
	  @GetMapping("stock/{company_name}/year") Iterable<Stock>
	  stockDetailsYear(@PathVariable String company_name) { return
	  stockService.stockDetailsYear(company_name,date,yearAgo); }
	  
	 

}
