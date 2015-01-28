package com.cardshifter.io.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/")
@Controller
public class StaticController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping(value = "/contributors",method = RequestMethod.GET)
	public String contributors(Model model) {
		return "contributors";
	}
	
	@RequestMapping(value = "/mods",method = RequestMethod.GET)
	public String mods(Model model) {
		return "mods";
	}
	
	@RequestMapping(value = "/contribute",method = RequestMethod.GET)
	public String contribute(Model model) {
		return "contribute";
	}
	
}
