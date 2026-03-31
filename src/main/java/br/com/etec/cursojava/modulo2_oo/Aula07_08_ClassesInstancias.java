package br.com.etec.cursojava.modulo2_oo;

public class Aula07_08_ClassesInstancias {
    public static void executar() {
        System.out.println("--- Aula 7 e 8: Classes, Atributos, Métodos e Instâncias ---");
        System.out.println("Exemplo Real: Criando a planta funcional de um 'Carro' (Molde) e depois instanciando múltiplos carros na garagem (Objetos).");
        
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1978;
        meuCarro.ligar();
    }
}

// Exemplo da estrutura ensinada
class Carro {
    String modelo;
    int ano;
    
    void ligar() {
        System.out.println("Vrrum! O carro " + modelo + " do ano " + ano + " foi ligado.");
    }
}
