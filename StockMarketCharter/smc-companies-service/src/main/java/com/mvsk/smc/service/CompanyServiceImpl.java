package com.mvsk.smc.service;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.mvsk.smc.entities.Company;
import com.mvsk.smc.repos.CompanyRepos;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepos companyRepos;
	
	@Override
	public Company save(Company company) {
		// TODO Auto-generated method stub
		return companyRepos.save(company);
	}

	@Override
	public Iterable<Company> findAll() {
		// TODO Auto-generated method stub
		return companyRepos.findAll();
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		companyRepos.deleteByname(id);
	}

}
