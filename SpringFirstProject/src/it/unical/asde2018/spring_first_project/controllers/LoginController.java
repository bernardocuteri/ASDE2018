package it.unical.asde2018.spring_first_project.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@PostMapping("login")
	public String performLogin(HttpSession session, Model model, @RequestParam String username, @RequestParam String password) {
		
		
		if(username.equals("ciccio") && password.equals("ciccio")) {
			session.setAttribute("user", username);
			return "redirect:/";
		}
		model.addAttribute("error", "Wrong credentials!!");
		return "login";
	}
}
