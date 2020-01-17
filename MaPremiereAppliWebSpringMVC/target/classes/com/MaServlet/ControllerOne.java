package com.MaServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerOne {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		int k=  i+j;
		
		AddService as = new AddService();
		int k = as.add(i,j);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",k);
		mv.setViewName("display.jsp");
		return mv;
	}
}
