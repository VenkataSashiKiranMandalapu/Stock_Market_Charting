package com.mvsk.smc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mvsk.smc.entities.IPO;


@Repository("ipoRepos")
public interface IpoRepos extends JpaRepository<IPO, Integer> {
	
	@Transactional
	@Query(value = "SELECT * FROM ipo ORDER BY open_date ASC",nativeQuery = true)
	 Iterable<IPO> iposPlanned();
	
	@Transactional
	@Query(value = "SELECT * FROM ipo WHERE company_name = :company_name ORDER BY open_date ASC",nativeQuery = true)
	 Iterable<IPO> iposPlannedForCompany(@Param("company_name") String company_name);

}
