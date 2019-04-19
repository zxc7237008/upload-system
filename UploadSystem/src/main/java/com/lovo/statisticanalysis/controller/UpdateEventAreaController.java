package com.lovo.statisticanalysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UpdateEventAreaController {
	
	@RequestMapping("/updateEventArea")
	public String updateEventArea() {
		return "update_event_area";
	}
	
}
