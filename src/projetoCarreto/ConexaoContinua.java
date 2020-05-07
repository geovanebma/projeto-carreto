package projetoCarreto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoContinua {
	public static Connection getConexao() {
		try {
			//Não vai ver o certificado do servidor, mas vai estabelecer uma conexão segura com os dois parâmetros abaixo
			String url = "jdbc:mysql://127.0.0.1:3306/frete?verifyServerCertificate=false&useSSL=true";
			String usuario = "root";
			String senha = "admin";
			
			return  DriverManager.getConnection(url, usuario, senha);
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}
