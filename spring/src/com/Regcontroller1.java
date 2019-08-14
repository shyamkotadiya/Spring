package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Regcontroller1
{
	
	@RequestMapping(value="load.html" , method=RequestMethod.GET)
	public ModelAndView load()
	{
		return new ModelAndView("registration","data",new Regvo());
	}

	
	@RequestMapping(value="Registration.html" , method=RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute Regvo regvo , HttpServletRequest r , Model model)
	
	{	
		r.getSession().setAttribute("data1", regvo);
		model.addAttribute("login",  new Regvo());
		return new ModelAndView("login");	
	}
	
	@RequestMapping(value="login.html" , method=RequestMethod.POST)
	public ModelAndView verify(@ModelAttribute Regvo regvo1 , HttpSession s , Model model)
	
	{
		Regvo v=(Regvo)s.getAttribute("data1");
		if(v.getUn().equals(regvo1.getUn()) && v.getPw().equals(regvo1.getPw()))
		{
			return new ModelAndView("welcome" , "msg" , "welcome");
		}
		model.addAttribute("login",  new Regvo());
		return new ModelAndView("login");
		
		
	}
	
				
}

