package com.demo.countries.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.countries.data.entity.Capital;

public interface CapitalRepository  extends JpaRepository<Capital, Integer >{

}
