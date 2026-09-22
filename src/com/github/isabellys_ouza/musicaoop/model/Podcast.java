package com.github.isabellys_ouza.musicaoop.model;

import com.github.isabellys_ouza.musicaoop.interfaces.Exibe;

public class Podcast extends Audio implements Exibe {
    private String apresentador;
    private String descricao;
    private int numEps;

    public Podcast(String titulo, int duracaoSegundos, String apresentador, String descricao, int numEps) {
        super(titulo, duracaoSegundos);
        this.apresentador = apresentador;
        this.descricao = descricao;
        this.numEps = numEps;
    }


    @Override
    public void ficha() {
        reproduzir();
        curtir();
        infosIniciais();
        System.out.println("Apresentador: " + apresentador);
        System.out.println("Descrição: " + descricao);
        System.out.println("Numero de eps: " + numEps);
        System.out.println("Você reproduziu esse podcast " + getTotalReproducao() + "vezes!");
        System.out.println("Você curtiu esse podcast " + getTotalCurtidas() + "vezes!");

    }

    public String getApresentador() {
        return apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumEps() {
        return numEps;
    }
}
