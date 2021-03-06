package br.com.blindlearningcorp.banking.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView exibirDados() {
		ModelAndView mv = new ModelAndView("html/bank");
		return mv.addObject("conta", dados.findAll());
	}
	
	@RequestMapping(value = "/contas/{numero}", method = RequestMethod.GET)
	public ModelAndView buscarDado(@PathVariable int numero) {
		ModelAndView mv = new ModelAndView("html/search");
		if(numero == 0) {
			return mv.addObject("busca", dados.findAll());
		}
		return mv.addObject("busca", dados.findById(numero).orElse(null));
	}
	
	// Deleta um dado especifico, buscando pelo atributo numero
	@RequestMapping(value = "/delete/{numero}", method = RequestMethod.DELETE)
	public void deletarDado(@PathVariable int numero) {
		dados.deleteById(numero);
	}
	
	// Adiciona um novo dado pelo metodo HTTP POST
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView adicionarDado(Dados newConta) {
		ModelAndView mv = new ModelAndView("html/home");
		return mv.addObject("conta", dados.save(newConta));
	}
}
