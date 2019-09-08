package com.mvsk.smc.entities;

import java.sql.Date;   
import java.sql.Time;
import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="IPO")
public class IPO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String company_name;
	private String stock_exchange;
	private int price_per_share;
	private int total_no_of_shares;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")  
	@DateTimeFormat(pattern="dd-MM-yyyy")
	@Past
	private LocalDate open_date;
	private String remark;
	public IPO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IPO(int id, String company_name, String stock_exchange, int price_per_share, int total_no_of_shares,
			@Past LocalDate open_date, String remark) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.stock_exchange = stock_exchange;
		this.price_per_share = price_per_share;
		this.total_no_of_shares = total_no_of_shares;
		this.open_date = open_date;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "IPO [id=" + id + ", company_id=" + company_name + ", stock_exchange=" + stock_exchange
				+ ", price_per_share=" + price_per_share + ", total_no_of_shares=" + total_no_of_shares + ", open_date="
				+ open_date + ", remark=" + remark + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_id(String company_name) {
		this.company_name = company_name;
	}
	public String getStock_exchange() {
		return stock_exchange;
	}
	public void setStock_exchange(String stock_exchange) {
		this.stock_exchange = stock_exchange;
	}
	public int getPrice_per_share() {
		return price_per_share;
	}
	public void setPrice_per_share(int price_per_share) {
		this.price_per_share = price_per_share;
	}
	public int getTotal_no_of_shares() {
		return total_no_of_shares;
	}
	public void setTotal_no_of_shares(int total_no_of_shares) {
		this.total_no_of_shares = total_no_of_shares;
	}
	public LocalDate getOpen_date() {
		return open_date;
	}
	public void setOpen_date(LocalDate open_date) {
		this.open_date = open_date;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
