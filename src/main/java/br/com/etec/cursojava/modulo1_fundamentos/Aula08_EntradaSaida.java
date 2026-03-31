package br.com.etec.cursojava.modulo1_fundamentos;

import java.util.Scanner;
import java.util.Locale;

/**
 * AULA 08: INTERATIVIDADE (ENTRADA E SAÍDA DE DADOS)
 * 
 * Um programa senior deve ser capaz de interagir com o usuário de forma robusta.
 * 
 * 1. SAÍDA FORMATADA (printf):
 *    O método System.out.printf() permite criar textos com "espaços reservados".
 *    - %s: Substitui por uma String.
 *    - %d: Substitui por um número inteiro (decimal).
 *    - %.2f: Substitui por um número real com 2 casas decimais.
 *    - \n: Pula uma linha.
 * 
 * 2. ENTRADA DE SERVIÇO (Scanner):
 *    A classe Scanner permite ler o que o usuário digita no teclado. 
 *    - useLocale(Locale.US): Garante que o ponto '.' seja usado em decimais.
 *    - nextLine(): Lê uma linha inteira de texto.
 *    - nextInt(): Lê apenas o número inteiro.
 * 
 * VISÃO SENIOR SOBRE O BUFFER:
 * O método nextInt() não lê o caractere 'Enter' (\n). Se você usar um nextLine() 
 * logo em seguida, o Java lerá o 'Enter' vazio e pulará a entrada. 
 * Solução: Sempre use um scanner.nextLine() vazio após ler um número.
 */
public class Aula08_EntradaSaida {
    public static void executar() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("   AULA 08: INTERATIVIDADE E FORMATAÇÃO DE DADOS       ");
        System.out.println("-------------------------------------------------------");

        // 1. Demonstração de printf
        String nomeCompulsorio = "Sistema Senior";
        double versaoCore = 1.0;
        System.out.printf("LOG: %s inicializado na versao %.1f\n", nomeCompulsorio, versaoCore);

        // 2. Teoria de Scanner (Simulação para não travar o Maven)
        System.out.println("\n[EXEMPLO DE CÓDIGO PROFISSIONAL]:");
        System.out.println("   Scanner leitor = new Scanner(System.in);");
        System.out.println("   leitor.useLocale(Locale.US);");
        System.out.println("   System.out.print(\"Digite seu salario: \");");
        System.out.println("   double s = leitor.nextDouble();");
        System.out.println("   leitor.nextLine(); // Limpeza de buffer obrigatoria!");

        System.out.println("\n[VISÃO SENIOR]:");
        System.out.println("Sempre utilize 'scanner.close()' ao finalizar o uso da \nentrada para liberar recursos de memória do sistema operacional.");

        System.out.println("\n[DESAFIO DA AULA]:");
        System.out.println("Crie um formulário interativo que solicite:");
        System.out.println("   1. Nome completo (String)");
        System.out.println("   2. Idade (int)");
        System.out.println("   3. Peso (double)");
        System.out.println("Ao final, exiba uma frase formatada usando printf: \n\"Ola %s, voce tem %d anos e pesa %.1f kg.\"");

        System.out.println("\nQUESTÃO PARA REFLEXÃO:");
        System.out.println("Por que o método 'System.out.print' não pula linha \nautomaticamente como o 'System.out.println'?");
        System.out.println("-------------------------------------------------------\n");
    }
}
