package projetoCarreto;

import java.sql.SQLException;

public class ConferirObjeto {

	public static void main(String[] args) throws SQLException {
		//Nesse caso escolhemos um objeto como colchão de solteiro para o teste
		SelecaoCarretoFuncoes colchao_solteiro = new SelecaoCarretoFuncoes();
		String resultado = colchao_solteiro.escolha_porte_veiculo(4, 1.00, 2.00, 8.00);
		System.out.println(resultado+" para o colchão de solteiro.");
		
		//Nesse outro caso escolhemos um objeto como colchão de casal para o teste
		/*SelecaoCarretoFuncoes colchao_casal = new SelecaoCarretoFuncoes();
		String resultado2 = colchao_casal.escolha_porte_veiculo(4, 1.80, 2.00, 15.00);
		System.out.println(resultado2+" para o colchão de casal.");
		
		//Nesse outro caso escolhemos um objeto como palete de piso para o teste
		SelecaoCarretoFuncoes palete = new SelecaoCarretoFuncoes();
		String resultado3 = palete.escolha_porte_veiculo(4, 1.80, 2.00, 2000.00);
		System.out.println(resultado3+" para o palete de piso.");*/
	}
}
