package org.example.jogo;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Campo[][] jogo = new Campo[3][3];
        char simboloAtual = '0';
        Boolean gameInProgress = true;
        String vitoria = "";
        Scanner scan = new Scanner(System.in);

        /*logica  principal do jogo*/
        while(gameInProgress) {
            desenhaJogo(jogo);
            vitoria = verificaVitoriaJogo(jogo);
            if(!vitoria.equals("")) {
                System.out.printf("Jogador %s vencedor da partida!%n", vitoria);
                break;
            }
            try {
              if(verificarJogada(jogo, jogar(scan, simboloAtual),simboloAtual)) {
                  if(simboloAtual=='0'){
                      simboloAtual='1';
                  }else {
                      simboloAtual='0';
                  }
              }

            }catch (Exception e){
                System.out.printf("Error");
            }
        }
        System.out.println("Fim do jogo");

    }

    /*metodo responsável por redesenhar o tabuleiro com os novos campos*/
    public static void desenhaJogo(Campo[][] jogo){
        limparTelaJogo();
        System.out.println("     0    1    2");
        System.out.printf("0    %c | %c | %c %n", jogo[0][0].getSimbolo(), jogo[0][1].getSimbolo(), jogo[0][2].getSimbolo());
        System.out.println("     ----------");
        System.out.printf("1    %c | %c | %c %n", jogo[1][0].getSimbolo(), jogo[1][1].getSimbolo(), jogo[1][2].getSimbolo());
        System.out.println("     ----------");
        System.out.printf("2    %c | %c | %c %n", jogo[2][0].getSimbolo(), jogo[2][1].getSimbolo(), jogo[2][2].getSimbolo());
    }

    public static void limparTelaJogo(){
        for(int count=0; count < 200; count++){
            System.out.println(" ");
        }
    }

    public static int[] jogar( Scanner scan, char simboloAtual ){
        int[] p = new int[2];
        System.out.printf("%s %c%n", "Quem Joga: ", simboloAtual);
        System.out.print("Informa a linha:");
        p[0] = scan.nextInt();
        System.out.print("Informa a coluna:");
        p[1] = scan.nextInt();
        return p;
    }


    public static Boolean verificarJogada(Campo[][] jogo, int p[], char simboloAtual){
        if(jogo[p[0]][p[1]].getSimbolo() ==' '){
            jogo[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    }

    public static String verificaVitoriaJogo(Campo[][] jogo){
        return "";
    }
}
