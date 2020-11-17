package com.ths.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ths.demo.model.Guest;
import com.ths.demo.service.GuestService;

@Controller

public class GuestController {

	@Autowired
	private GuestService guestService;
	
	@GetMapping("/")
	public String home() {
		return "index";
		
	}
	
	
	@GetMapping("/newBookingForm")
	public String newBookingForm(Model model) {
		Guest guest = new Guest();
		model.addAttribute("guest", guest);
		return "guestBookingForm";
	}
	
	@PostMapping("/saveGuest")
	public String saveGuest(@ModelAttribute("guest") Guest guest) {
		guestService.saveGuest(guest);
		return "redirect:/";
	}
	
	@GetMapping("/guestUpdate/{id}")
	public String guestUpdate(@PathVariable ( value = "id") long id, Model model) {

		Guest guest = guestService.getGuestBYId(id);
		model.addAttribute("guest", guest);
		return "update_guest";
	}
	
	@GetMapping("/deleteGuest/{id}")
	public String deleteEmployee(@PathVariable (value = "id") long id) {

		this.guestService.deleteGuestById(id);
		return "redirect:/";
	}

}
