package br.com.fiapride.model;

public class Passageiro {
	
    private String nome;
    private String cpf;
    private double saldo;
    

    
    public void adicionarSaldo(double valor) {
    	
    	if (valor <= 0 ) {
    		System.out.println("Erro: O valor de recarga deve ser maior que zero.");
    		return;
    	}
    	
    	this.saldo += valor;
    	System.out.println("Recarga realizada. Novo saldo: " + this.saldo);
    	    	
    }

    public void pagarViagem(double custo) {
    	
    	if (custo <= 0) {
    		System.out.println("Erro: O custo da viagem não pode ser zero");
    		return;
    	}
    	
    	if (this.saldo < custo) {
    		System.out.println("Erro: Saldo insuficiente, por favor carregue");
    		return;
    	}
    	
    	this.saldo -= custo;
    		System.out.println("Viagem paga, se joga na aventura. Saldo Restante: " + this.saldo);
    	}
    
    public Passageiro(String nome, String cpf) {
    	this.setNome(nome);
    	this.setCpf(cpf);
    	this.setSaldo(0);
    }
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    private void setSaldo(double valor) {
    	if (valor >= 0) {
    		this.saldo = valor;    		
    	} else {
    		System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
    	}
    }
    
    public String getNome() {
    	return this.nome;
    }
    
    private void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getCpf() {
    	return this.cpf;
    }
    
    private void setCpf(String cpf) {
    	this.cpf = cpf;
    }
    
    }
    
