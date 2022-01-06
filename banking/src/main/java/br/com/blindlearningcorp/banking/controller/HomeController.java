package br.com.blindlearningcorp.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.blindlearningcorp.banking.model.Dados;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String homePage(Model model) {
		model.addAttribute("dados", new Dados());
		return "html/home";
	}
}
