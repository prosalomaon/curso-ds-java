package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 03: VARIÁVEIS E CONSTANTES
 * 
 * Programar é, fundamentalmente, gerenciar o estado da memória. 
 * Pense na memória como um grande armário com gavetas (variáveis),
 * onde cada gaveta guarda um valor específico.
 * 
 * O QUE É UMA VARIÁVEL?
 * É um espaço na memória que armazena um valor que pode mudar
 * durante a execução do programa.
 * 
 * TIPOS DE DADOS PRIMITIVOS:
 * Java possui tipos básicos para armazenar dados:
 * 
 * - int     -> números inteiros (ex: 10, 25)
 * - double  -> números decimais (ex: 10.5, 3.14)
 * - char    -> um único caractere (ex: 'A')
 * - boolean -> verdadeiro ou falso (true/false)
 * 
 * DECLARAÇÃO VS INICIALIZAÇÃO:
 * 
 * 1. Declaração:
 * É quando você cria a variável na memória.
 *    Ex: int idade;
 * 
 * 2. Inicialização: É quando você atribui um valor inicial.
 *    Ex: idade = 18;
 * 
 * 3. Declaração + Inicialização:
 *    Ex: int idade = 18;
 * 
 * REATRIBUIÇÃO:
 * O valor de uma váriavel pode mudar:
 * idade = 20;
 * 
 * MEMÓRIA STACK:
 * Variáveis locais (criadas dentro de métodos) ficam na STACK.
 * 
 * Características:
 * - Muito rápida
 * - Organizada em forma de pilha (LIFO)
 * - Liberada automaticamente após o método terminar
 * 
 * HEAP (VISÃO INICIAL):
 * Objetos (que veremos mais pra frente) são armazenados na HEAP,
 * uma área de memória maior e gerenciada pelo Garbage Collector.
 * 
 * CONSTANTES (final):
 * O modificador 'final' transforma uma variável em constante.
 * 
 * Regras:
 * - Deve ser inicializada uma vez
 * - Não pode ser alterada depois
 * 
 * Convenção:
 * - Nome em MAIÚSCULO (ex: TAXA_JUROS)
 * 
 * EXEMPLO:
 * final double PI = 3.1415;
 * 
 * BOAS PRÁTICAS:
 * - Inicializar variáveis o mais cedo possível
 * - Usar nomes claros e descritivos
 * - Evitar variáveis desnecessárias
 * - Preferir constantes para valores fixos
 * 
 * ERROS COMUNS:
 * - Usar variável sem inicializar
 * - Tentar alterar uma constante
 * - Usar tipos inadequados (ex: int para valores decimais)
 * 
 * CONCLUSÃO:
 * Variáveis controlam o estado do programa, e constantes garantem
 * segurança e previsibilidade nos valores fixos.
 */
public class Aula03_VariaveisConstantes {
    public static void executar() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("   AULA 03: GERENCIAMENTO DE MEMÓRIA E CONSTANTES      ");
        System.out.println("-------------------------------------------------------");

        // Declaração e inicialização
        int estoque = 100;

        // Reatribuição
        estoque = 120;

        // Tipos diferentes
        double preco = 49.90;
        boolean disponivel = true;
        char categoria = 'A';

        // Constante
        final double PERCENTUAL_ICMS = 18.0;

        System.out.println("Estoque atual: " + estoque);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Disponível: " + disponivel);
        System.out.println("Categoria: " + categoria);
        System.out.println("ICMS: " + PERCENTUAL_ICMS + "%");

        System.out.println("\n[EXEMPLO PRÁTICO]:");
        double precoFinal = preco + (preco * PERCENTUAL_ICMS / 100);
        System.out.println("Preço final com imposto: R$ " + precoFinal);

        System.out.println("\n[VISÃO SENIOR]:");
        System.out.println(
            "Variáveis mal gerenciadas causam bugs difíceis de rastrear. \nUse constantes sempre que possível para evitar alterações inesperadas.");

        System.out.println("\n[DICA IMPORTANTE]:");
        System.out.println(
            "Sempre escolha o tipo correto. Usar tipos errados pode causar \nperda de precisão ou erros de lógica.");

        System.out.println("\n[DESAFIO DA AULA]:");
        System.out.println(
            "1. Crie constantes: IMPOSTO_FEDERAL, IMPOSTO_ESTADUAL, MARGEM_LUCRO\n" +
            "2. Declare PRECO_CUSTO\n" +
            "3. Calcule o PRECO_FINAL com todos os valores");

        System.out.println("\n[EXERCÍCIO EXTRA]:");
        System.out.println(
            "Crie um programa que calcule a área de um círculo usando uma constante PI.");

        System.out.println("\nQUESTÃO PARA REFLEXÃO:");
        System.out.println(
            "O que aconteceria se você criasse milhares de variáveis dentro de um loop? \nIsso pode causar estouro de memória (Stack Overflow)?");
        
        System.out.println("-------------------------------------------------------\n");
    }
}
