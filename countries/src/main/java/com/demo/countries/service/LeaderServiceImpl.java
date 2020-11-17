package com.demo.countries.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.countries.data.entity.Leader;
import com.demo.countries.data.repository.LeaderRepository;

public abstract class LeaderServiceImpl implements LeaderService {
	
	@Autowired
	private LeaderRepository leaderRepository;
	
	@Override
	public List<Leader> getAllLeaders(){
		return leaderRepository.findAll();
		
	}
	
	@Override 
	public void saveLeaderEntry(Leader leader) {
		this.leaderRepository.save(leader);
	}
	
	@Override
	public Leader getLeaderById(int id) {
		Optional<Leader> optional = leaderRepository.findById(id);
		Leader leader = null;
		if(optional.isPresent()) {
			leader = optional.get();
		}else {
			throw new RuntimeException("Leader not found for id:" +id);
		}
		return leader;
	}
}
