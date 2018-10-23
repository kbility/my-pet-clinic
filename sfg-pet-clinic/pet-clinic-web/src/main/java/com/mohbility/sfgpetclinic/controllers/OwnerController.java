package com.mohbility.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kbility
 * Date Oct 23, 2018
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	@RequestMapping({"","/", "/index", "/index.html"})
	public String listOwners() {
		return "owners/index";
	}

}
