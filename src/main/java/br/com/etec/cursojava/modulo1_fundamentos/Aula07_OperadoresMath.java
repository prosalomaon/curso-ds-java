package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 07: OPERADORES ARITMÉTICOS E CLASSE MATH
 * 
 * Programar exige o domínio de cálculos matemáticos. O Java oferece operadores 
 * nativos e uma classe utilitária (Math) com funções avançadas.
 * 
 * 1. OPERADORES ARITMÉTICOS:
 *    + (Soma), - (Subtração), * (Multiplicação), / (Divisão), % (Resto).
 * 
 * 2. OPERADORES UNÁRIOS (INCREMENTO/DECREMENTO):
 *    - x++ (Pós-incremento): Usa o valor atual e DEPOIS soma 1.
 *    - ++x (Pré-incremento): Soma 1 e DEPOIS usa o valor atualizado.
 * 
 * 3. CLASSE MATH (ESTÁTICA):
 *    - Math.abs(x): Valor absoluto (sem sinal).
 *    - Math.pow(base, exp): Potenciação.
 *    - Math.sqrt(x): Raiz quadrada.
 *    - Math.PI: Valor de PI aproximado.
 */
public class Aula07_OperadoresMath {
    public static void executar() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("   AULA 07: OPERADORES ARITMÉTICOS E CLASSE MATH       ");
        System.out.println("-------------------------------------------------------");

        // 1. O mistério da divisão de inteiros
        System.out.println("1. DIVISÃO INTEIRA: 5 / 2 = " + (5 / 2));
        System.out.println("2. DIVISÃO REAL: 5.0 / 2 = " + (5.0 / 2));

        // 2. Operador de Resto (%) - Uso Real: Par ou Ímpar
        int numero = 11;
        boolean ehPar = (numero % 2 == 0);
        System.out.println("3. O NÚMERO " + numero + " É PAR? " + ehPar);

        // 3. Pré vs Pós Incremento (Detalhe Sênior)
        int a = 10;
        int b = a++; // b recebe 10, depois a vira 11.
        System.out.println("4. PÓS-INCREMENTO (a++): b=" + b + ", a=" + a);

        int c = 10;
        int d = ++c; // c vira 11, depois d recebe 11.
        System.out.println("5. PRÉ-INCREMENTO (++c): d=" + d + ", c=" + c);

        System.out.println("\n[VISÃO SENIOR]:");
        System.out.println("Ao lidar com dinheiro, evite 'float' e 'double' devido a \nerros de arredondamento binário. Para sistemas financeiros \npesquise sobre 'BigDecimal'.");

        System.out.println("\n[DESAFIO DA AULA]:");
        System.out.println("Calcule a área e o perímetro de um círculo com RAIO = 5. \nFórmulas: Área = PI * raio² | Perímetro = 2 * PI * raio. \nUse Math.PI e Math.pow().");

        System.out.println("\nQUESTÃO PARA REFLEXÃO:");
        System.out.println("Como você calcularia a hipotenusa de um triângulo retângulo \nusando Math.sqrt() e Math.pow() (Teorema de Pitágoras)?");
        System.out.println("-------------------------------------------------------\n");
    }
}
