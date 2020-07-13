package crud;

import java.sql.ResultSet;
import java.util.ArrayList;

import conexao.Conexao;
import objetos.Pessoa;

public class CRUD_pessoas {

	public String cadastra(Pessoa p) {
		String sql = "INSERT INTO cad_pessoas( nome, cpf) VALUES( '"+p.getNome()+"', '"+p.getCpf()+"')";
		Conexao c = new Conexao();
		c.insere(sql);
		
		return "ok";
	}
	
	public ArrayList<Pessoa> readAll(Pessoa p1){
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		String sql = "SELECT * from cad_pessoas";
		Conexao c = new Conexao();
		try {
			ResultSet res = c.read(sql);
			while(res.next()) {
				Pessoa p = new Pessoa();
				p.setNome(res.getString("nome"));
				p.setCpf(res.getString("cpf"));
				lista.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	public String[] readAllString(){
		String[] lista = null;
		String sql = "SELECT * from cad_pessoas";
		Conexao c = new Conexao();
		try {
			ResultSet res = c.read(sql);
			
			int tamanho = 0;
			if (res.last()) {
				tamanho = res.getRow();
				res.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
			lista = new String[tamanho];
			int aux = 0;
			while(res.next()) {
				lista[aux] = res.getString("nome")+" - "+res.getInt("idcad_pessoas");
				aux++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}
