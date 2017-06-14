package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/")
public class ProfileController {
	
	@RequestMapping
	public String showlist(){
		return "teamlist";
	}
	
	@RequestMapping(value="/showprofile")
	public String showprofile(@RequestParam Integer id){
		String name = "";
		switch(id){
		case 1:name="adati";
		break;
		case 2:name="ohata";
		break;
		case 3:name="kanemitsu";
		break;
		case 4:name="sato";
		break;
		case 5:name="shimizu";
		break;
		case 6:name="yasu";
		break;
		}
		return name;
	}

}
