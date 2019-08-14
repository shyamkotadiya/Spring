package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jdk.nashorn.internal.ir.RuntimeNode.Request;



@Controller
public class controllerL {
	@RequestMapping(value="login.html" , method=RequestMethod.GET)
	public ModelAndView verify(HttpServletRequest r)
	{
		String s1=r.getParameter("un");
		String s2=r.getParameter("pw");
		
		if(s1.equals("admin") && s2.equals("admin"))
		{
			return new ModelAndView("welcome","msg","LOGIN SUCCESFULL");	
		}else
		{
			return new ModelAndView("redirect:/login.jsp");
		
		}
	}

}
