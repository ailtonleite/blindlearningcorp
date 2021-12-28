package br.com.blindlearningcorp.banking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Classe teste de controle
@RestController
public class TesteController {
	
	//metodo GET que retorna na tela uma string
	//http://localhost:8080/teste
	@GetMapping("/teste")
	public String helloWorld(){
		return "Olá mundo!";
	}
}
