package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 03: VARIÁVEIS E CONSTANTES
 * 
 * Programar é, fundamentalmente, gerenciar o estado da memória. 
 * Para quem está começando do zero, pense na memória do computador como um grande 
 * armário cheio de gavetas etiquetadas.
 * 
 * DECLARAÇÃO VS INICIALIZAÇÃO:
 * 1. Declaração: É quando você avisa à JVM que uma "gaveta" (variável) existirá.
 *    Ex: int idade; (A gaveta está reservada, mas vazia).
 * 2. Inicialização: É quando você coloca o primeiro valor dentro dela.
 *    Ex: idade = 18; (Agora a gaveta tem conteúdo).
 * 
 * MEMÓRIA STACK:
 * Variáveis locais (como as que criamos dentro de métodos) são armazenadas em uma 
 * estrutura chamada STACK (Pilha). É uma memória rápida e organizada, onde os 
 * dados são descartados assim que o método termina a sua execução.
 * 
 * CONSTANTES (final):
 * O modificador 'final' crava o valor na memória. Uma vez inicializada, 
 * a constante não pode ter seu valor alterado até o fim do programa.
 */
public class Aula03_VariaveisConstantes {
    public static void executar() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("   AULA 03: GERENCIAMENTO DE MEMÓRIA E CONSTANTES      ");
        System.out.println("-------------------------------------------------------");

        // Exemplo de Declaração Separada de Inicialização
        int estoque; // Declaração
        estoque = 100; // Inicialização

        // Exemplo de Constante (Final)
        final double PERCENTUAL_ICMS = 18.0;

        System.out.println("1. VARIÁVEL (Estoque Inicial): " + estoque);
        System.out.println("2. CONSTANTE (Alíquota ICMS): " + PERCENTUAL_ICMS + "%");

        System.out.println("\n[VISÃO SENIOR]:");
        System.out.println("Sempre inicialize suas variáveis o mais cedo possível. \nVariáveis não inicializadas são fontes comuns de 'NullPointerException' \nou erros de compilação em lógicas complexas.");

        System.out.println("\n[DESAFIO DA AULA]:");
        System.out.println("Crie um pequeno algoritmo que declare três constantes \npara um sistema de vendas: IMPOSTO_FEDERAL, IMPOSTO_ESTADUAL \ne MARGEM_LUCRO. Depois, declare uma variável PRECO_CUSTO \ne calcule o PRECO_FINAL.");

        System.out.println("\nQUESTÃO PARA REFLEXÃO:");
        System.out.println("Se a memória Stack é 'limpa' automaticamente, o que aconteceria \nse criássemos variáveis infinitas dentro de um loop?");
        System.out.println("-------------------------------------------------------\n");
    }
}
