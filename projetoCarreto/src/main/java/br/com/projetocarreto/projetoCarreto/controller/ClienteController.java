package br.com.projetocarreto.projetoCarreto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetocarreto.projetoCarreto.models.entidades.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/{id}")
	public Cliente obterCliente(@PathVariable int id) {
		return new Cliente(id, "Geovane", "Barbosa", "11945549999", "SP", "geo@teste.com", "thunder");
	}
	
	//Diferente do método acima, esse metodo abaixo faz com que na url o dado id não apareça quando for passado os parametros via URL
	@GetMapping
	public Cliente obterClienteSecurity(@RequestParam(name = "id", defaultValue = "3") int id) {
		return new Cliente(id, "Leandro", "Hassun", "11999999999", "RJ", "leh@teste.com", "thunder");
	}
}
