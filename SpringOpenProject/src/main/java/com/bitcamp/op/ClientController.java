package com.bitcamp.op;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {
	
	@RequestMapping("client")
	public String getIndex() {
		
		return "client";
	}

}
