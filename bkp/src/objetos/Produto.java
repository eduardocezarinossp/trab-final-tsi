package objetos;

public class Produto {
	private int id_produto;
	private String descricao;
	private Double preco_unitario;
	
	
	
	public Double getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(Double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public int getId_produto() {
		return id_produto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
