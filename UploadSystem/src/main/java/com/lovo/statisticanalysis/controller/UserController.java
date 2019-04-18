package com.lovo.statisticanalysis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lovo.statisticanalysis.entity.UserEntity;
import com.lovo.statisticanalysis.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/getHome")
	public ModelAndView getHome(HttpServletRequest request,String userId) {
		ModelAndView mv = new ModelAndView("home");
		
		String id = (String) request.getSession().getAttribute("userId");
		UserEntity user = userService.findUserByUserId(id);
		mv.addObject("user", user);
		
		return mv;
	}
	
	
}
