package com.lovo.statisticanalysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventAreaController {
	
	@RequestMapping("/eventArea")
	public String eventArea() {
		return "event_area";
	}
	
}
