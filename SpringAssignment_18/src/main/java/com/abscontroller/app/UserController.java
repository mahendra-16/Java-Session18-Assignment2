package com.abscontroller.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class UserController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		String name = "Jeetendra";
		int age = 29;
		String specialist = "Android and Java";
		
		ModelAndView mav = new ModelAndView("show");
		mav.addObject("message", "Hello World");
		mav.addObject("msg", name);
		mav.addObject("age", age);
		mav.addObject("spct", specialist);
		
		return mav;
	}

}
