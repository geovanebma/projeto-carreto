package br.com.projetocarreto.projetoCarreto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	//@RequestMapping(method = RequestMethod.GET, path = "/ola")
	@GetMapping(path = {"/ola"})
	public String ola() {
		return "Olá Spring Boot (Método GET)";
	}
	
	//Nesse caso dá erro na tela de ambiguidade
	/*@PostMapping(path = {"/saudacao"})
	public String saudacao() {
		return "Olá Spring Boot (Método POST)";
	}*/
}
