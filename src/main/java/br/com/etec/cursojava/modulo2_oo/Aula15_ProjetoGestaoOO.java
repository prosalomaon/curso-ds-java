package br.com.etec.cursojava.modulo2_oo;

import java.util.ArrayList;
import java.util.List;

public class Aula15_ProjetoGestaoOO {
    public static void executar() {
        System.out.println("--- Aula 15: Projeto Gestão de Biblioteca (Aplicando OO) ---");
        System.out.println("Exemplo Real: Pequeno sistema de gerenciamento aplicando Listas (ArrayList), Objetos e Métodos.");
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro("Java: Como Programar", "Deitel"));
        biblioteca.adicionarLivro(new Livro("Clean Code", "Robert C. Martin"));
        
        System.out.println("Livros disponíveis na Biblioteca:");
        biblioteca.listarLivros();
    }
}

class Livro {
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo + " (por " + autor + ")";
    }
}

class Biblioteca {
    List<Livro> acervo = new ArrayList<>();
    
    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }
    
    public void listarLivros() {
        for(Livro l : acervo) {
            System.out.println("- " + l.toString());
        }
    }
}
