package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

	public static void main(String[] args) {		
	//Criando o primeiro e segundo passageiro (objeto)
		
       Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222");
       System.out.println("Regarga passageiro 1");
       passageiro1.adicionarSaldo(50.0);
       
       Passageiro passageiro2 = new Passageiro("Lara Croft", "800.888.888");
       System.out.println("Recarga passageiro 2");
       passageiro2.adicionarSaldo(80.0);
       
       Veiculo meuCarro = new Veiculo("ABC-1234", "Toyota Corolla");
	
	// Para exibir os dados
       
       System.out.println("--- Sistema FiapRide ---");
       System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$" + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());
       System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$" + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());
       
       System.out.println("Pagando viagem do passageiro 1");
       passageiro1.pagarViagem(20);
       System.out.println("Pagando viagem do passageiro 2");
       passageiro2.pagarViagem(20);
       
       System.out.println("\n--- Status dos Passageiros ---");
       System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo:R$ " + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());
       System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo:R$ " + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());
       
       
       System.out.println("\n--- Realizando Viagens ---");
       System.out.println("Pagando viagem do passageiro 1 (Ana)...");
       passageiro1.pagarViagem(20.0); // Ana tem 50, vai sobrar 30.
       
       System.out.println("\n Pagando viagem do passageiro 2 (Carlos)...");
       passageiro2.pagarViagem(20.0);
       
       System.out.println("\n Veículo Cadastrado: " + meuCarro.gerarRelatorio());
	}
 }	




