package com.mohbility.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.mohbility.sfgpetclinic.model.PetType;
import com.mohbility.sfgpetclinic.services.PetTypeService;

/**
 * @author kbility
 * Date Nov 2, 2018
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService{
	
	@Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
    	return super.save(object);	        
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}
