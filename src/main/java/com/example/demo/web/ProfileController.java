package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ProfileController {
	
	@RequestMapping("/index")
	public String index() {
		return "teamlist";
	}

	@RequestMapping("/member")
	public String index(@RequestParam Integer id, Model model) {
		System.out.println("param=" + id);
		if (id == 1) {
			return "adati";
		}
		if (id == 2) {
			return "ohata";
		}
		if (id == 3) {
			return "kanemitsu";
		}
		if (id == 4) {
			return "sato";
		}
		if (id == 5) {
			return "shimizu";
		}
		if (id == 6) {
			return "yasu";
		}
		return null;
	}
}
