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
	
	@RequestMapping(value = "/play-cardshifter",method = RequestMethod.GET)
	public String playCardshifter(Model model) {
		return "play-cardshifter";
	}
	
	@RequestMapping(value = "/news",method = RequestMethod.GET)
	public String news(Model model) {
		return "news";
	}
	
	@RequestMapping(value = "/project",method = RequestMethod.GET)
	public String project(Model model) {
		return "project";
	}

	@RequestMapping(value = "/contributors",method = RequestMethod.GET)
	public String contributors(Model model) {
		return "contributors";
	}
	
	@RequestMapping(value = "/images",method = RequestMethod.GET)
	public String images(Model model) {
		return "images";
	}
	
	@RequestMapping(value = "/contribute",method = RequestMethod.GET)
	public String contribute(Model model) {
		return "contribute";
	}
	
	@RequestMapping(value = "/mods",method = RequestMethod.GET)
	public String mods(Model model) {
		return "mods";
	}
	
	@RequestMapping(value = "/cyborg-chronicles",method = RequestMethod.GET)
	public String cyborgChronicles(Model model) {
		return "cyborg-chronicles";
	}
	
	@RequestMapping(value = "/new-mod",method = RequestMethod.GET)
	public String newMod(Model model) {
		return "new-mod";
	}
	
	@RequestMapping(value = "/contact-us",method = RequestMethod.GET)
	public String ContactUs(Model model) {
		return "contact-us";
	}
	
	@RequestMapping(value = "/report-bug",method = RequestMethod.GET)
	public String reportBug(Model model) {
		return "report-bug";
	}
	
	@RequestMapping(value = "/feature-request",method = RequestMethod.GET)
	public String featureRequest(Model model) {
		return "feature-request";
	}
	
}