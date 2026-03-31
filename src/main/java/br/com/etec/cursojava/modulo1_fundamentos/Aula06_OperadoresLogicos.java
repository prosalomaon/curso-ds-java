package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 06: OPERADORES RELACIONAIS E LÓGICOS
 * 
 * Para que um programa tome decisões, ele precisa comparar valores. 
 * O resultado de uma comparação é sempre um valor booleano (true ou false).
 * 
 * 1. OPERADORES RELACIONAIS:
 *    ==  (Igual a)
 *    !=  (Diferente de)
 *    >   (Maior que)
 *    <   (Menor que)
 *    >=  (Maior ou igual a)
 *    <=  (Menor ou igual a)
 * 
 * 2. OPERADORES LÓGICOS:
 *    &&  (E / AND): Verdadeiro apenas se AMBOS forem verdadeiros.
 *    ||  (OU / OR): Verdadeiro se PELO MENOS UM for verdadeiro.
 *    !   (NÃO / NOT): Inverte o valor (Vira F, F vira V).
 */
public class Aula06_OperadoresLogicos {
    public static void executar() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("   AULA 06: OPERADORES RELACIONAIS E LÓGICOS           ");
        System.out.println("-------------------------------------------------------");

        int idade = 20;
        boolean temIngresso = true;
        boolean estaClimaBom = false;

        // 1. Exemplo de Operador Relacional
        boolean ehMaiorDeIdade = idade >= 18;
        System.out.println("1. É MAIOR DE IDADE? " + ehMaiorDeIdade);

        // 2. Exemplo de Operador Lógico AND (&&)
        boolean podeEntrarNaNoite = ehMaiorDeIdade && temIngresso;
        System.out.println("2. PODE ENTRAR NO EVENTO? " + podeEntrarNaNoite);

        // 3. Exemplo de Operador Lógico OR (||)
        boolean vouSairDeCasa = podeEntrarNaNoite || estaClimaBom;
        System.out.println("3. VOU SAIR DE CASA? " + vouSairDeCasa);

        // 4. Exemplo de Operador NOT (!)
        System.out.println("4. ESTÁ CLIMA BOM? " + estaClimaBom);
        System.out.println("5. ESTÁ CLIMA RUIM? " + !estaClimaBom);

        System.out.println("\n[VISÃO SENIOR]:");
        System.out.println("Evite expressões lógicas muito longas em uma única linha. \nÉ melhor criar variáveis booleanas com nomes claros para cada \nparte da condição, facilitando a leitura por outros desenvolvedores.");

        System.out.println("\n[DESAFIO DA AULA]:");
        System.out.println("Crie um algoritmo que verifique se um triângulo é válido. \nRegra: A soma de dois lados deve ser sempre maior que o terceiro lado. \n(LadoA + LadoB > LadoC) && (LadoA + LadoC > LadoB) && (LadoB + LadoC > LadoA).");

        System.out.println("\nQUESTÃO PARA REFLEXÃO:");
        System.out.println("O que acontece se você usar apenas um '&' ou apenas um '|' \nem vez de '&&' e '||'?");
        System.out.println("-------------------------------------------------------\n");
    }
}
