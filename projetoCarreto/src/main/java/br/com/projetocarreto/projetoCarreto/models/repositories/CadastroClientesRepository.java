package br.com.projetocarreto.projetoCarreto.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.projetocarreto.projetoCarreto.models.entidades.CadastroCliente;

public interface CadastroClientesRepository extends CrudRepository<CadastroCliente, Integer>{
	
}