package com.mvsk.smc.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mvsk.smc.entities.Stock;

@Repository("stockRepos")
public interface StockRepository extends JpaRepository<com.mvsk.smc.entities.Stock, Integer> {

	@Transactional
	@Query(value = "SELECT * FROM stock WHERE company_name = :company_name", nativeQuery = true)
	List<Stock> getStockbyName(@Param("company_name") String company_name);

	@Transactional

	@Query(value = "SELECT * FROM stock  WHERE company_name = :company_name AND date BETWEEN :week AND :date", nativeQuery = true)
	List<Stock> stockDetailsWeek(@Param("company_name") String company_name, @Param("date") LocalDate date,
			@Param("week") LocalDate week);

	/*
	 * @Transactional
	 * 
	 * @Query(
	 * value="SELECT * FROM stock  WHERE company_name = ':company_name' AND date BETWEEN '2019-08-21' AND '2019-08-28'"
	 * ,nativeQuery= true ) List<Stock> stockDetailsWeek(@Param("company_name")
	 * String company_name , @Param("date")LocalDate date, @Param("week")LocalDate
	 * week );
	 */

	@Transactional

	@Query(value = "SELECT * FROM stock WHERE company_name = :company_name AND date BETWEEN :month AND :date", nativeQuery = true)
	List<Stock> stockDetailsMonth(@Param("company_name") String company_name, @Param("date") LocalDate date,
			@Param("month") LocalDate month);

	@Transactional

	@Query(value = "SELECT * FROM stock WHERE company_name = :company_name AND date BETWEEN :year AND :date", nativeQuery = true)
	List<Stock> stockDetailsYear(@Param("company_name") String company_name, @Param("date") LocalDate date,
			@Param("year") LocalDate year);
}
