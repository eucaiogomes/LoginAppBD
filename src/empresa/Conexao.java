package empresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection conectar() {
		String url = "jdbc:mariadb://localhost:3306/banco_login";
		String usuario = "root";
		String senha = "root";
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, usuario,senha);
			System.out.println("Conexao bem-sucedida!");
		}catch(SQLException e){
			System.out.println("Erro ao conectar"+e.getMessage());
		}
		return conn;
		
	}
	

}
