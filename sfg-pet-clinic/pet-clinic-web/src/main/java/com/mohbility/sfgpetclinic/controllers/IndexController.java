package com.mohbility.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kbility
 * Date Oct 22, 2018
 */
@Controller
public class IndexController {
	
	@RequestMapping({"","/", "index", "index.html"})
	public String index() {
		return "index";
	}

}
