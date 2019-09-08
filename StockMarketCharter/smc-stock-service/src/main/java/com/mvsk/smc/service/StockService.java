package com.mvsk.smc.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvsk.smc.entities.Stock;


@Service("stockService")
public interface StockService {

	List<Stock> getStockbyName(String company_name);

	Iterable<Stock> stockDetailsWeek(String company_name, LocalDate date, LocalDate weekAgo);

	Iterable<Stock> stockDetailsMonth(String company_name, LocalDate date, LocalDate monthAgo);

	Iterable<Stock> stockDetailsYear(String company_name, LocalDate date, LocalDate yearAgo);
	
	
	 
	  
	 
	
}
