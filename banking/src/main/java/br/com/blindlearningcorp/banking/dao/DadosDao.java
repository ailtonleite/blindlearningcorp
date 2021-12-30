package br.com.blindlearningcorp.banking.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.blindlearningcorp.banking.model.Dados;

// Interface que faz a conexão com o banco de dados
public interface DadosDao extends CrudRepository<Dados, Integer>{

}
