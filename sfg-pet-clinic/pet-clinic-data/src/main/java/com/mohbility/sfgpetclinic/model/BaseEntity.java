package com.mohbility.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author kbility
 * Date Oct 17, 2018
 */
@SuppressWarnings("serial")
public class BaseEntity implements Serializable {
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
