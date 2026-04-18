package br.com.fiapride.model;

// Herança: GarrafaTermica é uma GarrafaAgua
public class GarrafaTermica extends GarrafaAgua {
    
    // Atributo exclusivo: tempo que mantém a temperatura (em horas)
    private int horasConservacao;
    private boolean possuiParedeDupla;

    // CONSTRUTOR
    public GarrafaTermica(String marca, String material, double capacidade, int horas) {
        // Super envia os dados para o construtor da mãe
        super(marca, material, capacidade);
        this.horasConservacao = horas;
        this.possuiParedeDupla = true; // Padrão para térmicas
    }

    // Getter e Setter
    public int getHorasConservacao() {
        return horasConservacao;
    }

    public void setHorasConservacao(int horasConservacao) {
        this.horasConservacao = horasConservacao;
    }

    // Método exclusivo (Comportamento)
    public void exibirEficiencia() {
        System.out.println("Atenção: Este modelo mantém a temperatura por " + this.horasConservacao + " horas.");
    }
}