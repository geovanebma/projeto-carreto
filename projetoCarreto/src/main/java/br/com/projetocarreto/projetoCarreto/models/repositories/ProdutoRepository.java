package br.com.projetocarreto.projetoCarreto.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.projetocarreto.projetoCarreto.models.entidades.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
}