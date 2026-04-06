package br.com.etec.cursojava.modulo1_fundamentos;

/**
 * AULA 04: TIPOS DE DADOS E PADRÕES DE NOMENCLATURA
 * 
 * Java é uma linguagem fortemente tipada, ou seja, todo dado precisa ter
 * um tipo definido no momento da declaração. Isso aumenta a segurança,
 * evita erros e torna o código mais previsível.
 * 
 * CATEGORIAS DE TIPOS:
 * 
 * 1. TIPOS PRIMITIVOS:
 * São tipos básicos que armazenam o valor diretamente na memória (Stack).
 * 
 * Existem 8 tipos primitivos:
 * - byte    -> 8 bits (números pequenos)
 * - short   -> 16 bits
 * - int     -> 32 bits (mais usado)
 * - long    -> 64 bits (números grandes)
 * - float   -> 32 bits (decimais com menor precisão)
 * - double  -> 64 bits (decimais mais preciso - padrão)
 * - char    -> caractere único (Unicode)
 * - boolean -> true ou false
 * 
 * 2. TIPOS DE REFERÊNCIA:
 * Não armazenam o valor diretamente, mas sim o endereço na memória (Heap).
 * 
 * Exemplos:
 * - String
 * - Arrays
 * - Classes criadas pelo desenvolvedor
 * 
 * DIFERENÇA ENTRE PRIMITIVO E REFERÊNCIA:
 * - Primitivo: guarda o valor direto
 * - Referência: aponta para um objeto na memória
 * 
 * EXEMPLO:
 * int x = 10;              // valor direto
 * String nome = "João";    // referência para um objeto
 * 
 * WRAPPERS (VISÃO IMPORTANTE):
 * Para cada tipo primitivo existe uma classe equivalente:
 * 
 * int -> Integer
 * double -> Double
 * boolean -> Boolean
 * 
 * Esses tipos são usados quando precisamos trabalhar com objetos
 * (ex: listas, coleções, APIs).
 * 
 * PADRÕES DE NOMENCLATURA (NAMING CONVENTIONS):
 * 
 * Java utiliza o padrão CamelCase:
 * 
 * - Variáveis e métodos: camelCase
 *   Ex: saldoBancario, calcularMedia()
 * 
 * - Classes: pascalCase
 *   Ex: UsuarioSistema, ProdutoService
 * 
 * - Constantes: MAIÚSCULO com underscore
 *   Ex: TAXA_JUROS, VALOR_MAXIMO
 * 
 * REGRAS PARA VARIÁVEIS:
 * - Começar com letra, _ ou $
 * - Não começar com número
 * - Não usar espaços
 * - Evitar nomes genéricos (a, x, temp)
 * - Ser descritivo e claro
 * 
 * BOAS PRÁTICAS:
 * - Nomes devem explicar o propósito
 * - Evitar abreviações confusas
 * - Manter padrão consistente no projeto
 * 
 * ERROS COMUNS:
 * - Misturar tipos (ex: int com double)
 * - Usar nomes sem significado
 * - Confundir primitivo com wrapper
 * 
 * CONCLUSÃO:
 * Tipos garantem segurança e consistência.
 * Bons nomes tornam o código legível e profissional.
 */
public class Aula04_TiposPrimitivos {
    public static void executar() {
        System.out.println("\n-------------------------------------------------------");
        System.out.println("   AULA 04: TIPOS DE DADOS E CONVENÇÕES DE NOMES       ");
        System.out.println("-------------------------------------------------------");

        // Tipos primitivos
        int idadeUsuario = 25;
        double precoProduto = 199.90;
        char inicialDoNome= 'S';
        boolean processamentoConcluido = true;

        // Tipos de referência
        String mensagemBoasVindas = "Bem-vindo ao curso Senior Java";

        // Exemplo com wrapper
        Integer quantidadeItens = 10;

        System.out.println("Idade: " + idadeUsuario);
        System.out.println("Preço: R$ " + precoProduto);
        System.out.println("Inicial: " + inicialDoNome);
        System.out.println("Processamento concluído: " + processamentoConcluido);
        System.out.println("Mensagem: " + mensagemBoasVindas);
        System.out.println("Quantidade (Wrapper): " + quantidadeItens);

        System.out.println("\n[EXEMPLO PRÁTICO]:");
        double totalCompra = quantidadeItens * precoProduto;
        System.out.println("Total da compra: R$ " + totalCompra);

        System.out.println("\n[VISÃO SENIOR]:");
        System.out.println(
            "Código limpo depende mais de bons nomes do que de comentários. \nVariáveis bem nomeadas reduzem a necessidade de explicação.");
        
        System.out.println("\n[DICA IMPORTANTE]:");
        System.out.println(
            "Prefira 'double' ao invés de 'float' na maioria dos casos. \nEle oferece maior precisão para cálculos.");

        System.out.println("\n[DESAFIO DA AULA]:");
        System.out.println(
            "Corrija os erros abaixo:\n" +
            "1. double a = 10; (representa número de filhos)\n" +
            "2. int valor = 50.5;\n" +
            "3. String 1nome = 'Pedro';");

        System.out.println("\n[EXERCÍCIO EXTRA]:");
        System.out.println(
            "Crie variáveis para representar um cadastro de usuário:\n" +
            "- nome\n- idade\n- altura\n- ativo (boolean)");

        System.out.println("\nQUESTÃO PARA REFLEXÃO:");
        System.out.println(
            "Por que o Java possui tipos primitivos e também classes wrapper? \nEm quais situações cada um deve ser usado?");

        System.out.println("-------------------------------------------------------\n");
    }
}
