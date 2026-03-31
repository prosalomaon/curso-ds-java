package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 10: PROJETO PRÁTICO - CALCULADORA IMC SENIOR
 * 
 * Chegou o momento de consolidar o Módulo 1. Nesta aula, aplicaremos variáveis, 
 * tipos, operadores e, principalmente, o conceito de MODULARIZAÇÃO.
 * 
 * O QUE É MODULARIZAÇÃO?
 * É o ato de dividir um problema grande em pequenos pedaços (métodos). 
 * Um desenvolvedor sênior nunca escreve todo o código dentro do main. 
 * Ele cria "especialistas" (métodos) para cada tarefa.
 * 
 * VANTAGENS:
 * 1. Reutilização: Você pode usar o cálculo do IMC em outras partes do sistema.
 * 2. Facilidade de Manutenção: Se a fórmula do IMC mudar, você altera em apenas um lugar.
 * 3. Legibilidade: O código principal fica limpo e fácil de entender.
 */
public class Aula10_ProjetoCalculadoraIMC {
    public static void executar() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("   AULA 10: PROJETO FINAL MÓDULO 1 - CALCULADORA IMC   ");
        System.out.println("-------------------------------------------------------");

        // 1. Entrada de Dados (Simulando uma entrada do usuário)
        String nomeUsuario = "Ricardo Silva";
        double pesoKg = 82.0;
        double alturaMetros = 1.75;

        // 2. Processamento (Invocação de Métodos Especialistas)
        double imcResultado = calcularIndiceMassaCorporal(pesoKg, alturaMetros);
        String statusSaude = classificarResultado(imcResultado);

        // 3. Saída de Dados Formatada
        System.out.printf("USUÁRIO: %s\n", nomeUsuario);
        System.out.printf("PESO: %.2f kg | ALTURA: %.2f m\n", pesoKg, alturaMetros);
        System.out.printf("RESULTADO: IMC %.2f (%s)\n", imcResultado, statusSaude);

        System.out.println("\n[VISÃO SENIOR]:");
        System.out.println("Em projetos reais, os métodos 'calcular' e 'classificar' \nprovavelmente estariam em uma classe separada chamada 'CalculadoraService', \nisolando a lógica de negócio da interface com o usuário.");

        System.out.println("\n[DESAFIO DA AULA]:");
        System.out.println("1. No final desta classe, crie um novo método chamado \n   'calcularPesoIdeal(double altura, char sexo)'.");
        System.out.println("2. A fórmula simplificada é: Homens (72.7 * h) - 58 | Mulheres (62.1 * h) - 44.7.");
        System.out.println("3. Chame esse método dentro do 'executar()' e exiba o resultado.");

        System.out.println("\nQUESTÃO PARA REFLEXÃO:");
        System.out.println("Por que definimos os métodos abaixo como 'private static'?");
        System.out.println("-------------------------------------------------------\n");
    }

    /**
     * Especialista em Cálculo de IMC (Lógica Matemática).
     */
    private static double calcularIndiceMassaCorporal(double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }

    /**
     * Especialista em Classificação (Lógica de Decisão).
     */
    private static String classificarResultado(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25.0) return "Peso normal";
        if (imc < 30.0) return "Sobrepeso";
        return "Obesidade";
    }
}
