// Escreva um programa para ler o número de gols marcados pelo Grêmio e o número de gols marcados pelo Inter em um GRENAL. 
//Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

import java.util.Scanner;

public class Atv16 {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Quantos gols o gremio marcou?");
            int gremio = in.nextInt();

        System.out.println("Quantos gols o Inter marcou?");
            int inter = in.nextInt();

        if (gremio == inter) {
            System.out.println("Ouve EMPATE! Jogo terminou " + gremio + " X " + inter);
        }

        if (gremio > inter) {
            System.out.println("O vencedor do jogo foi o Gremio!");
        } else {
            System.out.println("O vencedor do jogo foi o Inter!");
        }
    }
}