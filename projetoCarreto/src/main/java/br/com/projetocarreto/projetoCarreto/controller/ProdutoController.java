package br.com.projetocarreto.projetoCarreto.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetocarreto.projetoCarreto.models.entidades.Produto;
import br.com.projetocarreto.projetoCarreto.models.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public @ResponseBody Produto novoProduto(
			@Valid @RequestParam String nome,
			@Valid @RequestParam double comprimento,
			@Valid @RequestParam double largura,
			@Valid @RequestParam double altura,
			@Valid @RequestParam double peso
	) {
		Produto produto = new Produto(nome, comprimento, largura, altura, peso);
		produtoRepository.save(produto);
		return produto;
	}
	
	/*SIMPLIFICANDO O MÉTODO ACIMA - Ele recebe os parâmetros e aloca direitinho conforme alinhado na tabela
	 @PostMapping
		public @ResponseBody Produto novoProduto(Produto produto) {
			produtoRepository.save(produto);
			return produto;
		}
	 */
}
