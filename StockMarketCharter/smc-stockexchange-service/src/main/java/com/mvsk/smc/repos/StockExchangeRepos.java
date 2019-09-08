package com.mvsk.smc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvsk.smc.entities.Stock_Exchange;

@Repository("stockExchangeRepos")
public interface StockExchangeRepos extends JpaRepository<Stock_Exchange, Integer> {

}
