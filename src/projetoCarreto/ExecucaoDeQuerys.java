package projetoCarreto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecucaoDeQuerys {
	public ResultSet consultar(String select) throws SQLException {
		Connection conexao = ConexaoContinua.getConexao();
		
		String sql = select;
		
		Statement stmt = conexao.createStatement();
		
		ResultSet resultado = stmt.executeQuery(sql);
		
		System.out.println("A busca ao banco de dados foi sucedida com sucesso!");
		
		return resultado;
	}
}
