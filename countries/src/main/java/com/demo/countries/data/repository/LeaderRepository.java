package com.demo.countries.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.countries.data.entity.Leader;

public interface LeaderRepository extends JpaRepository <Leader, Integer>{
}
