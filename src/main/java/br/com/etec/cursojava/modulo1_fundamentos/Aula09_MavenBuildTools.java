package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 09: MAVEN E GESTÃO DE DEPENDÊNCIAS
 * 
 * Antes do Maven, desenvolvedores Java precisavam baixar arquivos .JAR (bibliotecas) 
 * manualmente e adicioná-los ao projeto. O Maven automatizou esse processo caótico.
 * 
 * ESTRUTURA PADRÃO MAVEN:
 * - src/main/java: Onde o código-fonte reside.
 * - src/main/resources: Arquivos de configuração e imagens.
 * - src/test/java: Onde os testes automatizados são escritos.
 * - pom.xml: O Project Object Model, o coração do projeto.
 * 
 * O REPOSITÓRIO:
 * 1. Repositório Central: Um servidor na internet onde o Maven busca as bibliotecas.
 * 2. Repositório Local: Uma pasta no seu computador (geralmente ~/.m2/repository) 
 *    onde o Maven guarda as bibliotecas baixadas para não precisar baixar de novo.
 * 
 * POM.XML - O QUE ELE DEFINE:
 * - GroupId: O "sobrenome" do projeto (geralmente br.com.empresa).
 * - ArtifactId: O "nome" do projeto.
 * - Version: A versão atual do software.
 * - Dependencies: Lista de bibliotecas que o seu projeto precisa para rodar.
 */
public class Aula09_MavenBuildTools {
    public static void executar() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("   AULA 09: MAVEN E AUTOMAÇÃO DE PROJETOS JAVA         ");
        System.out.println("-------------------------------------------------------");

        System.out.println("1. POM.XML: Gerenciador central de configurações.");
        System.out.println("2. REPOSITÓRIO LOCAL (~/.m2): Cache de bibliotecas.");
        System.out.println("3. DEPENDÊNCIAS: O fim do download manual de JARs.");

        System.out.println("\n[VISÃO SENIOR]:");
        System.out.println("O Maven garante que todos os desenvolvedores de uma \nequipe estejam usando EXATAMENTE as mesmas versões de \nbibliotecas, evitando o famoso erro: 'Na minha máquina funciona'.");

        System.out.println("\n[DESAFIO DA AULA]:");
        System.out.println("Abra o arquivo 'pom.xml' na raiz deste projeto. \nIdentifique as seções <groupId>, <artifactId> e <version>. \nQual a versão do Java que está sendo utilizada?");

        System.out.println("\nQUESTÃO PARA REFLEXÃO:");
        System.out.println("O que aconteceria se o repositório oficial do Maven ficasse fora do ar?");
        System.out.println("-------------------------------------------------------\n");
    }
}
