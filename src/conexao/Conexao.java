package conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
static String driverJDBC = "org.gjt.mm.mysql.Driver";
private Connection con;

	public Connection getCon() {
	return con;
}
public void setCon(Connection con) {
	this.con = con;
}
	public Conexao() {
		try {
		Class.forName(driverJDBC);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabalho_final", "root", "");
		this.setCon(con);
//		Statement stat = con.createStatement();
//	    stat.executeUpdate("INSERT INTO ALUNOS (nome) VALUES('João')");
//		return con;

		}catch (Exception e) {
			e.printStackTrace();
		}
//		return null;
		
	}
	public void desconecta() {
		try {
			this.con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void insere(String sql) {
		
		try {
			Statement stat;
			stat = this.getCon().createStatement();
			int retorno = stat.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	}
	public ResultSet read(String sql) {
		ResultSet retorno = null;
		Statement stat;
		try {
			stat = this.getCon().createStatement();
			retorno = stat.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return retorno;
	}
}
