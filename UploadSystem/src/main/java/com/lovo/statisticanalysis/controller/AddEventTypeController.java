package com.lovo.statisticanalysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddEventTypeController {
	
	@RequestMapping("/addEventType")
	public String addEventType() {
		return "add_event_type";
	}
	
}
