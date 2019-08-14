package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class contoller {
	
	@RequestMapping(value="world.html" , method=RequestMethod.GET)
	public ModelAndView Hello()
	{
		String s1="YOU ARE USING BUTTON";
		return new ModelAndView("welcome","msg",s1);
	}

}
