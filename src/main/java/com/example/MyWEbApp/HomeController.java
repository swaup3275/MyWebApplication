package com.example.MyWEbApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	
	@RequestMapping("home")
	@ResponseBody
	public String home() {
		System.out.println("home pe hai?.");
		return "home-pe-aaya.jsp";
	}

}
