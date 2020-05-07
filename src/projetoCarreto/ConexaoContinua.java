package projetoCarreto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoContinua {
	public static Connection getConexao() {
		try {
			//N�o vai ver o certificado do servidor, mas vai estabelecer uma conex�o segura com os dois par�metros abaixo
			String url = "jdbc:mysql://127.0.0.1:3306/frete?verifyServerCertificate=false&useSSL=true";
			String usuario = "root";
			String senha = "admin";
			
			return  DriverManager.getConnection(url, usuario, senha);
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}
