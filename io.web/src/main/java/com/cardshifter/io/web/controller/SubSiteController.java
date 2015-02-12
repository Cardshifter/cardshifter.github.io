package com.cardshifter.io.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/{subSite}")
@Controller
public class SubSiteController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model, @PathVariable("subSite") String subSite) {
		return subSite + "/index";
	}
	
	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public String story(Model model, @PathVariable("subSite") String subSite) {
		model.addAttribute("subSite", subSite);
		return subSite + "/story";
	}

}
