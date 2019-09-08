package com.mvsk.smc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvsk.smc.entities.Stock;


@Repository("excelRepos")
public interface ExcelRepos extends JpaRepository<Stock, Integer> {

}
