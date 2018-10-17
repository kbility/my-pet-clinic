/**
 * 
 */
package com.mohbility.sfgpetclinic.model;

/**
 * @author kbility
 * Date Oct 14, 2018
 */
@SuppressWarnings("serial")
public class PetType extends BaseEntity {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
