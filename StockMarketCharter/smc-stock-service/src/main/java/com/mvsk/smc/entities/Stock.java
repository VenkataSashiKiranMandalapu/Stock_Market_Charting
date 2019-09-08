package com.mvsk.smc.entities;

import java.util.Date; 
import java.sql.Time;
import java.time.LocalDate;
import java.util.Arrays;
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Stock")
public class Stock {
	@Id
	private int stock_id;
	
	private String company_name;
	
	
	private int stock_exchange_id;
	private int current_price;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")  
	@Past
	private LocalDate date;

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(int stock_id, String company_name, int stock_exchange_id, int current_price, @Past LocalDate date) {
		super();
		this.stock_id = stock_id;
		this.company_name = company_name;
		this.stock_exchange_id = stock_exchange_id;
		this.current_price = current_price;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Stock [stock_id=" + stock_id + ", company_name=" + company_name + ", stock_exchange_id="
				+ stock_exchange_id + ", current_price=" + current_price + ", date=" + date + "]";
	}

	public int getStock_id() {
		return stock_id;
	}

	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public int getStock_exchange_id() {
		return stock_exchange_id;
	}

	public void setStock_exchange_id(int stock_exchange_id) {
		this.stock_exchange_id = stock_exchange_id;
	}

	public int getCurrent_price() {
		return current_price;
	}

	public void setCurrent_price(int current_price) {
		this.current_price = current_price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
