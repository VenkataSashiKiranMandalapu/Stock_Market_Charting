package com.mvsk.smc.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvsk.smc.entities.IPO;


public interface IpoService  {

	IPO save(IPO ipo);

	Iterable<IPO> findAll();

	void deleteById(Integer id);

	Iterable<IPO> iposPlanned();

	Iterable<IPO> iposPlannedForCompany(String company_name);
	
	
}
