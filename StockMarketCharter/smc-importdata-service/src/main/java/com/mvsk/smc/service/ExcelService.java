package com.mvsk.smc.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.mvsk.smc.entities.Stock;

public interface ExcelService {

	void save(Stock stock);


}
