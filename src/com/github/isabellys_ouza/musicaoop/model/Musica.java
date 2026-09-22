package com.github.isabellys_ouza.musicaoop.model;

import com.github.isabellys_ouza.musicaoop.interfaces.Exibe;

public class Musica extends Audio implements Exibe {
    private String artista;
    private String genero;
    private String album;

    public Musica(String titulo, int duracaoSegundos, String artista, String genero, String album) {
        super(titulo, duracaoSegundos);
        this.artista = artista;
        this.genero = genero;
        this.album = album;
    }

    @Override
    public void ficha() {
        reproduzir();
        curtir();
        infosIniciais();
        System.out.println("Artista: " + artista);
        System.out.println("Genero: " + genero);
        System.out.println("Album: " + album);
        System.out.println("Você reproduziu essa musica " + getTotalReproducao() + "vezes!");
        System.out.println("Você curtiu essa musica " + getTotalCurtidas() + "vezes!");
    }

    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

}
