package com.demo.countries.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "capital")
public class Capital {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="Country_Name")
	private String countryName;
	
	@Column(name="Country_Capital")
	private String countryCapital;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	
	

}
