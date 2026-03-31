package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 05: WRAPPERS E CONVERSÕES (CASTING)
 * 
 * No Java, nem tudo é o que parece à primeira vista. Muitas vezes precisamos
 * transformar um dado em outro para realizar cálculos ou salvar em arquivos.
 * 
 * 1. WRAPPERS (OBJETOS ENVOLTÓRIOS):
 * Transformam tipos primitivos em objetos. Isso é essencial para usar
 * coleções de dados e bancos de dados.
 * Ex: int -> Integer; double -> Double; boolean -> Boolean.
 * 
 * 2. CASTING (CONVERSÃO DE TIPOS):
 * - Implícito (Widening): Quando você coloca algo menor em algo maior. É
 * automático.
 * Ex: byte -> int -> double.
 * - Explícito (Narrowing): Quando você "espreme" algo grande em algo menor.
 * Exige que você assuma o risco da perda de dados.
 * Ex: double -> int (Perde-se a parte decimal).
 * 
 * 3. CONVERSÃO DE TEXTO (PARSING):
 * Muitas vezes recebemos dados como String (de formulários ou arquivos) e
 * precisamos transformá-los em números para calcular.
 */
public class Aula05_Conversoes {
  public static void executar() {
    System.out.println("\n-------------------------------------------------------");
    System.out.println("   AULA 05: WRAPPERS E TRATAMENTO DE CONVERSÕES        ");
    System.out.println("-------------------------------------------------------");

    // 1. Conversão de String para Números (Padrão de Mercado)
    String valorEmTexto = "1500";
    int valorConvertido = Integer.parseInt(valorEmTexto);
    double precoComTaxa = Double.parseDouble("250.75");

    System.out.println("1. STRING PARA INT: " + valorConvertido);
    System.out.println("2. STRING PARA DOUBLE: " + precoComTaxa);

    // 2. Casting Explícito com Perda de Precisão
    double salarioBruto = 5450.99;
    int salarioTruncado = (int) salarioBruto; // O Java ignora o .99
    System.out.println("3. CASTING (5450.99 p/ int): " + salarioTruncado);

    // 3. O Perigo do Overflow (Estouro de Memória)
    int numeroGrande = 130;
    byte numeroEstourado = (byte) numeroGrande; // Byte suporta apenas até 127
    System.out.println("4. OVERFLOW (130 p/ byte): " + numeroEstourado);
    System.out.println("   (Note que o valor 'virou' para negativo devido ao limite de bits)");

    System.out.println("\n[VISÃO SENIOR]:");
    System.out.println(
        "Sempre valide se uma String é numérica antes de usar 'Integer.parseInt()'. \nSe o texto contiver uma letra, o sistema irá travar (Exception).");

    System.out.println("\n[DESAFIO DA AULA]:");
    System.out.println("1. Receba o valor '10.5' como String.");
    System.out.println("2. Converta para double.");
    System.out.println("3. Multiplique por 2.");
    System.out.println("4. Converta o resultado final para int e exiba no console.");

    System.out.println("\nQUESTÃO PARA REFLEXÃO:");
    System.out.println("Por que não podemos simplesmente fazer 'int x = (int) \"10\";'?");
    System.out.println("-------------------------------------------------------\n");
  }
}
