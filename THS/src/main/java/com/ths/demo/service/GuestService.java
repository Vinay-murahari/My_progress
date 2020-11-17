package com.ths.demo.service;

import java.util.List;

import com.ths.demo.model.Guest;

public interface GuestService {
	List<Guest> getAllGuests();
	void saveGuest(Guest guest);
	Guest getGuestBYId(long id);

	Guest getGuestById(long id);

	void deleteGuestById(long id);
	}
