package crud;

import java.sql.ResultSet;
import java.util.ArrayList;

import conexao.Conexao;
import objetos.Pessoa;

public class CRUD_pessoas {

	public String cadastra(Pessoa p) {
		String sql = "INSERT INTO pessoas(idpessoa, nome, cpf, sexo, idade, credito) VALUES(NULL, '"+p.getNome()+"', '"+p.getCpf()+"', '"+p.getSexo()+"', "+p.getIdade()+", "+p.getCredito()+")";
		Conexao c = new Conexao();
		c.insere(sql);
		
		return "ok";
	}
	
	public ArrayList<Pessoa> readAll(Pessoa p1){
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		String sql = "SELECT * from pessoas";
		Conexao c = new Conexao();
		try {
			ResultSet res = c.read(sql);
			while(res.next()) {
				Pessoa p = new Pessoa();
				p.setNome(res.getString("nome"));
				p.setCpf(res.getString("cpf"));
				p.setSexo(res.getString("sexo"));
				p.setCredito(res.getDouble("credito"));
				p.setIdade(res.getInt("idade"));
				lista.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}
