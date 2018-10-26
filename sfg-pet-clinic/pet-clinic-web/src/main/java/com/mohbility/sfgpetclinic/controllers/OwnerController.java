package com.mohbility.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mohbility.sfgpetclinic.services.OwnerService;

/**
 * @author kbility
 * Date Oct 23, 2018
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {
	private final OwnerService ownerService;
		
	/**
	 * @param ownerService
	 */
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}



	@RequestMapping({"","/", "/index", "/index.html"})
	public String listOwners(Model model) {
		
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}

}
