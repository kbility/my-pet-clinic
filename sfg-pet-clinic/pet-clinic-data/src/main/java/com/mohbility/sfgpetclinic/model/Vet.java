package com.mohbility.sfgpetclinic.model;

import java.util.Set;

/**
 * @author kbility
 * Date Oct 14, 2018
 */
@SuppressWarnings("serial")
public class Vet extends Person {

	private Set<Specialty> specialties;

	public Set<Specialty> getSpecialties() {
		return specialties;
	}

	public void setSpecialties(Set<Specialty> specialties) {
		this.specialties = specialties;
	}

}
