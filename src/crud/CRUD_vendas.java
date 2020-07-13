package crud;

import java.sql.ResultSet;
import java.util.ArrayList;

import conexao.Conexao;
import objetos.Pessoa;
import objetos.Venda;

public class CRUD_vendas {

	public String cadastra(Venda v) {
//		System.out.println(v.getIdcomprador());
		String sql = "INSERT INTO cad_vendas(id_produto, id_vendedor, id_comprador, valor) VALUES("+v.getIdproduto()+",  "+v.getIdvendedor()+", "+v.getIdcomprador()+", "+v.getValor_venda()+")";
		Conexao c = new Conexao();
		c.insere(sql);
		
		return "ok";
	}
	
	public ArrayList<Venda> readAll(){
		ArrayList<Venda> lista = new ArrayList<Venda>();
		String sql = "SELECT pc.nome as comprador, pv.nome as vendedor, pp.descricao, v.valor FROM trabalho_final.cad_vendas v\n" + 
				"inner join cad_pessoas pc on pc.idcad_pessoas = v.id_comprador\n" + 
				"inner join cad_pessoas pv on pv.idcad_pessoas = v.id_vendedor\n" + 
				"inner join cad_produtos pp on pp.id_produto = v.id_produto";
		Conexao c = new Conexao();
		try {
			ResultSet res = c.read(sql);
			while(res.next()) {
				Venda v = new Venda();
				v.setComprador(res.getString("comprador"));
				v.setVendedor(res.getString("vendedor"));
				v.setDescricao(res.getString("descricao"));
				v.setValor_venda(res.getString("valor"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
}
