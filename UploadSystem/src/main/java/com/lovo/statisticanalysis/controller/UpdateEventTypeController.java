package com.lovo.statisticanalysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UpdateEventTypeController {
	
	@RequestMapping("/updateEventType")
	public String updateEventType() {
		return "update_event_type";
	}
	
}
