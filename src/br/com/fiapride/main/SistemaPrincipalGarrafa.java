package br.com.fiapride.main;
import br.com.fiapride.model.GarrafaAgua;


public class SistemaPrincipalGarrafa {

	public static void main(String[] args) {		
        
		GarrafaAgua paravenda = new GarrafaAgua();
		paravenda.cor = "Bege";
		paravenda.material = "Plástico Réciclavél";
	
		GarrafaAgua parademonstracao = new GarrafaAgua();
		parademonstracao.cor = "Preta";
		parademonstracao.material = "Plástico com rotulo explicativo";
		
		GarrafaAgua garrafa1 = new GarrafaAgua("Lindoya","Plástico",500.0);
		System.out.println("Garrafa 1 Cheia");
		
		
		GarrafaAgua garrafa2 = new GarrafaAgua("Nestle","Vidro", 750.0);
		System.out.println("Garrafa 2 Cheia");
		
	
	System.out.println("--- Garrafa Água Reciclavél ---");
	System.out.println("Garrafa Agua para Venda: " + paravenda.cor + " | "+ paravenda.material);
	System.out.println("Garrafa Agua para Demonstração: " + parademonstracao.cor + " | "+ parademonstracao.material);
	
	System.out.println("---Sistema para Controle de Consumo de Água");
    System.out.println("Marca: " + garrafa1.marca + " | Cap: " + garrafa1.capacidadegarrafa + "ml");
    System.out.println("Marca: " + garrafa2.marca + " | Cap: " + garrafa2.capacidadegarrafa + "ml");
	
	
	
	}

}
