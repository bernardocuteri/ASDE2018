package it.unical.asde2018.spring_first_project.controllers;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	

	@GetMapping("/")
	public String goToHomePage(HttpSession session, Model model) {
		if(session.getAttribute("user")==null) {
			return "login";
		}
		model.addAttribute("currentTime", new Date());
		model.addAttribute("welcomeMessage", "Welcome "+session.getAttribute("user"));
		return "index";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
