package projetoCarreto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SelecaoCarretoFuncoes {
	//Aqui dentro ele verifica a esolha do cliente, se ele quer um ve�culo de porte grande, m�dio, pequeno ou ideal para sua carga
	public String escolha_porte_veiculo(int tipo, double comprimento_obj, double largura_obj,  double peso_obj) throws SQLException {
		String escolha = "";
		
		if(tipo == 1) {
			escolha = "1";
		}else if(tipo == 2) {
			escolha = "2";
		}else if(tipo == 3) {
			escolha = "3";
		}else if(tipo == 4) {
			escolha = selecao_ideal(comprimento_obj, largura_obj, peso_obj);
		}
		
		return escolha;
	}
	
	//Aqui valida qual o ve�culo ideal caso a pessoa tenha selecionado a 4� op��o
	public String selecao_ideal(double comprimento_obj, double largura_obj, double peso_obj) throws SQLException {
		
		//Consulta no banco de dados os ve�culos que temos
		ExecucaoDeQuerys veiculos = new ExecucaoDeQuerys();
		ResultSet resultado = veiculos.consultar("SELECT Placa, Modelo, DimensaoVeiculo_M, DimensaoEixos_M, PesoMaxSuportado_Kg FROM veiculos");
		
		int[] id = new int[13];
		String[] nomeDoModelo = new String[13];
		double[] comprimentoDoModelo = new double[13];
		double[] larguraDoModelo = new double[13];
		double[] pesoDoModelo = new double[13];
		
		int i = 0;
		
		while(resultado.next()) {
			int codigo = resultado.getInt("placa");
			String modelo = resultado.getString("modelo");
			double comprimento = resultado.getDouble("DimensaoVeiculo_M");
			double largura = resultado.getDouble("DimensaoEixos_M");
			double peso = resultado.getDouble("PesoMaxSuportado_Kg");
			
			id[i] = codigo;
			nomeDoModelo[i] = modelo;
			comprimentoDoModelo[i] = comprimento;
			larguraDoModelo[i] = largura;
			pesoDoModelo[i] = peso;
			
			i++;
		}
		int length = id.length;
		
		//L�gica Paraconsistente
		
		//int idDoBD = 0;
		String modelo_escolhido = "";//V�riavel para retornar o melhor ve�culo
		
		String modeloEleitoAnterior = "";
		double modeloEleitoAnterior_comp = 0;
		double modeloEleitoAnterior_larg = 0;
		double modeloEleitoAnterior_peso = 0;
		
		//Nesse for � realizado a real l�gica paraconsistente selecionando o melhor ve�culo para levar sua carga, caso n�o encontre dentro dos ve�culos corretos, ele retorna a mensagem de que n�o tem o ve�culo adequado. 
		for (int j = 0; j < length-1; j++) {
			int indice_posterior = j+1;
			
			if(comprimentoDoModelo[j] <= comprimentoDoModelo[indice_posterior] && 
			   comprimentoDoModelo[j] >= comprimento_obj && 
			   larguraDoModelo[j] <= larguraDoModelo[indice_posterior] && 
			   larguraDoModelo[j] >= largura_obj && 
			   pesoDoModelo[j] <= pesoDoModelo[indice_posterior] && 
			   pesoDoModelo[j] >= peso_obj) {
				
				if(modeloEleitoAnterior != "") {
					if(comprimentoDoModelo[j] <= modeloEleitoAnterior_comp &&
					   larguraDoModelo[j] <= modeloEleitoAnterior_larg &&
					   pesoDoModelo[j] <= modeloEleitoAnterior_peso) {
						modelo_escolhido = nomeDoModelo[j];
					}else {
						modelo_escolhido = modeloEleitoAnterior;
					}
				}else {
					modelo_escolhido = nomeDoModelo[j];
					modeloEleitoAnterior = modelo_escolhido;
					modeloEleitoAnterior_comp = comprimentoDoModelo[j];
					modeloEleitoAnterior_larg = larguraDoModelo[j];
					modeloEleitoAnterior_peso = pesoDoModelo[j];
				}
				
				//idDoBD = id[j];
			}
		}
		if(modelo_escolhido != "") {
			//Se ralmente foi encontrado um ve�culo, ent�o � retornado o nome do modelo
			return "O melhor ve�culo para sua carga � o modelo: "+modelo_escolhido;
		}else {
			//Sen�o, � retornado a mensagem de que n�o tem um ve�culo que se enquadre com essas condi��es no momento
			return "N�o foi encontrado o melhor ve�culo de carga atualmente, no momento, chame um utilit�rio";
		}
	}
}
