package com.bitcamp.op;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Client_agreeController {
	
	@RequestMapping("client_agree")
	public String getIndex() {
		
		return "client_agree";
	}

}
