package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 02: INDEPENDÊNCIA DE IDE E TERMINAL
 * 
 * Um desenvolvedor iniciante normalmente depende de IDEs (IntelliJ, Eclipse, VS Code),
 * mas um desenvolvedor mais experiente entende o que acontece POR TRÁS dessas ferramentas.
 * 
 * IDEs automatizam tarefas, mas o terminal revela como o Java realmente funciona.
 * Dominar o terminal significa ter CONTROLE TOTAL sobre o processo de compilação e execução.
 * 
 * POR QUE ISSO É IMPORTANTE?
 * - Ambientes de servidor (produção) muitas vezes não usam IDEs, apenas terminal.
 * - Entendimento real do processo de build e execução.
 * - Facilidade para resolver erros e bugs que a IDE pode esconder.
 * - Base para ferramentas como Maven, Grandle e Docker, etc.
 * 
 * ESTRUTURA DE UM PROJETO JAVA SIMPLES:
 * - Arquivos .java (código-fonte)
 * - Arquivos .class (bytecode gerado pelo compilador)
 * 
 * COMANDOS DE TERMINAL:
 * 
 * 1. javac Classe.java
 * Compila o código-fonte e gera um arquivo .class (bytecode).
 * 
 * 2. java Classe
 * Executa o bytecode na JVM
 * OBS: NÃO coloque ".class" no comando!
 * 
 * 3. javac *.java
 * Compila todos os arquivos da pasta de uma vez só.
 * 
 * 4. java -version
 * Mostra a versão do Java instalada no sistema.
 * 
 * 5. javac -version
 * Mostra a versão do compilador Java (JDK) instalada.
 * 
 * COMO FUNCIONA NA PRÁTICA:
 * 
 * Arquivo: Hello.java
 * -> javac Hello.java   (gera Hello.class)
 * -> java Hello         (executa o bytecode na JVM)
 * 
 * O QUE É O MÉTODO MAIN?
 * 
 * public static void main(String[] args)
 * 
 * Vamos entender cada parte:
 * 
 * - public -> Pode ser acessado de qualquer lugar
 * - static -> Não precisa criar objeto para executar
 * - void -> Não retorna valor
 * - main -> Nome obrigatório (ponto de entrada)
 * - String[] args -> Argumentos de linha de comando
 * 
 * ARGUMENTOS DE LINHA DE COMANDO:
 * Você pode passar informações ao rodar o programa:
 * 
 * Exemplo:
 * $ java Hello João 17
 * 
 * Dentro do código:
 * args[0] = "João"
 * args[1] = "17"
 * 
 * Isso é muito usado em sistemas reais e scripts.
 * 
 * O QUE ACONTECE SE NÃO TIVER O MÉTODO MAIN?
 * A JVM NÃO consegue iniciar o programa e gera erro:
 * 
 * "Main method not found..."
 * 
 * Isso porque ela não sabe por onde começar a execução.
 * 
 * BOAS PRÁTICAS:
 * - Nome da classe deve ser igual ao nome do arquivo
 * - Evite espaços no nome dos arquivos
 * - Use padrão CamelCase (Ex: MinhaClasseJava)
 * 
 * DIFERENÇA ENTRE TERMINAL E IDE:
 * 
 * IDE:
 * - Automatiza tudo
 * - Mais produtivo
 * - Esconde detalhes importantes
 * 
 * TERMINAL:
 * - Mais controle
 * - Mais aprendizado
 * - Essencial para ambientes profissionais
 * 
 * CONCLUSÃO:
 * Um bom desenvolvedor sabe usar IDE, mas NÃO depende dela.
 */
public class Aula02_InstalacaoTerminal {
    public static void executar() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("   AULA 02: INDEPENDÊNCIA DE IDE & TERMINAL            ");
        System.out.println("-------------------------------------------------------");

        System.out.println("\n[PASSO A PASSO]:");
        System.out.println("1. Criar arquivo .java");
        System.out.println("2. Compilar com javac");
        System.out.println("3. Executar com java");

        System.out.println("\n[COMPILAÇÃO SIMPLES]:");
        System.out.println("   $ javac Aula02.java");
        
        System.out.println("\n[COMPILAÇÃO DE MÚLTIPLOS ARQUIVOS]:");
        System.out.println("   $ javac *.java");
        System.out.println("   (Compila todos os arquivos da pasta de uma vez)");

        System.out.println("\n[VERIFICANDO INSTALAÇÃO]:");
        System.out.println("   $ java -version");
        System.out.println("   $ javac -version");

        System.out.println("\n[EXEMPLO COM ARGUMENTOS]:");
        System.out.println("   $ java Programa Maria 20");

        System.out.println("\n[VISÃO SENIOR]:");
        System.out.println("O método 'main' é o ponto de entrada do sistema. \\nSem ele, a JVM não sabe onde começar. \\nDominar isso é essencial para entender qualquer aplicação Java.");

        System.out.println("\n[DICA IMPORTANTE]:");
        System.out.println(
            "Sempre compile antes de executar. \nSe alterar o código e esquecer de compilar, \nvocê estará rodando uma versão antiga.");

        System.out.println("\n[DESAFIO DA AULA]:");
        System.out.println("1. Crie 'MeuHelloWorld.java'");
        System.out.println("2. Imrpima seu nome na tela");
        System.out.println("3. Compile e execute via terminal");
        System.out.println("4. Modifique o código e rode novamente");

        System.out.println("\n[EXERCÍCIO EXTRA]:");
        System.out.println(
            "Crie um programa que receba dois números via args \ne imprima a soma deles.");

        System.out.println("\nQUESTÃO PARA REFLEXÃO:");
        System.out.println(
        "Por que grandes sistemas utilizam ferramentas como Maven \nou Grandle ao invés de apenas 'javac'?");

        System.out.println("-------------------------------------------------------\n");
    }
}
