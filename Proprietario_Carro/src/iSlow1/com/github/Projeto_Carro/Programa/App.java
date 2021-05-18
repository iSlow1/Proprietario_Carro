package iSlow1.com.github.Projeto_Carro.Programa;

import iSlow1.com.github.Projeto_Carro.Classes.Carro;
import iSlow1.com.github.Projeto_Carro.Classes.Endereco;
import iSlow1.com.github.Projeto_Carro.Classes.Proprietario;

public class App {

	public static void main(String[] args) {
		
		Endereco end = new Endereco("Manoel Ribas", "Costeira", "Araucaria", "Parana", 83708695);
		Proprietario prop = new Proprietario ("Renato", 11466597, 114829, end);
		
		Carro car = new Carro();
		car.setAno(2005);
		car.setCor("preto");
		car.setChassi("AZDA435AS");
		car.setNumeroPortas(4);
		car.setNumeroMarchas(6);
		car.setModelo("chevete");
		car.setTemTetoSolar(false);
		car.setCambioAutomatico(false);
	}

}