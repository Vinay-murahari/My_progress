package com.demo.countries.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.countries.data.entity.Capital;
import com.demo.countries.data.repository.CapitalRepository;

@Service
public abstract class CapitalServiceImpl implements CapitalService{

	@Autowired
	private CapitalRepository capitalRepository;
	
	@Override
	public List<Capital> getAll(){
		return capitalRepository.findAll();
	}
	
	@Override
	public void saveCapitalEntry(Capital capital) {
		this.capitalRepository.save(capital);
	}
	
	@Override
	public Capital getCapitalById(int id) {
		Optional<Capital> optional = capitalRepository.findById(id);
		Capital capital = null;
		if(optional.isPresent()) {
			capital = optional.get();
		}else {
			throw new RuntimeException("Capital not found for id:" + id);
		}
		return capital;
	}
	
}