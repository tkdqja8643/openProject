package com.bitcamp.op;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bitcamp.op.LoginInfo;


@Controller
@RequestMapping("/login")
public class LoginController {
	

	@RequestMapping( method=RequestMethod.GET)
	public String getIndex(	@RequestParam(value="type",defaultValue="1")String type ) {
		
		return "loginForm";
	}
	@RequestMapping( method=RequestMethod.POST)
	public String processLogin(HttpServletRequest request,
			@RequestParam("id")String userId,
			@RequestParam("pw")String userPw,
			LoginInfo info,
			Model model
			) {
		
		String id = request.getParameter("id");
		
		String pw = request.getParameter("pw");
		System.out.println("폼에서 전송된 데이터 request 객체 이용 :" + id + ":" + pw);
		System.out.println("폼에서 전송된 데이터 @RequestParam 객체이용 :" + userId + ":" + userPw);
		System.out.println("폼에서 전송된 데이터 LoginInfo 객체 이용:" + info);
		
		//model 처리 : service -> dao
		
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);

		model.addAttribute("userId",userId);
		model.addAttribute("userPw",userPw);
		model.addAttribute("loginInfo",info);
		
		return "loginok";
	}


}
