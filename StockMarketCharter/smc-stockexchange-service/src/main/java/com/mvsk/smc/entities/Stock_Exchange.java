package com.mvsk.smc.entities;


import java.util.Arrays;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Stock_Exchange")
public class Stock_Exchange {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String brief;
	private String address;
	private String remark;
	public Stock_Exchange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock_Exchange(int id, String name, String brief, String address, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.brief = brief;
		this.address = address;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Stock_Exchange [id=" + id + ", name=" + name + ", brief=" + brief + ", address=" + address + ", remark="
				+ remark + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
