package com.mohbility.sfgpetclinic.model;

/**
 * @author kbility
 * Date Oct 14, 2018
 */
@SuppressWarnings("serial")
public class Person extends BaseEntity {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
