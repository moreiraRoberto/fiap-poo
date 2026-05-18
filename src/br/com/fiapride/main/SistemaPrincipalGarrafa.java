package br.com.fiapride.main;
import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Vendavel;
import java.util.ArrayList;
import java.util.List;
import br.com.fiapride.model.GarrafaAgua;
import br.com.fiapride.model.GarrafaSqueeze;
import br.com.fiapride.model.GarrafaTermica;

public class SistemaPrincipalGarrafa {

	public static void main(String[] args) {		
        
		//GarrafaAgua paravenda = new GarrafaAgua("Tupperware", "Plástico Reciclável", 500.0);
		//paravenda.setCor("Bege");
		//paravenda.setMaterial("Plástico Réciclavél");
	
		//GarrafaAgua parademonstracao = new GarrafaAgua("Metal", "Vidro Temperado", 1000.0);
		//parademonstracao.setCor("Preta");
		//parademonstracao.setMaterial("Plástico com rotulo explicativo");
		
		//GarrafaAgua garrafa1 = new GarrafaAgua("Lindoya","Plástico",500.0);
		//System.out.println("Garrafa 1 Cheia");
		
		//GarrafaAgua garrafa2 = new GarrafaAgua("Nestle","Vidro", 750.0);
		//System.out.println("Garrafa 2 Cheia");
		
	
	//System.out.println("--- Garrafa Água Reciclavél ---");
	//System.out.println("Garrafa Agua para Venda: " + paravenda.getCor() + " | " + paravenda.getMaterial());
	//System.out.println("Garrafa Agua para Demonstração: " + parademonstracao.getCor() + " | " + parademonstracao.getMaterial());
	
	//System.out.println("---Sistema para Controle de Consumo de Água");
    //System.out.println("Marca: " + garrafa1.getMarca() + " | Cap: " + garrafa1.getCapacidadegarrafa() + "ml");
    //System.out.println("Marca: " + garrafa2.getMarca() + " | Cap: " + garrafa2.getCapacidadegarrafa() + "ml");
	
 // 1. Criando uma Garrafa comum
    //GarrafaAgua comum = new GarrafaAgua("Lindoya", "Plástico", 500.0);
    
    // 2. Criando a Garrafa Squeeze (Filha)
    // Passamos Marca, Material, Capacidade E o Tipo de Bico
    GarrafaSqueeze minhaSqueeze = new GarrafaSqueeze("Nike", "Tritan", 750.0, "Bico Flip");
    minhaSqueeze.setCor("Rosa");

    System.out.println("--- Teste de Herança de Garrafas ---");
    
    // Acesso aos atributos da mãe através da filha
    System.out.println("Squeeze Marca: " + minhaSqueeze.getMarca()); 
    System.out.println("Squeeze Material: " + minhaSqueeze.getMaterial());
    
    // Acesso ao atributo exclusivo da filha
    System.out.println("Tipo de Bico: " + minhaSqueeze.getTipoBico());
    
 // Testando a segunda filha
    GarrafaTermica garrafaStanley = new GarrafaTermica("Stanley", "Aço Inox", 473.0, 12);
    garrafaStanley.setCor("Azul");

    System.out.println("\n--- Teste de Garrafa Térmica ---");
    System.out.println("Marca: " + garrafaStanley.getMarca());
    System.out.println("Material: " + garrafaStanley.getMaterial());
    // Chamando o método exclusivo da classe filha
    garrafaStanley.exibirEficiencia();
	
	System.out.println("\n--- TESTE POLIMÓRFICO: Recomendações de Uso ---");
    
    // A. Uma lista tipada com a Superclasse
    List<GarrafaAgua> estoqueGarrafas = new ArrayList<>();
    
    // B. Os objetos específicos criados anteriormente à lista
    //estoqueGarrafas.add(comum);
    estoqueGarrafas.add(minhaSqueeze);
    estoqueGarrafas.add(garrafaStanley);
    
    // C. O laço de repetição que dispara o Polimorfismo
    for (GarrafaAgua garrafa : estoqueGarrafas) {
        System.out.println("Avaliando modelo da marca: " + garrafa.getMarca());
    // O mesmo comando gerará 3 respostas completamente diferentes no console
        System.out.println(garrafa.obterRecomendacaoUso());
        garrafa.exibirCategoria();
        System.out.println("---------------------------------------");
    }
    
 	System.out.println("\n--- TESTE DA INTERFACE: Itens Vendáveis ---");
 	
 	// 1. Instanciamos um Carro (Hierarquia de Veículos)
 	Carro carroAnuncio = new Carro("XYZ-9999", "Chevrolet Onix", 4);
 	
 	// 2. Criamos um array do tipo da INTERFACE
 	// Este array aceita objetos de qualquer hierarquia, desde que implementem 'Vendavel'
 	Vendavel[] itensAVenda = new Vendavel[] { carroAnuncio, garrafaStanley };
 	
 	// 3. Chamada polimórfica do método do contrato
 	for (Vendavel item : itensAVenda) {
 	    item.exibirAnuncio();
 	    System.out.println("---------------------------------------");
 	}
 	for (GarrafaAgua garrafa : estoqueGarrafas) {
 	}
    
}
}

