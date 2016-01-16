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
		model.addAttribute("view", "play-cardshifter");
		return "template";
	}
	
	@RequestMapping(value = "/news",method = RequestMethod.GET)
	public String news(Model model) {
		model.addAttribute("view", "news");
		return "template";
	}
	
	@RequestMapping(value = "/overview",method = RequestMethod.GET)
	public String overview(Model model) {
		model.addAttribute("view", "overview");
		return "template";
	}
	
	@RequestMapping(value = "/project",method = RequestMethod.GET)
	public String project(Model model) {
		model.addAttribute("view", "project");
		return "template";
	}

	@RequestMapping(value = "/contributors",method = RequestMethod.GET)
	public String contributors(Model model) {
		model.addAttribute("view", "contributors");
		return "template";
	}
	
	@RequestMapping(value = "/screenshots",method = RequestMethod.GET)
	public String screenshots(Model model) {
		model.addAttribute("view", "screenshots");
		return "template";
	}
	
	@RequestMapping(value = "/contribute",method = RequestMethod.GET)
	public String contribute(Model model) {
		model.addAttribute("view", "contribute");
		return "template";
	}
	
	@RequestMapping(value = "/mods",method = RequestMethod.GET)
	public String mods(Model model) {
		model.addAttribute("view", "mods");
		return "template";
	}
	
	@RequestMapping(value = "/new-mod",method = RequestMethod.GET)
	public String newMod(Model model) {
		model.addAttribute("view", "new-mod");
		return "template";
	}
	
}
