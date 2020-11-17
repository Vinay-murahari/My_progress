package com.demo.countries.service;

import java.util.List;

import com.demo.countries.data.entity.Leader;

public interface LeaderService {
	List<Leader> getAllLeaders();
	void saveLeaderEntry(Leader leader);
	Leader getLeaderById(int id);

}
