package org.example.jogo;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Campo[][] jogo = new Campo[3][3];
        char simboloAtual = '0';
        Boolean gameInProgress = true;
        String votoria = "";
        Scanner scan = new Scanner(System.in);
    }
    /*metodo responsável por redesenhar o tabuleiro com os novos campos*/
    public static void desenhaJogo(Campo[][] jogo){
        System.out.println("     0    1    2");
        System.out.printf("0    %c | %c | %c %n", jogo[0][0].getSimbolo(), jogo[0][1].getSimbolo(), jogo[0][2].getSimbolo());
        System.out.println("     ----------");
        System.out.printf("1    %c | %c | %c %n", jogo[1][0].getSimbolo(), jogo[1][1].getSimbolo(), jogo[1][2].getSimbolo());
        System.out.println("     ----------");
        System.out.printf("2    %c | %c | %c %n", jogo[2][0].getSimbolo(), jogo[2][1].getSimbolo(), jogo[2][2].getSimbolo());
    }

}
