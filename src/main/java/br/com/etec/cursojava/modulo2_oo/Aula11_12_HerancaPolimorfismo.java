package br.com.etec.cursojava.modulo2_oo;

public class Aula11_12_HerancaPolimorfismo {
    public static void executar() {
        System.out.println("--- Aula 11 e 12: Herança e Polimorfismo ---");
        System.out.println("Exemplo Real: Sistema de RH onde Gerentes e Diretores 'são' Funcionários, mas calculam bônus salariais de maneiras diferentes.");
        
        Funcionario func = new Funcionario("Ana");
        Gerente gerente = new Gerente("Carlos", 2000.0);
        
        System.out.println(func.getNome() + " tem bônus de: R$ " + func.calcularBonus());
        System.out.println(gerente.getNome() + " tem bônus de: R$ " + gerente.calcularBonus());
    }
}

class Funcionario {
    protected String nome;
    
    public Funcionario(String nome) {
        this.nome = nome;
    }
    public String getNome() { return nome; }
    
    public double calcularBonus() {
        return 500.0; // bônus padrão
    }
}

class Gerente extends Funcionario {
    private double gratificacao;
    
    public Gerente(String nome, double gratificacao) {
        super(nome);
        this.gratificacao = gratificacao;
    }
    
    @Override
    public double calcularBonus() {
        return super.calcularBonus() + gratificacao;
    }
}
