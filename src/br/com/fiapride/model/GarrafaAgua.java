package br.com.fiapride.model;

public class GarrafaAgua {
	
	public String marca;
	public double capacidadegarrafa; //em ml professor
	public String material;
	public String cor;
	public double saldo;
	
	public GarrafaAgua() {
		
	}

	public GarrafaAgua(String marca, String material, double capacidade) {
		this.marca = marca;
		this.material = material;
		this.capacidadegarrafa = capacidade;
		this.saldo = 0.0;
	}
	
	public void saldogarrafa(double valor) {
		if (valor -= 0) {
			System.out.println("A Garrafa está vazia, recarregue!");
			return;			
		}
		
		this.capacidadegarrafa += valor;
		System.out.println("Água adicionada. Total: " + this.capacidadegarrafa + "ml");
	}
	
	public void qtaguadiaria(double quantidade) {
		if (quantidade -= 0) {
			System.out.println("Lembre-se de beber Água!");
			return;
		}
		
		if (this.capacidadegarrafa < quantidade) {
			System.out.pintln("Será necessário beber duas ou mais garrafas por dia");
		}
	}
}
