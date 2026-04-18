package br.com.fiapride.main;
import br.com.fiapride.model.GarrafaAgua;


public class SistemaPrincipalGarrafa {

	public static void main(String[] args) {		
        
		GarrafaAgua paravenda = new GarrafaAgua("Tupperware", "Plástico Reciclável", 500.0);
		paravenda.setCor("Bege");
		paravenda.setMaterial("Plástico Réciclavél");
	
		GarrafaAgua parademonstracao = new GarrafaAgua("Metal", "Vidro Temperado", 1000.0);
		parademonstracao.setCor("Preta");
		parademonstracao.setMaterial("Plástico com rotulo explicativo");
		
		GarrafaAgua garrafa1 = new GarrafaAgua("Lindoya","Plástico",500.0);
		System.out.println("Garrafa 1 Cheia");
		
		GarrafaAgua garrafa2 = new GarrafaAgua("Nestle","Vidro", 750.0);
		System.out.println("Garrafa 2 Cheia");
		
	
	System.out.println("--- Garrafa Água Reciclavél ---");
	System.out.println("Garrafa Agua para Venda: " + paravenda.getCor() + " | " + paravenda.getMaterial());
	System.out.println("Garrafa Agua para Demonstração: " + parademonstracao.getCor() + " | " + parademonstracao.getMaterial());
	
	System.out.println("---Sistema para Controle de Consumo de Água");
    System.out.println("Marca: " + garrafa1.getMarca() + " | Cap: " + garrafa1.getCapacidadegarrafa() + "ml");
    System.out.println("Marca: " + garrafa2.getMarca() + " | Cap: " + garrafa2.getCapacidadegarrafa() + "ml");
	
	
	
	}

}
