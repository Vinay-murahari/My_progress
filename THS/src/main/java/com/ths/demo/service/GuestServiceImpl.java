package com.ths.demo.service;

import java.util.List;
import java.util.Optional;

import com.ths.demo.model.Guest;
import com.ths.demo.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	private GuestRepository guestRepository;

	@Override
	public List<Guest> getAllGuests() {
		return guestRepository.findAll();
	}
	@Override
	public void saveGuest(Guest guest){
		this.guestRepository.save(guest);
	}

	@Override
	public Guest getGuestBYId(long id) {
		return null;
	}

	@Override
	public Guest getGuestById(long id){
		Optional<Guest> optional = guestRepository.findById(id);
		Guest guest = null;
		if (optional.isPresent()){
			guest = optional.get();
		}
		else{
			throw new RuntimeException("Guest not found" +id);
		}
		return guest;
	}

	@Override
	public void deleteGuestById(long id) {

	}


}
