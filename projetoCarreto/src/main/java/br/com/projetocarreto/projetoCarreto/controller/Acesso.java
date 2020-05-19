package br.com.projetocarreto.projetoCarreto.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.projetocarreto.projetoCarreto.models.entidades.CadastroCliente;
import br.com.projetocarreto.projetoCarreto.models.repositories.CadastroClientesRepository;

@RestController
@RequestMapping("/acesso")
public class Acesso {
	@Autowired
	private CadastroClientesRepository ccl;
	
	@RequestMapping("/contem")
	public String contem() {
		int numero = 0;
		
        Random gerador = new Random();
        
        String string_numero = "";
         
        for (int i = 0; i < 1; i++) {
            numero = gerador.nextInt(10001);
            
            if(numero < 10) {
            	string_numero = "000"+numero;
            }else if(numero < 100 && numero > 9) {
            	string_numero = "00"+numero;
            }else if(numero < 1000 && numero > 99) {
            	string_numero = "0"+numero;
            }else{
            	string_numero = ""+numero;
            }
        }
        
        System.out.println(string_numero);
        
		return string_numero;
	}
	
	/*public ModelAndView contem() {
		ModelAndView retorno = new ModelAndView();
		Iterable<CadastroCliente> numeros = ccl.findAll();
		retorno.addObject("valores", numeros);
		return retorno;
	}*/
}