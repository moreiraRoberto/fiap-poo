package br.com.fiapride.main;
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Viagem;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

	public static void main(String[] args) {		
	//Criando o primeiro e segundo passageiro (objeto)
		
	System.out.println("--- FIAPRIDE: Inicializando Sistema ---");
		
       Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222");
       System.out.println("Regarga passageiro 1");
       passageiro1.adicionarSaldo(50.0);
       
       Passageiro passageiro2 = new Passageiro("Lara Croft", "800.888.888");
       System.out.println("Recarga passageiro 2");
       passageiro2.adicionarSaldo(80.0);
       
       Veiculo meuCarro = new Veiculo("ABC-1234", "Toyota Corolla");
       
       
       System.out.println("--- FIAPRIDE: Inicializando Sistema ---");
       
       // 1. Criamos os "atores" independentes primeiro        
       Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
       Veiculo carroDoJoao = new Veiculo("ABC-1234", "Toyota Corolla");
       
       // 2. Criamos a Viagem, conectando (associando) os objetos!        
       // Passamos a variável 'ana' e a variável 'carroDoJoao' como parâmetros.
//Saldo ana = 0;    
       Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);
       
       // 3. Testando se os objetos conversam        
       viagemDaAna.exibirResumo();
       
       // 4. Prova da Passagem por Referência:        
       // Se a Ana colocar saldo na conta dela DEPOIS que a viagem foi criada...        
       ana.adicionarSaldo(50.0);
       
       // A viagem "enxerga" esse saldo novo?        
       System.out.println("Saldo da Ana consultado ATRAVÉS da Viagem: R$ " + viagemDaAna.getSolicitante().getSaldo());
	
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
       
       System.out.println("--- FIAPRIDE: Teste de Frota ---");
       
       // 1. Instanciando os objetos específicos        
       Carro uberX = new Carro("ABC-1234", "Chevrolet Onix", 4);
       Moto mottu = new Moto("ABC-9999", "Caloi City", true);
       
       // 2. O TESTE: Um Carro consegue acessar getPlaca() da mãe?        
       // Sim! Note que nós não escrevemos getPlaca() dentro da classe Carro. Ele herdou!        
       System.out.println("Carro modelo: " + uberX.getModelo() + " | Placa: " + uberX.getPlaca());
       System.out.println("Vagas para passageiros: " + uberX.getCapacidadePassageiros());
       
       System.out.println("\nMoto modelo: " + mottu.getModelo() + " | Placa: " + mottu.getPlaca());
       
       // Se a moto é elétrica, ela avisa:        
       if (mottu.isEletrica()) {
           System.out.println("Atenção: Esta moto é elétrica e atinge maiores velocidades!");
       }
       
	}
	
	
 }	




