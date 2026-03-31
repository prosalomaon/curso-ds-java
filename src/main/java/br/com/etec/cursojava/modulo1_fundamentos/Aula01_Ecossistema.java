package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 01: O ECOSSISTEMA JAVA
 * 
 * Java não é apenas uma linguagem, mas uma plataforma robusta.
 * Para quem está começando "do zero", imagine o Java como um tradutor
 * universal.
 * 
 * COMPONENTES DO ECOSSISTEMA:
 * 1. JDK (Java Development Kit): É a sua "caixa de ferramentas". Contém tudo o
 * que
 * é necessário para criar o software, incluindo o compilador (javac).
 * 2. JRE (Java Runtime Environment): É o "combustível". É o que o computador do
 * cliente precisa ter instalado para conseguir rodar o seu programa.
 * 3. JVM (Java Virtual Machine): É o "motor". Ela lê o seu código já traduzido
 * (bytecode) e o executa no sistema operacional (Windows, Linux, Mac).
 * 
 * O QUE É O JIT (Just-In-Time Compiler)?
 * O JIT é uma parte inteligente da JVM. Em vez de traduzir o código linha por
 * linha
 * o tempo todo (o que seria lento), o JIT identifica as partes do seu código
 * que
 * rodam com muita frequência e as transforma em código de máquina nativo (ultra
 * rápido).
 * Isso faz com que o Java fique mais veloz à medida que o programa "esquenta".
 */
public class Aula01_Ecossistema {
  public static void executar() {
    System.out.println("\n-------------------------------------------------------");
    System.out.println("   AULA 01: ECOSSISTEMA E ARQUITETURA JAVA             ");
    System.out.println("-------------------------------------------------------");

    System.out.println("1. JDK -> Ferramentas para o Desenvolvedor (Criar).");
    System.out.println("2. JRE -> Ambiente para o Usuário Final (Rodar).");
    System.out.println("3. JVM -> A Máquina Virtual que executa o código.");

    System.out.println("\n[VISÃO SENIOR]:");
    System.out.println(
        "Entender esses conceitos permite que você configure ambientes \nde produção e resolva bugs de performance que outros ignoram.");

    System.out.println("\n[DESAFIO DA AULA]:");
    System.out.println(
        "Pesquise e anote: Qual a principal diferença entre uma \nlinguagem puramente COMPILADA (como C++) e uma INTERPRETADA \ncomo o Java (via Bytecode)?");

    System.out.println("\nQUESTÃO PARA REFLEXÃO:");
    System.out.println(
        "Se o Java roda em uma 'Máquina Virtual', ele é mais lento ou \nmais seguro que programas que rodam direto no Windows?");
    System.out.println("-------------------------------------------------------\n");
  }
}
