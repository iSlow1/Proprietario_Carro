package iSlow1.com.github.Projeto_Carro.Classes;

public class Endereco {
	
	private String Rua;
	private String Bairro;
	private String Cidade;
	private String Estado;
	private String Complemento;
	
	private Integer CEP;

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public Integer getCEP() {
		return CEP;
	}

	public void setCEP(Integer cEP) {
		CEP = cEP;
	}

	public Endereco(String rua, String bairro, String cidade, String estado, Integer CEP) {
		this.Rua = rua;
		this.Bairro = bairro;
		this.Cidade = cidade;
		this.Estado = estado;
		this.CEP = CEP;
	}
}
