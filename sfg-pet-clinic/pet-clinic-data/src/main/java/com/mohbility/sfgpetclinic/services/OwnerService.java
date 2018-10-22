package com.mohbility.sfgpetclinic.services;

import com.mohbility.sfgpetclinic.model.Owner;;

/**
 * @author kbility
 * Date Oct 17, 2018
 */
public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
}
