package com.citibank.citibank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_det")

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cusid;
	
	@Column(name = "cus_Name")
	private String cusName;
	@Column(name = "cus_Age")
	private int cusAge;
	@Column(name = "cus_Addres")
	private String cusAddres;
	public long getCusid() {
		return cusid;
	}
	public void setCusid(long cusid) {
		this.cusid = cusid;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public int getCusAge() {
		return cusAge;
	}
	public void setCusAge(int cusAge) {
		this.cusAge = cusAge;
	}
	public String getCusAddres() {
		return cusAddres;
	}
	public void setCusAddres(String cusAddres) {
		this.cusAddres = cusAddres;
	}
	
	
	
}
