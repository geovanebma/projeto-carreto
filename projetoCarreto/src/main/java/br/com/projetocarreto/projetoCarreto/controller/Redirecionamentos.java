package br.com.projetocarreto.projetoCarreto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/menu")
public class Redirecionamentos {
	@RequestMapping("/menuSMS")
	public ModelAndView menuSMS() {
		Acesso verificaNumero = new Acesso();
		System.out.println(verificaNumero.contem());
		return new ModelAndView("redirect:/ValidacaoSMS.html");
	}
}