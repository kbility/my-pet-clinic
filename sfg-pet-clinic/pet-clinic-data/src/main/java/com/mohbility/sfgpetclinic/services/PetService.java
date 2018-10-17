package com.mohbility.sfgpetclinic.services;

import java.util.Set;

import com.mohbility.sfgpetclinic.model.Pet;

/**
 * @author kbility
 * Date Oct 17, 2018
 */
public interface PetService {
	
	Pet findById(long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
	
}
