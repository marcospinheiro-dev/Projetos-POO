package com.animais;

public class Main {

    public static void main(String[] args) {
	//Programa principal
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();
        Lobo l = new Lobo();

        m.setCorPelo("Marron");
        m.alimentar();
        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();
        a.setCorPena("colorida");
        a.setPeso(3.5f);
        c.locomover();
        k.emitirSom();
        l.emitirSom();
        k.locomover();
        k.reagir("Olá");
        k.reagir(11, 45);
        k.reagir(21, 00);
        k.reagir(true);
        k.reagir(false);

        System.out.println(m.toString());
        System.out.println(a.toString());

    }
}
