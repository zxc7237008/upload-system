package com.lovo.statisticanalysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventTypeController {
	
	@RequestMapping("/eventType")
	public String eventType() {
		return "event_type";
	}
	
}
