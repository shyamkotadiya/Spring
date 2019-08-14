package com.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Regvo;
import com.dao.Regdao;

@Controller
public class Regcontroller {
	@Autowired
	Regdao d=new Regdao();
	@RequestMapping(value="load.html" , method=RequestMethod.GET)
	public ModelAndView load()
	{
		return new ModelAndView("sregistration","data",new Regvo());
	}
	
	@RequestMapping(value="save.html" , method=RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute Regvo vo)
	{
		
		d.insert(vo);
		return  new ModelAndView("sregistration","data",new Regvo());
		
	}

}
