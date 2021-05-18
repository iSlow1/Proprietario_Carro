package iSlow1.com.github.Projeto_Carro.Classes;

public class Proprietario {

	private String nome;
	private String dataNascimento;	
	
	private Integer CPF;
	private Integer RG;
	
	private Endereco endereco;
	
	public Proprietario(String nome, Integer CPF, Integer RG, Endereco endereco) {
		
		this.nome = nome;
		this.CPF = CPF;
		this.RG = RG;
		this.endereco = endereco;
		
	}
	
	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public String getNome() {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public Integer getCPF() {
		return this.CPF;
	}

	public void setCPF(Integer CPF) {
		this.CPF = CPF;
	}

	public Integer getRG() {
		return this.RG;
	}

	public void setRG(Integer RG) {
		this.RG = RG;
	}

	public String getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
