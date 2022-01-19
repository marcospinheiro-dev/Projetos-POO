package com.livros;

public class Main {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 25, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Apenedendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria josé", 800, p[0]);

        l[0].abrir();
        l[0].folhear(600);

        System.out.println(l[0].detalhes());
    }

}
