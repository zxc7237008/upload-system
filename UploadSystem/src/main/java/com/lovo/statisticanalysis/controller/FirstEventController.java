package com.lovo.statisticanalysis.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lovo.statisticanalysis.entity.FirstEventEntity;
import com.lovo.statisticanalysis.service.IFirstEventService;

@Controller
public class FirstEventController {
	
	private IFirstEventService firstEventService;
	
	@RequestMapping("/getEventState")
	public ModelAndView getEventState(String state) {
		ModelAndView mv = new ModelAndView("home");
		
		int eventState = Integer.parseInt(state);
		List<FirstEventEntity> list =  firstEventService.findFirstEventByEventState(eventState);
		mv.addObject("list", list);
		
		return mv;
	}
	
}
