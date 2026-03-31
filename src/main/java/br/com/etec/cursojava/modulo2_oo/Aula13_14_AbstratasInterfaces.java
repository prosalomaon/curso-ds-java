package br.com.etec.cursojava.modulo2_oo;

public class Aula13_14_AbstratasInterfaces {
    public static void executar() {
        System.out.println("--- Aula 13 e 14: Classes Abstratas e Interfaces ---");
        System.out.println("Exemplo Real: Um sistema de e-commerce onde 'Boleto' e 'CartaoCredito' assinam um Contrato (Interface) exigindo a implementação do método 'processarPagamento'.");
        
        ProcessadorDePagamento pagamento = new PagamentoBoleto();
        pagamento.processarPagamento(150.0);
        
        pagamento = new PagamentoCartao();
        pagamento.processarPagamento(350.50);
    }
}

// Interface (Contrato)
interface ProcessadorDePagamento {
    void processarPagamento(double valor);
}

// Implementações do Contrato
class PagamentoBoleto implements ProcessadorDePagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando código de barras para o boleto no valor de: R$ " + valor);
    }
}

class PagamentoCartao implements ProcessadorDePagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Enviando requisição à operadora de cartão. Valor: R$ " + valor);
    }
}
