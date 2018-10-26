package com.mohbility.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mohbility.sfgpetclinic.services.VetService;

/**
 * @author kbility
 * Date Oct 23, 2018
 */

@Controller
public class VetController {
	
	private final VetService vetService;
	
	/**
	 * @param vetService
	 */
	public VetController(VetService vetService) {
	 this.vetService = vetService;
	}

	@RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
	public String listVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}

}
