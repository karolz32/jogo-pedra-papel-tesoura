package jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    /*Um projetinho de jogo pra passar o tempo... */

    static int pontoMaquina = 0;
    static int pontoJogador = 0;

    public static void comparacao(int a, int b){
        switch (a){
            case 1:
                if (b == 1) {
                    System.out.println("Maquina escolheu: " + a);
                    empate();
                } else if (b == 2){
                    System.out.println("Maquina escolheu: " + a);
                    papelGanha();
                    pontoMaquina++;
                } else if (b == 3){
                    System.out.println("Maquina escolheu: " + a);
                    pedraGanha();
                    pontoJogador++;
                } else {
                    invalido();
                }
                break;
            case 2:
                if(b == 1){
                    System.out.println("Maquina escolheu: " + a);
                    papelGanha();
                    pontoMaquina++;
                }else if (b == 2){
                    System.out.println("Maquina escolheu: " + a);
                    empate();
                }else if (b == 3){
                    System.out.println("Maquina escolheu: " + a);
                    tesouraGanha();
                    pontoJogador++;
                }else {
                    invalido();
                }
                break;
            case 3:
                if (b == 1){
                    System.out.println("Maquina escolheu: " + a);
                    pedraGanha();
                    pontoJogador++;
                } else if (b == 2){
                    System.out.println("Maquina escolheu: " + a);
                    tesouraGanha();
                    pontoMaquina++;
                }else if (b == 3){
                    System.out.println("Maquina escolheu: " + a);
                    empate();
                }else {
                    invalido();
                }
                break;
            default:
                System.out.println("Maquina escolheu 0. Maquina burra.");
        }



    }

    private static void invalido() {
        System.out.println("Número inválido! Escolha entre 1 a 3.");
    }

    private static void pedraGanha() {
        System.out.println("Pedra ganhou!");
    }
    private static void papelGanha() {
        System.out.println("Papel ganhou!");
    }
    private static void tesouraGanha() {
        System.out.println("Tesoura ganhou!");
    }
    private static void empate() {
        System.out.println("Empate! Ponto para os dois competidores!");
        pontoMaquina++;
        pontoJogador++;
    }

    public static void main(String[] args) {

        int count = 0;
        while (count < 5) {
            count++; //count = count + 1;
            System.out.println("Partida " + count);

            Scanner scan = new Scanner(System.in);
            System.out.println("Escolha entre:\n1 - pedra\n2 - papel\n3 - tesoura");
            int b = scan.nextInt();
            Random random = new Random();
            int a = random.nextInt(3);
            Jogo.comparacao(a, b);
        }
        System.out.println("A pontuação final ficou: " + pontoJogador + " ponto(s) para o jogador e " + pontoMaquina + " ponto(s) para a máquina.");
    }



}
