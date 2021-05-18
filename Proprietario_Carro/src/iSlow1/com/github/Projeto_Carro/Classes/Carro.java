package iSlow1.com.github.Projeto_Carro.Classes;

public class Carro {
	
	private String modelo;
	private String cor;
	private String marca;
	private String chassi;
	private Integer ano;
	
	
	private Proprietario proprietario; 
	
	private Integer velocidadeMaxima = 140;
	private Integer velocidadeAtual = 0;
	private Integer numeroPortas;
	private Integer numeroMarchas;
	private Integer marchaAtual = 0;
	private Integer volumeCombustivel;
	
	private Boolean cambioAutomatico;
	private Boolean temTetoSolar;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public Integer getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(Integer velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public Integer getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(Integer velocidadeAtual) {
		if(getVelocidadeAtual() < getVelocidadeMaxima() && velocidadeAtual < getVelocidadeMaxima()) {
			this.velocidadeAtual = velocidadeAtual;
		}
	}
	public Integer getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(Integer numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	
	public Integer getMarchaAtual() {
		return marchaAtual;
	}
	public void setMarchaAtual(Integer marchaAtual) {
		if(marchaAtual <= getNumeroMarchas() && marchaAtual > 0) {
		this.marchaAtual = marchaAtual;		
		}	
	}
	public Integer getNumeroMarchas() {
		return numeroMarchas;
	}
	public void setNumeroMarchas(Integer numeroMarchass) {
		this.numeroMarchas = numeroMarchass;
	}
	public Integer getVolumeCombustivel() {
		return volumeCombustivel;
	}
	public void setVolumeCombustivel(Integer volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}
	public Boolean getCambioAutomatico() {
		return cambioAutomatico;
	}
	public void setCambioAutomatico(Boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}
	public Boolean getTemTetoSolar() {
		return temTetoSolar;
	}
	public void setTemTetoSolar(Boolean temTetoSolar) {
		this.temTetoSolar = temTetoSolar;
	}
	
	public void acelerar () {
		setVelocidadeAtual(getVelocidadeAtual() +1); //incremento .1 km/h
		System.out.println("Velocidade atual: " + getVelocidadeAtual());
	}
	
	public void frear() {
		setVelocidadeAtual(0);
		System.out.println("Velocidade Atua: " + getVelocidadeAtual());
		System.out.println("Carro Parou!");
	}
	
	public void aumentarMarcha() {
		setMarchaAtual(getMarchaAtual() + 1);
		System.out.println("Marcha atual: " + getMarchaAtual());
	}
	
	public void reduzirMarcha() {
		setMarchaAtual(getMarchaAtual() + 1);
		System.out.println("Marcha atual: " + getMarchaAtual());
	}

}
