package br.com.fiapride.model;

// A GarrafaSqueeze herda Marca, Material, Capacidade, etc.
public class GarrafaSqueeze extends GarrafaAgua {
    
    // Atributo específico: Squeezes têm bicos diferentes (ex: bico de silicone, bico flip)
    private String tipoBico;

    // CONSTRUTOR: Repasso o básico para a mãe (super) e resolvo o bico aqui
    public GarrafaSqueeze(String marca, String material, double capacidade, String tipoBico) {
        // 'super' invoca o construtor da classe GarrafaAgua
        super(marca, material, capacidade); 
        this.tipoBico = tipoBico;
    }

    // Getter e Setter específico
    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }
    
    @Override
    public String obterRecomendacaoUso() {
        return "Recomendação Squeeze: Ideal para atividades esportivas e treinos. O bico do tipo '" + this.tipoBico + "' facilita o consumo rápido em movimento.";
    }
}