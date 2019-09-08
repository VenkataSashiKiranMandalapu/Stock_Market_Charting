package com.mvsk.smc.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.mvsk.smc.entities.Stock_Exchange;



public interface StockExchangeService {

	Stock_Exchange save(Stock_Exchange stockExchange);

	Iterable<Stock_Exchange> findAll();

	void deleteById(Integer id);

}
