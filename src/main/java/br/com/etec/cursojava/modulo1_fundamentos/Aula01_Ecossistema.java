package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 01: O ECOSSISTEMA JAVA
 * 
 * Java não é apenas uma linguagem, mas sim uma PLATAFORMA completa.
 * Isso significa que ele oferece ferramentas, ambiente de execução
 * e uma arquitetura própria para desenvolvimento de sistemas.
 * 
 * HISTÓRICO:
 * Java foi criado pela empresa Sun Microsystems (hoje pertence à Oracle)
 * com o objetivo de ser uma linguagem PORTÁVEL, ou seja, capaz de rodar em
 * diferentes sistemas operacionais sem precisar ser reescrita.
 * 
 * Seu principal slogan é:
 * "Write Once, Run anywhere" (Escreva uma vez, rode em qualquer lugar).
 * 
 * COMO O JAVA FUNCIONA (VISÃO GERAL):
 * 1. Você escreve o código em um arquivo .java
 * 2. O compilador (javac) transforma esse código em BYTECODE (.class)
 * 3. A JVM (Java Virtual Machine) interpreta/executa esse bytecode no sistema operacional
 * 
 * COMPONENTES DO ECOSSISTEMA:
 * 
 * 1. JDK (Java Development Kit):
 * É a "caixa de ferramentas" do desenvolvedor.
 * Inclui:
 * - Compilador (javac): Transforma código fonte (.java) em bytecode (.class).
 * - Debugger: Ajuda a encontrar e corrigir erros no código.
 * - Bibliotecas padrão: Conjunto de códigos pré-escritos para facilitar tarefas comuns
 * (ex: manipulação de arquivos, redes, etc).
 * - Ferramentas de desenvolvimento: Gerenciamento de pacotes, documentação, etc.
 * 
 * Sem o JDK, você NÃO conseguiria criar ou compilar seus programas Java.
 * 
 * 2. JRE (Java Runtime Environment):
 * É o ambiente necessário para EXECUTAR programas Java.
 * Inclui:
 * - JVM: A máquina virtual que executa o bytecode.
 * - Bibliotecas necessárias para rodar aplicações Java.
 * 
 * Usuários finais normalmente só precisam do JRE para rodar programas Java,
 * mas os desenvolvedores precisam do JDK para criar e compilar seus códigos.
 * 
 * 3. JVM (Java Virtual Machine):
 * É o "coração" do Java.
 * Responsável por:
 * - Executar o bytecode gerado pelo compilador.
 * - Gerenciar memória (Garbage Collector).
 * - Garantir segurança e portabilidade do código.
 * 
 * Cada sistema operacional tem sua própria JVM.
 * 
 * O QUE É BYTECODE?
 * É um códico intermediário gerado pelo compilador Java.
 * Ele NÃO é código de máquina direto, mas também não é código-fonte.
 * É isso que permite o Java ser multiplataforma.
 * 
 * O QUE É O JIT (Just-In-Time Compiler)?
 * O JIT é uma parte inteligente da JVM.
 * 
 * Em vez de interpretar o código o tempo todo (o que seria lento),
 * ele identifica partes do código que são executadas com frequência
 * e as converte em código de máquina nativo para acelerar a execução.
 * 
 * Isso faz com que:
 * - O programa comece mais lento
 * - Mas fique mais rápido com o tempo ("aquecimento da JVM")
 * 
 * GERENCIAMENTO DE MEMÓRIA:
 * A JVM possui um sistema chamado Garbage Collector (GC),
 * que remove automaticamente objetos que não estão mais sendo usados.
 * 
 * Isso evita:
 * - Vazamento de memória (memory leak)
 * - Erros comuns em linguagens como C/C++
 * 
 * VANTAGENS DO JAVA:
 * - Portabilidade (roda em qualquer sistema com JVM)
 * - Segurança (isolamento via JVM)
 * - Grande comunidade
 * - Muito usado em sistemas corporativos, Android e backend
 * 
 * DESVANTAGENS:
 * - Pode ser mais lento que linguagens nativas (em alguns casos)
 * - Consome mais memória devido à JVM
 * 
 * COMPARAÇÂO:
 * 
 * C++ (Compilado):
 * - Código vira diretamente código de máquina
 * - Mais rápido, mas menos seguro (vulnerável a bugs de memória)
 * - Menos portável (precisa ser recompilado para cada sistema)
 * 
 * Java (Compilado + Interpretado):
 * - Compila para bytecode, depois interpretado pela JVM
 * - Executa via JVM, o que pode ser mais lento, mas é mais seguro
 * - Mais portátil (roda em qualquer sistema com JVM)
 * 
 * CONCLUSÃO:
 * O Java equilibra desempenho, segurança e portabilidade,
 * sendo uma das linguagens mais utilizadas no mundo.
 */
public class Aula01_Ecossistema {
  public static void executar() {
    System.out.println("\n-------------------------------------------------------");
    System.out.println("   AULA 01: ECOSSISTEMA E ARQUITETURA JAVA             ");
    System.out.println("-------------------------------------------------------");

    System.out.println("\n[FLUXO DO JAVA]:");
    System.out.println("Código (.java) -> Bytecode (.class) -> JVM -> Execução ");

    System.out.println("\n[COMPONENTES]:");
    System.out.println("1. JDK -> Ferramentas para o Desenvolvedor (Criar).");
    System.out.println("2. JRE -> Ambiente para o Usuário Final (Rodar).");
    System.out.println("3. JVM -> A Máquina Virtual que executa o código.");

    System.out.println("\n[EXEMPLO PRÁTICO]:");
    System.out.println("Você desenvolve um sistema em Windows.");
    System.out.println("Esse mesmo sistema pode rodar no Linux sem alteração!");

    System.out.println("\n[VISÃO SENIOR]:");
    System.out.println(
        "Dominar o ecossistema Java permite configurar ambientes, \\nentender performance e resolver problemas avançados em produção.");

    System.out.println("\n[DICA IMPORTANTE]:");
    System.out.println(
      "Sempre verifique a versão do JDK e da JVM, pois isso pode \nafetar compatibilidade e desempenho.");

    System.out.println("\n[DESAFIO DA AULA]:");
    System.out.println(
        "Pesquise e explique com suas palavras a diferença entre:\\n- Compilação\\n- Interpretação\\n- Bytecode");

    System.out.println("\n[QUESTÃO PARA REFLEXÃO]:");
    System.out.println(
        "Se o Java roda em uma 'Máquina Virtual', ele é mais lento \\nou mais seguro que programas nativos? Justifique.");
    
    System.out.println("\n[EXERCÍCIO EXTRA]:");
    System.out.println(
        "1. Instale o JDK na sua máquina\n2. Execute o comando 'java -version'\n3. Descubra qual versão você está usando");
    
    System.out.println("-------------------------------------------------------\n");
  }
}
