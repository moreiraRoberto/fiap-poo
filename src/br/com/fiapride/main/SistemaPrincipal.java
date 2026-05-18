package br.com.fiapride.main;
import br.com.fiapride.model.CarroEletrico;
import br.com.fiapride.model.Celular;
import br.com.fiapride.model.Recarregavel;
import br.com.fiapride.model.Veiculo;
import br.com.fiapride.model.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {

    public static void main(String[] args) {		
        System.out.println("--- FIAPRIDE: Inicializando Sistema ---");
        
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222");
        System.out.println("Regarga passageiro 1");
        passageiro1.adicionarSaldo(50.0);
        
        Passageiro passageiro2 = new Passageiro("Lara Croft", "800.888.888");
        System.out.println("Recarga passageiro 2");
        passageiro2.adicionarSaldo(80.0);
        
        Veiculo meuCarro = new Carro("ABC-1234", "Toyota Corolla", 4);
        
        System.out.println("--- FIAPRIDE: Inicializando Sistema 2 ---");
        
        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        Veiculo carroDoJoao = new Carro("ABC-1234", "Toyota Corolla", 4);
        
        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);
        viagemDaAna.exibirResumo();
        
        ana.adicionarSaldo(50.0);
        System.out.println("Saldo da Ana consultado ATRAVÉS da Viagem: R$ " + viagemDaAna.getSolicitante().getSaldo());
        
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
        passageiro1.pagarViagem(20.0);
        
        System.out.println("\n Pagando viagem do passageiro 2 (Carlos)...");
        passageiro2.pagarViagem(20.0);
                  
        System.out.println("--- FIAPRIDE: Teste de Frota ---");
        
        Carro uberX = new Carro("ABC-1234", "Chevrolet Onix", 4);
        Moto mottu = new Moto("ABC-9999", "Caloi City", true);
        
        System.out.println("Carro modelo: " + uberX.getModelo() + " | Placa: " + uberX.getPlaca());
        System.out.println("Vagas para passageiros: " + uberX.getCapacidadePassageiros());
        
        System.out.println("\nMoto modelo: " + mottu.getModelo() + " | Placa: " + mottu.getPlaca());
        
        if (mottu.isEletrica()) {
            System.out.println("Atenção: Esta moto é elétrica e atinge maiores velocidades!");
        }
        
              
        // 1. Criamos uma lista da SUPERCLASSE. Ela aceita qualquer herdeiro!
        List<Veiculo> frota = new ArrayList<>();
        
        // 2. Colocamos instâncias específicas
        frota.add(new Carro("ABC-1234", "Honda Civic", 4));
        frota.add(new Moto("DEF-5678", "Honda CG 160", false));
        
        System.out.println("\n--- RELATÓRIO DE AUTONOMIA DA FROTA ---");
        
        // 3. A MÁGICA: O mesmo comando produz resultados diferentes!
        for (Veiculo veiculo : frota) {
            System.out.println("Veículo: " + veiculo.getModelo());
            
            veiculo.abaster(50); 
            
            System.out.println(veiculo.calcularAutonomia());
            System.out.println("---------------------------------------");
        }
        
        System.out.println("=== FIAPRIDE: Teste de Interfaces ===");
        System.out.println();
        
        // Criamos objetos de classes DIFERENTES
        CarroEletrico tesla = new CarroEletrico("TES-9999", "Tesla Model 3");
        Celular iphone = new Celular("iPhone 15");
        
        // POLIMORFISMO DE INTERFACE:
        // Ambos podem ser tratados como 'Recarregavel'
        Recarregavel[] recarregaveis = new Recarregavel[] {
            tesla,
            iphone
        };
        
        System.out.println("=== Recarregando Tudo ===");
        for (Recarregavel r : recarregaveis) {
            r.recarregar(85); // Mesmo método, comportamentos diferentes
            System.out.println("---");
        }
        
        System.out.println();
        System.out.println("=== Múltiplos Tipos ===");
        
        // CarroEletrico É UM Veiculo E TAMBÉM É UM Recarregavel
        System.out.println("Tesla é um Veiculo? " + (tesla instanceof Veiculo)); // true
        System.out.println("Tesla é Recarregavel? " + (tesla instanceof Recarregavel)); // true
        
        // Celular NÃO é Veiculo, MAS é Recarregavel
        System.out.println("Celular é um Veiculo? " + (Veiculo.class.isInstance(iphone))); // false
        System.out.println("Celular é Recarregavel? " + (iphone instanceof Recarregavel)); // true
        
        System.out.println();
        System.out.println("=== Autonomia do Carro Elétrico ===");
        System.out.println(tesla.calcularAutonomia());
        
        System.out.println();
        System.out.println("=== Bateria do Celular ===");
        System.out.println(iphone.getNivelBateria());
    }
        
    } 



