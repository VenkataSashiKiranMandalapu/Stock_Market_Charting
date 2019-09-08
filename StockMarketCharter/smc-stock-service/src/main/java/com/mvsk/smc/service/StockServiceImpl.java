package com.mvsk.smc.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvsk.smc.entities.Stock;
import com.mvsk.smc.repos.StockRepository;


@Service("stockService")
public class StockServiceImpl implements StockService
{

	@Autowired
	private StockRepository stockRepos;
	@Override
	public List<Stock> getStockbyName(String company_name) {
		// TODO Auto-generated method stub
		return stockRepos.getStockbyName(company_name);
	}

	@Override
	public Iterable<Stock> stockDetailsWeek(String company_name, LocalDate date, LocalDate weekAgo) {
		// TODO Auto-generated method stub
		System.out.println(company_name);
		System.out.println(date);
		System.out.println(weekAgo);
		return stockRepos.stockDetailsWeek(company_name , date, weekAgo );
	}

	@Override
	public Iterable<Stock> stockDetailsMonth(String company_name, LocalDate date, LocalDate monthAgo) {
		// TODO Auto-generated method stub
		return stockRepos.stockDetailsMonth(company_name, date, monthAgo);
	}

	@Override
	public Iterable<Stock> stockDetailsYear(String company_name, LocalDate date, LocalDate yearAgo) {
		// TODO Auto-generated method stub
		return stockRepos.stockDetailsYear(company_name, date, yearAgo);
	}}
