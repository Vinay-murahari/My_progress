package com.demo.countries.service;

import java.util.List;

import com.demo.countries.data.entity.Capital;

public interface CapitalService {
	void saveCapitalEntry(Capital capital);
	Capital getCapitalById(int id);
	List<Capital> getAll();
}
