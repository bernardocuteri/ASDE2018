package it.unical.asde2018.blog.components.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.unical.asde2018.blog.components.services.BlogService;

@Controller
public class IndexController {

	@Autowired
	private BlogService blogService;
	
	@GetMapping("/")
	public String goToIndex(Model model) {
		model.addAttribute("posts", blogService.getAllPosts());
		return "index";
	}
}
