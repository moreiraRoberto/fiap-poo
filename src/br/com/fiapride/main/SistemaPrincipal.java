package br.com.fiapride.main;

import br.com.fiapride.model.GarrafaAgua;
//import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

	public static void main(String[] args) {		
	 // Codigo Passageiro comentado =======
     //   Passageiro passageiro1 = new Passageiro();
		//   passageiro1.nome = "Lara Croft";
		//   passageiro1.saldo = 50.0;        
		//   Passageiro passageiro2 = new Passageiro();
		//  passageiro2.nome = "Shania Twain";
		//  passageiro2.saldo = 12.50;        
     // Exibindo os dados no Console
		// System.out.println("--- Sistema FiapRide ---");
		//  System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
		// System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
        
		GarrafaAgua paravenda = new GarrafaAgua();
		paravenda.cor = "Bege";
		paravenda.material = "Plástico Réciclavél";
	
		GarrafaAgua parademonstracao = new GarrafaAgua();
		parademonstracao.cor = "Preta";
		parademonstracao.material = "Plástico com rotulo explicativo";
	
	System.out.println("--- Garrafa Água Reciclavél ---");
	System.out.println("GarrafaAgua: " + paravenda.cor + " | "+ paravenda.material);
	System.out.println("GarrafaAgua: " + parademonstracao.cor + " | "+ parademonstracao.material);
	
	}

}
