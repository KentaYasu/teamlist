package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ProfileController {
	@RequestMapping("/index")
	public String index(@RequestParam Integer param, Model model) {
		if (param == 1) {
			return "adati";
		}
		if (param == 2) {
			return "adati";
		}
		if (param == 3) {
			return "adati";
		}
		if (param == 4) {
			return "adati";
		}
		if (param == 5) {
			return "adati";
		}
		if (param == 6) {
			return "adati";
		}
		return null;
	}
}
