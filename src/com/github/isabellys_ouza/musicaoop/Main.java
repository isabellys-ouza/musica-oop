package com.github.isabellys_ouza.musicaoop;

import com.github.isabellys_ouza.musicaoop.model.Musica;
import com.github.isabellys_ouza.musicaoop.model.Podcast;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Musica bohemianRhapsody = new Musica("Bohemian Rhapsody", 354, "Queen", "Rock", "A Night at the Opera");
        Musica billieJean = new Musica("Billie Jean", 294, "Michael Jackson", "Pop", "Thriller");

        Podcast javaSemMisterio = new Podcast("Java sem Mistério", 1800, "Carlos Lima", "Conceitos de Java explicados do zero", 15);
        Podcast culturaEmPauta = new Podcast("Cultura em Pauta", 3600, "Marina Alves", "Debates sobre música, cinema e literatura", 28);

        Scanner input = new Scanner(System.in);
        int op;

        do {
            System.out.println("--------- MENU ----------");
            System.out.println("1. " + bohemianRhapsody.getTitulo());
            System.out.println("2. " + billieJean.getTitulo());
            System.out.println("3. " + javaSemMisterio.getTitulo());
            System.out.println("4. " + culturaEmPauta.getTitulo());
            System.out.println("5. Sair");
            System.out.println("Digite uma opção para a exibir info: ");
            op = input.nextInt();

            switch (op) {
                case 1 -> {
                    bohemianRhapsody.ficha();
                }
                case 2 -> {
                    billieJean.ficha();
                }
                case 3 -> {
                    javaSemMisterio.ficha();
                }
                case 4 -> {
                    culturaEmPauta.ficha();
                }
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção invalida!");
            }

        } while (op != 5);

    }
}
