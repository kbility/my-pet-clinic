package com.mohbility.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kbility
 * Date Oct 23, 2018
 */

@Controller
public class VetController {
	
	@RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
	public String listVets() {
		return "vets/index";
	}

}
