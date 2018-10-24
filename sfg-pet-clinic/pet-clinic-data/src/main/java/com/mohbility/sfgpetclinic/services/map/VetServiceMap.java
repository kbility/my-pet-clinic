package com.mohbility.sfgpetclinic.services.map;

import java.util.Set;

import com.mohbility.sfgpetclinic.model.Vet;
import com.mohbility.sfgpetclinic.services.VetService;

/**
 * @author kbility
 * Date Oct 21, 2018
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	 @Override
	    public Set<Vet> findAll() {
	        return super.findAll();
	    }

	    @Override
	    public Vet findById(Long id) {
	        return super.findById(id);
	    }

	    @Override
	    public Vet save(Vet object) {
	    	return super.save(object.getId(), object);	        
	    }

	    @Override
	    public void delete(Vet object) {
	        super.delete(object);
	    }

	    @Override
	    public void deleteById(Long id) {
	        super.deleteById(id);
	    }

}
