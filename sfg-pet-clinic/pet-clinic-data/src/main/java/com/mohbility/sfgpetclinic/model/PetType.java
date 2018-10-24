/**
 * 
 */
package com.mohbility.sfgpetclinic.model;

/**
 * @author kbility
 * Date Oct 14, 2018
 */
public class PetType extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
