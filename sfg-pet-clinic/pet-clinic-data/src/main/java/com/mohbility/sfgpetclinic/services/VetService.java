package com.mohbility.sfgpetclinic.services;

import java.util.Set;

import com.mohbility.sfgpetclinic.model.Vet;

/**
 * @author kbility
 * Date Oct 17, 2018
 */
public interface VetService {
	
	Vet findById(long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();

}
