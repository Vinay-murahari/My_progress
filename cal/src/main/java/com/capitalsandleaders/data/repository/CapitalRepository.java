package com.capitalsandleaders.data.repository;

import com.capitalsandleaders.data.entity.Capital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CapitalRepository extends JpaRepository<Capital, Integer> {
    List<Capital> findAll();
}
