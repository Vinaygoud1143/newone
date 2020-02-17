package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Mycontroller {

	
	@RequestMapping("/hello")
	public String getmessage() {
		return "hello this is vinay";
	}
}
