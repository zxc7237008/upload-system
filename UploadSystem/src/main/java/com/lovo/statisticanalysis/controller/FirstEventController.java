package com.lovo.statisticanalysis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lovo.statisticanalysis.entity.EventAreaEntity;
import com.lovo.statisticanalysis.entity.FirstEventEntity;
import com.lovo.statisticanalysis.service.IFirstEventService;
@RequestMapping("event/")
@Controller
public class FirstEventController {
	
	@Autowired
	private IFirstEventService firstEventService;
	
	@RequestMapping("/getEventState")
	public ModelAndView getEventState(String state) {
		ModelAndView mv = new ModelAndView("home");
		
		int eventState = Integer.parseInt(state);
		List<FirstEventEntity> list =  firstEventService.findFirstEventByEventState(eventState);
		mv.addObject("list", list);
		
		return mv;
	}
	
	@RequestMapping("first")
	public ModelAndView loginF() {
		ModelAndView mv = new ModelAndView("first_report");
		return mv;
	}
	
	@RequestMapping("getArea")
	@ResponseBody
	public List<EventAreaEntity> getArea() {
		
		
		List<EventAreaEntity> list = new ArrayList<EventAreaEntity>();
		
		for(int i=0; i < 5; i++) {
			EventAreaEntity area = new EventAreaEntity();
			area.setAreaName(i+"");
			list.add(area);
		}
		return list;
	}
	
}
