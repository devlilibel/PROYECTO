package pe.edu.upc.avinka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.avinka.model.entity.Product;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping("/")
	public String indexGet(Model model) {
		Product productSearch = new Product();
		model.addAttribute("productSearch",productSearch);
		return "index";
	}
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
	
	@GetMapping("access-denied")
	public String accessDenied() {
		return "access-denied";
	}
	
	
}
