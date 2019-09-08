package com.mvsk.smc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.mvsk.smc.entities.Stock_Exchange;
import com.mvsk.smc.repos.StockExchangeRepos;


@Service("stockExchangeService")

public class StockExchangeServiceImpl implements StockExchangeService{

	@Autowired
	private StockExchangeRepos stockExchangeRepos;

	@Override
	public Stock_Exchange save(Stock_Exchange stockExchange) {
		// TODO Auto-generated method stub
		return stockExchangeRepos.save(stockExchange);
	}

	@Override
	public Iterable<Stock_Exchange> findAll() {
		// TODO Auto-generated method stub
		return stockExchangeRepos.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		stockExchangeRepos.deleteById(id);
		
	}
}
