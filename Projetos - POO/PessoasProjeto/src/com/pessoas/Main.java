package com.pessoas;

public class Main {

    public static void main(String[] args) {
	// Programa principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Marcos");
        p1.setSexo("M");
        p1.setIdade(56);
        p2.setNome("Aninha");
        p2.setSexo("F");
        p2.setMat(25);
        p2.setCurso("Programação");
        p2.setIdade(21);
        p3.setNome("Lucas");
        p3.setSalario(3500.45f);
        p3.receberAumento(500);
        p3.setEspecialidade("Matemática");
        p3.setSexo("M");
        p3.setIdade(27);
        p4.setIdade(24);
        p4.setSexo("F");


        p4.setSetor("Comercial");
        p4.setNome("Adelly");
        p4.mudaTrabalho();



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
