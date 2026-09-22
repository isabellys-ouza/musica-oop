package com.github.isabellys_ouza.musicaoop.model;

import com.github.isabellys_ouza.musicaoop.interfaces.Exibe;

abstract  class Audio {
    private String titulo;
    private int duracaoSegundos;
    private int totalReproducao;
    private int totalCurtidas;

    public Audio(String titulo, int duracaoSegundos){
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
    }

    public void infosIniciais(){
        System.out.println("------------ INFO --------------");
        System.out.println("Titulo: " + titulo);
        System.out.printf("Duração: %d:%02d\n", duracaoSegundos / 60, duracaoSegundos % 60);
    }

    public void reproduzir(){
        totalReproducao++;
    }

    public void curtir(){
        totalCurtidas++;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }
}



