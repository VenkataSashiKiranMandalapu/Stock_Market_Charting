package com.mvsk.smc.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Company {

	@Id
	@Column(name="name")
	private String name;
	
	private int ipo_id;
	
	private int turnover;
	
	private String ceo;
	
	private String[] board_of_directors;
	
	private String[] listed_stock_exchange;

	
	private int sector_id;
	
	private String brief_writing;
	
	//@JsonIgnore
	private int[] stock_id;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", ipo_id=" + ipo_id + ", turnover=" + turnover + ", ceo=" + ceo
				+ ", board_of_directors=" + board_of_directors + ", listed_stock_exchange=" + listed_stock_exchange
				+ ", sector_id=" + sector_id + ", brief_writing=" + brief_writing + ", stock_id=" + stock_id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIpo_id() {
		return ipo_id;
	}

	public void setIpo_id(int ipo_id) {
		this.ipo_id = ipo_id;
	}

	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String[] getBoard_of_directors() {
		return board_of_directors;
	}

	public void setBoard_of_directors(String[] board_of_directors) {
		this.board_of_directors = board_of_directors;
	}

	public String[] getListed_stock_exchange() {
		return listed_stock_exchange;
	}

	public void setListed_stock_exchange(String[] listed_stock_exchange) {
		this.listed_stock_exchange = listed_stock_exchange;
	}

	public int getSector_id() {
		return sector_id;
	}

	public void setSector_id(int sector_id) {
		this.sector_id = sector_id;
	}

	public String getBrief_writing() {
		return brief_writing;
	}

	public void setBrief_writing(String brief_writing) {
		this.brief_writing = brief_writing;
	}

	public int[] getStock_id() {
		return stock_id;
	}

	public void setStock_id(int[] stock_id) {
		this.stock_id = stock_id;
	}

	public Company(String name, int ipo_id, int turnover, String ceo, String[] board_of_directors,
			String[] listed_stock_exchange, int sector_id, String brief_writing, int[] stock_id) {
		super();
		this.name = name;
		this.ipo_id = ipo_id;
		this.turnover = turnover;
		this.ceo = ceo;
		this.board_of_directors = board_of_directors;
		this.listed_stock_exchange = listed_stock_exchange;
		this.sector_id = sector_id;
		this.brief_writing = brief_writing;
		this.stock_id = stock_id;
	}

	

	
}
