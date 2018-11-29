package com.firstone.controller;

import com.firstone.controller.loginbean;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("l") loginbean l) {
		if (l.getPass().equals("123"))
			return "sucess";
		else
			return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView viewPage() {

		return new ModelAndView("index");
	}
}
