package com.cardshifter.io.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController implements ErrorController {

	private static final String PATH = "/error";

	@RequestMapping(value = PATH)
	public ModelAndView error(HttpServletRequest request, Exception e) {
		ModelAndView mav = new ModelAndView("template");
		mav.addObject("view", "error");
		return mav;
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}
}
