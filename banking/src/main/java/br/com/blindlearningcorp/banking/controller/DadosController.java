package br.com.blindlearningcorp.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.blindlearningcorp.banking.dao.DadosDao;
import br.com.blindlearningcorp.banking.model.Dados;

// Classe de controle de dados
@RestController
public class DadosController {
	
	// Chama a classe DadosDao 
	@Autowired
	private DadosDao dados;
	
	// Metodo que exibe todos os dados, com o endpoint /contas de metodo GET
	@RequestMapping(value = "/contas", method = RequestMethod.GET)
	public List<Dados> exibirDados(){
		return (List<Dados>)dados.findAll();
	}
	
	// Metodo que exibe um dado especifico, buscando pelo atributo numero
	@RequestMapping(value = "/contas/{numero}", method = RequestMethod.GET)
	public Dados buscarDado(@PathVariable int numero) {
		return dados.findById(numero).orElse(null);
	}
	
	// Deleta um dado especifico, buscando pelo atributo numero
	@RequestMapping(value = "/delete/{numero}", method = RequestMethod.DELETE)
	public void deletarDado(@PathVariable int numero) {
		dados.deleteById(numero);
	}
	
	// Adiciona um novo dado pelo metodo HTTP POST
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void adicionarDado(@RequestBody Dados newConta) {
		dados.save(newConta);
	}
}
