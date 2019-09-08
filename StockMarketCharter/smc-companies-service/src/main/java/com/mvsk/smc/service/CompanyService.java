package com.mvsk.smc.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvsk.smc.entities.Company;

public interface CompanyService {

	Company save(Company company);

	Iterable<Company> findAll();

	void deleteById(String id);

}
