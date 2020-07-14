package objetos;

public class Pessoa {	
	private String nome, cpf, sexo;
	private int idade;
	private double credito;
	private int idcad_pessoas;
	
	
	
	public int getIdcad_pessoas() {
		return idcad_pessoas;
	}
	public void setIdcad_pessoas(int idcad_pessoas) {
		this.idcad_pessoas = idcad_pessoas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	public void setSexo(int selectedIndex) {
		if(selectedIndex == 0) this.sexo = "Masculino";
		if(selectedIndex == 1) this.sexo = "Feminino";
		if(selectedIndex == 2) this.sexo = "Prefiro Não informar";
		
	}
	
}
