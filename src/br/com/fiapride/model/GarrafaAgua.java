package br.com.fiapride.model;

public abstract class GarrafaAgua {
    
    private String marca;
    private double capacidadegarrafa; 
    private String material;
    private String cor;
    private double saldo;
    private double qtaguadiaria;

    public GarrafaAgua(String marca, String material, double capacidadegarrafa) {
    	this.setMarca(marca);
        this.setMaterial(material);
        this.setCapacidadegarrafa(capacidadegarrafa);
        this.setSaldo(0.0);
    }

    public GarrafaAgua() {
    }

    // Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public double getCapacidadegarrafa() { return capacidadegarrafa; }
    public void setCapacidadegarrafa(double capacidadegarrafa) { this.capacidadegarrafa = capacidadegarrafa; }

    public double getSaldo() { return saldo; }

    public void setSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("A Garrafa está vazia, recarregue!");
        } else {
            this.saldo = valor;
        }
    }

    public void setQtaguadiaria(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("Lembre-se de beber Água!");
            return;
        }
        this.qtaguadiaria = quantidade;
    }
    
 // Método genérico para o Polimorfismo
    public String obterRecomendacaoUso() {
        return "Recomendação Padrão: Garrafa ideal para consumo diário e armazenamento simples em temperatura ambiente.";
    }
    
    public abstract void exibirCategoria();
}
