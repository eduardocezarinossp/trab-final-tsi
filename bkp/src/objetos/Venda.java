package objetos;

public class Venda {
	private String idproduto, idcomprador, idvendedor;
	private String valor_venda, comprador, vendedor, descricao;
	public String getComprador() {
		return comprador;
	}
	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getIdproduto() {
		int id = 0;
		String[] c = idproduto.split("-");
		id = Integer.parseInt(c[1].trim());
		return id;
	}
	public void setIdproduto(String idproduto) {
		this.idproduto = idproduto;
	}
	public int getIdcomprador() {
		int id = 0;
		String[] c = idcomprador.split("-");
		System.out.println(c.length);
		id = Integer.parseInt(c[1].trim());
		return id;
	}
	@Override
	public String toString() {
		return "Venda [idproduto=" + idproduto + ", idcomprador=" + idcomprador + ", idvendedor=" + idvendedor
				+ ", valor_venda=" + valor_venda + "]";
	}
	public void setIdcomprador(String idcomprador) {
		this.idcomprador = idcomprador;
	}
	public int getIdvendedor() {
		int id = 0;
		String[] c = idvendedor.split("-");
		id = Integer.parseInt(c[1].trim());
		return id;
	}
	public void setIdvendedor(String idvendedor) {
		this.idvendedor = idvendedor;
	}
	public String getValor_venda() {
		return valor_venda;
	}
	public void setValor_venda(String valor_venda) {
		this.valor_venda = valor_venda;
	}
}
