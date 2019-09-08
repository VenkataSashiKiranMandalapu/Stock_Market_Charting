package com.mvsk.smc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvsk.smc.entities.IPO;
import com.mvsk.smc.repos.IpoRepos;

@Service("ipoService")
public class IpoServiceImpl implements IpoService {

	
	@Autowired
	private IpoRepos ipoRepos;
	@Override
	public IPO save(IPO ipo) {
		// TODO Auto-generated method stub
		return ipoRepos.save(ipo);
	}

	@Override
	public Iterable<IPO> findAll() {
		// TODO Auto-generated method stub
		return ipoRepos.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<IPO> iposPlanned() {
		// TODO Auto-generated method stub
		return ipoRepos.iposPlanned();
	}

	@Override
	public Iterable<IPO> iposPlannedForCompany(String company_name) {
		// TODO Auto-generated method stub
		return ipoRepos.iposPlannedForCompany(company_name);
	}

}
