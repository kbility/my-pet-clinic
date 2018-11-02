package com.mohbility.sfgpetclinic.model;

/**
 * @author kbility
 * Date Nov 2, 2018
 */
@SuppressWarnings("serial")
public class Specialty extends BaseEntity{
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
