package br.com.etec.cursojava.modulo2_oo;

public class Aula09_10_Encapsulamento {
    public static void executar() {
        System.out.println("--- Aula 9 e 10: Encapsulamento, Getters/Setters e Construtores ---");
        System.out.println("Exemplo Real: Um sistema bancário onde o 'saldo' não pode ser acessado diretamente sob o risco de fraudes.");
        
        ContaBancaria conta = new ContaBancaria("João Silva");
        conta.depositar(500.0);
        System.out.println("O saldo atual é de R$ " + conta.getSaldo());
    }
}

class ContaBancaria {
    private String titular;
    private double saldo;
    
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito efetuado com sucesso.");
        }
    }
    
    public double getSaldo() {
        return this.saldo;
    }
}
