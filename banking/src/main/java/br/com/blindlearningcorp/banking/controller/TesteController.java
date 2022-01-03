package br.com.blindlearningcorp.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Classe teste de controle
@Controller
public class TesteController {
	
	// metodo GET que retorna na tela uma string
	// http://localhost:8080/teste
	@GetMapping("/teste")
	public String helloWorld(){
		return "html/teste";
	}
}
