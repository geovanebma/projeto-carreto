package projetoCarreto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	public static void main(String[] args) throws SQLException{
		Connection conexao = ConexaoContinua.getConexao();
		
		/*
		Cria��o do banco de dados
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS fretes");*/
		
		System.out.println("Conex�o efetuada com sucesso.");
		conexao.close();
	}
}
