/**
 * 
 */
package com.mohbility.sfgpetclinic.model;

import java.util.Set;

/**
 * @author kbility
 * Date Oct 14, 2018
 */
@SuppressWarnings("serial")
public class Owner extends Person {

	
	private Set<Pet> pets;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	
		

}
