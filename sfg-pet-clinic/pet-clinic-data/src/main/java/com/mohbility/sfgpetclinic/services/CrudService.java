package com.mohbility.sfgpetclinic.services;

import java.util.Set;

/**
 * @author kbility
 * Date Oct 21, 2018
 */
public interface CrudService<T, ID> {
	
	Set<T> findAll();
	
	T findById(ID id);
	
	T save(T object);
	
	void delete(T object);
	
	void deleteById(ID id);
	
}
