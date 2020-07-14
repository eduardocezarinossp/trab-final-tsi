package crud;

import java.sql.ResultSet;
import java.util.ArrayList;

import conexao.Conexao;
import objetos.Produto;

public class CRUD_produtos {
	public String cadastra(Produto p) {
		String sql = "INSERT INTO cad_produtos(descricao, preco_unitario) values('"+p.getDescricao()+"',"+p.getPreco_unitario()+")";
		Conexao c = new Conexao();
		c.insere(sql);
		return "ok";
	}
	
	
	public ArrayList<Produto> readAll(){
		ArrayList<Produto> lista  = new ArrayList<Produto>();
		String sql = "SELECT * FROM cad_produtos;";
		Conexao c = new Conexao();
		try {
			ResultSet resultado = c.read(sql);
			Produto p;
			while(resultado.next()) {
				p = new Produto();
				p.setDescricao(resultado.getString("descricao"));
				p.setPreco_unitario(resultado.getDouble("preco_unitario"));
				lista.add(p);
			}
			return lista;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			c.desconecta();
		}
			
		return lista;
	}
	
	public Produto getProduto(Produto p ) {
		Produto p2 = new Produto();
		String sql = "SELECT * FROM cad_produtos where descricao ilike '%"+p.getDescricao()+"%';";
		Conexao c = new Conexao();
		try {
			ResultSet resultado = c.read(sql);
			if(resultado.next()) {
				p2.setDescricao(resultado.getString("descricao"));
				p2.setPreco_unitario(resultado.getDouble("preco_unitario"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		return p;
	
	}
	
	public String[] readAllString(){
		String[] lista = null;
		String sql = "SELECT * from cad_produtos";
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
				lista[aux] = res.getString("descricao")+" - "+res.getInt("id_produto");
				aux++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
		
	}
	
}
