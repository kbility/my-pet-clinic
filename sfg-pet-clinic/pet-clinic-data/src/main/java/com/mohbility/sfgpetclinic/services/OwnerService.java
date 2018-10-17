package com.mohbility.sfgpetclinic.services;

import java.util.Set;

import com.mohbility.sfgpetclinic.model.Owner;;

/**
 * @author kbility
 * Date Oct 17, 2018
 */
public interface OwnerService {
	
	Owner findById(long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();

}
