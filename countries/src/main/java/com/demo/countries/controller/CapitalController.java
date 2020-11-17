package com.demo.countries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.countries.data.entity.Capital;
import com.demo.countries.service.CapitalService;

@RestController
public class CapitalController {
	private CapitalService capitalService;
	
	@GetMapping("/capital")
	public String viewCapitals(Model model) {
		return "capital";
	}
	
	@GetMapping("/capitalEntry")
	public String captialForm(Model model) {
		Capital capital = new Capital();
		model.addAttribute("Capital", capital);
		return "capitalEntry";	
	}
	
	@PostMapping("/saveCapital")
	public String saveCapital(@ModelAttribute("capital") Capital capital) {
	capitalService.saveCapitalEntry(capital);
	return "redirect:/";
	}
	
}
