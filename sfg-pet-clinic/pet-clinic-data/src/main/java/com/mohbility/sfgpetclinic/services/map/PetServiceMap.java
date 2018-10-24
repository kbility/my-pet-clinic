package com.mohbility.sfgpetclinic.services.map;

import java.util.Set;

import com.mohbility.sfgpetclinic.model.Pet;
import com.mohbility.sfgpetclinic.services.PetService;

/**
 * @author kbility
 * Date Oct 21, 2018
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	 @Override
	    public Set<Pet> findAll() {
	        return super.findAll();
	    }

	    @Override
	    public Pet findById(Long id) {
	        return super.findById(id);
	    }

	    @Override
	    public Pet save(Pet object) {
	    	return super.save(object.getId(), object);	        
	    }

	    @Override
	    public void delete(Pet object) {
	        super.delete(object);
	    }

	    @Override
	    public void deleteById(Long id) {
	        super.deleteById(id);
	    }

}
