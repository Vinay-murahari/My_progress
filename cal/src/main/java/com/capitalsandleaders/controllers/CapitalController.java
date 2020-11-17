package com.capitalsandleaders.controllers;

import com.capitalsandleaders.data.entity.Capital;
import com.capitalsandleaders.data.repository.CapitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CapitalController {
    @Autowired
    private CapitalRepository capitalRepository;

    @GetMapping("/capital")
    public List<Capital> getAllCapitals(){
        return capitalRepository.findAll();
    }
    @PostMapping("/capital")
    public Capital allCapitals(Capital capital){
        return capitalRepository.save(capital);
    }
}

