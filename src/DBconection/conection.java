package DBconection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class conection {

	public Statement stm;
	public ResultSet rs;
	private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String path = "jdbc:sqlserver://localhost:1433;/" + "databaseName=CripFy;";
	private String usuario = "sa";
	private String senha = "";
	public Connection con;
	
	public void Conexao () {
		try {
			System.setProperty("jdbc.Drivers", driver);
			con=DriverManager.getConnection(path, usuario, senha);
			JOptionPane.showMessageDialog(null, "Ta dentro, chefe!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao estabelecer uma conexão com o banco de dados!" + e.getMessage());
		}
	}
}
