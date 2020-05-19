package br.com.projetocarreto.projetoCarreto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/validarNumero")
public class MetodoHttpNumero {
	@RequestMapping("/redirecionamento")
	public ModelAndView redirecionamento() {
		return new ModelAndView("redirect:/menu/menuSMS");
	}
}
