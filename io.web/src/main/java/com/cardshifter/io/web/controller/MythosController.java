package com.cardshifter.io.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/mythos")
@Controller
public class MythosController {
	private static final String MYTHOS_TEMPLATE = "/mythos/template";
	
	// General links
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("view","index");
		return MYTHOS_TEMPLATE;
	}
	@RequestMapping(value = "/game-rules", method = RequestMethod.GET)
	public String gameRules(Model model) {
		model.addAttribute("view","game-rules");
		return MYTHOS_TEMPLATE;
	}
	
	// Cards links
	@RequestMapping(value = "/cards", method = RequestMethod.GET)
	public String cards(Model model) {
		model.addAttribute("view","cards");
		return MYTHOS_TEMPLATE;
	}
	
	// Story links
	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public String story(Model model) {
		model.addAttribute("view","story");
		return MYTHOS_TEMPLATE;
	}

	// template link for reference only
		@RequestMapping(value = "/page-template", method = RequestMethod.GET)
	public String pageTemplate(Model model) {
		model.addAttribute("view","page-template");
		return MYTHOS_TEMPLATE;
	}
}
