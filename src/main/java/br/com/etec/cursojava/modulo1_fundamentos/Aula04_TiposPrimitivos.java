package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 04: TIPOS DE DADOS E PADRÕES DE NOMENCLATURA
 * 
 * Java é uma linguagem fortemente tipada. Isso significa que o compilador é 
 * rigoroso: você deve declarar o tipo de cada dado explicitamente.
 * 
 * CATEGORIAS DE TIPOS:
 * 1. Primitivos: São tipos básicos que armazenam o valor diretamente na memória 
 *    (Stack). Existem 8: byte, short, int, long, float, double, char e boolean.
 * 2. Referência: São objetos que armazenam o endereço de memória onde o dado 
 *    real está (Heap). Exemplo: String, Arrays e Classes personalizadas.
 * 
 * PADRÕES DE NOMENCLATURA (NAMING CONVENTIONS):
 * Um desenvolvedor sênior segue padrões para que o código seja legível por qualquer 
 * membro da equipe. O padrão do Java é o CamelCase.
 * 
 * REGRAS PARA VARIÁVEIS:
 * - Devem começar com letra minúscula (ex: saldoBancario).
 * - Não podem começar com números.
 * - Não podem conter espaços ou caracteres especiais (exceto _ e $).
 * - Devem ser INTENCIONAIS: evite 'x', 'a', 'temp'. Use 'temperaturaAmbiente'.
 */
public class Aula04_TiposPrimitivos {
    public static void executar() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("   AULA 04: TIPOS DE DADOS E CONVENÇÕES DE NOMES       ");
        System.out.println("-------------------------------------------------------");

        // Exemplos de Tipos Primitivos de uso comum
        int idadeUsuario = 25; // Inteiro padrão (32 bits)
        double precoProduto = 199.90; // Decimal padrão (64 bits)
        char inicialDoNome = 'J'; // Único caractere (Unicode)
        boolean processamentoConcluido = true; // Lógico

        // Exemplo de Tipo de Referência
        String mensagemBoasVindas = "Bem-vindo ao curso Senior Java";

        System.out.println("1. TIPO PRIMITIVO (int): " + idadeUsuario);
        System.out.println("2. TIPO PRIMITIVO (double): " + precoProduto);
        System.out.println("3. TIPO REFERÊNCIA (String): " + mensagemBoasVindas);

        System.out.println("\n[VISÃO SENIOR]:");
        System.out.println("Nomes de variáveis são a documentação mais importante do \nseu sistema. Se você precisa de um comentário para explicar \no que uma variável faz, o nome dela está mal escolhido.");

        System.out.println("\n[DESAFIO DA AULA]:");
        System.out.println("Identifique e corrija os erros de nomenclatura e tipos abaixo:");
        System.out.println("   double a = 10; (a é o número de filhos)");
        System.out.println("   int $valor = 50.5; (valor em dinheiro)");
        System.out.println("   String 1nome = 'Pedro';");

        System.out.println("\nQUESTÃO PARA REFLEXÃO:");
        System.out.println("Por que o Java diferencia 'int' (primitivo) de 'Integer' (referência)?");
        System.out.println("-------------------------------------------------------\n");
    }
}
