package com.controlador;

public class Main {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        //c.ligar();
        c.menosVolume();
        c.maisVolume();
        //c.ligarMudo();
        c.play();
        c.pause();
        c.abrirMenu();
        c.fecharMenu();
    }
}
