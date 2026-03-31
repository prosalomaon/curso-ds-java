package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 02: INDEPENDÊNCIA DE IDE E TERMINAL
 * 
 * Antes de automatizar tudo em uma IDE (como IntelliJ ou VS Code), um desenvolvedor 
 * sênior deve dominar os fundamentos da compilação manual.
 * 
 * COMANDOS DE TERMINAL:
 * 1. javac Classe.java -> Compila o arquivo e gera o .class (bytecode).
 * 2. java Classe       -> Executa o bytecode na JVM.
 * 3. javac *.java      -> Compila TODOS os arquivos da pasta de uma vez.
 * 
 * A REGRA DO MÉTODO MAIN:
 * O Java exige exatamente a assinatura "public static void main(String[] args)" 
 * para que uma classe seja um PONTO DE ENTRADA do sistema. 
 * Nenhuma classe do seu projeto é obrigada a ter um 'main', EXCETO aquela que 
 * você deseja que seja a primeira a ser executada pelo computador.
 */
public class Aula02_InstalacaoTerminal {
    public static void executar() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("   AULA 02: INDEPENDÊNCIA DE IDE & TERMINAL            ");
        System.out.println("-------------------------------------------------------");

        System.out.println("1. COMPILAÇÃO SIMPLES:");
        System.out.println("   $ javac Aula02.java");
        
        System.out.println("\n2. COMPILAÇÃO DE MÚLTIPLOS ARQUIVOS:");
        System.out.println("   $ javac *.java");
        System.out.println("   (Isso compila todo o seu projeto de uma vez só)");

        System.out.println("\n[VISÃO SENIOR]:");
        System.out.println("O método 'main' é como a porta da frente de uma casa. \nUma casa pode ter muitos cômodos (classes), mas apenas a \nporta principal permite que você entre nela.");

        System.out.println("\n[DESAFIO DA AULA]:");
        System.out.println("1. Crie um arquivo texto chamado 'MeuHelloWorld.java'.");
        System.out.println("2. Escreva o código completo com o método main.");
        System.out.println("3. Abra o seu terminal, compile com 'javac' e rode com 'java'.");

        System.out.println("\nQUESTÃO PARA REFLEXÃO:");
        System.out.println("O que acontece se você tentar rodar o comando 'java' \nem uma classe que NÃO tenha o método main?");
        System.out.println("-------------------------------------------------------\n");
    }
}
