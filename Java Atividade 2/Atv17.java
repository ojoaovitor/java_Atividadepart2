// Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).


import java.util.Scanner;

public class Atv17 {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Digite a quantidade de lados do poligono: ");
            int lado = in.nextInt();

        System.out.println("Digite a medida do lado em CM: ");
            int medida = in.nextInt();

        int t = medida * 3;
        int q = medida * 4;

        if (lado == 3) {
            System.out.println("TRIANGULO e seu perimetro e " + t);
        } else if (lado < 3) {
            System.out.println("NAO E UM POLIGONO!");
        } else if (lado == 4) {
            System.out.println("QUADRADO e sua area e " + q);
        } else if (lado == 5){
            System.out.println("PENTAGONO");
        } else if (lado > 5) {
            System.out.println("POLIGONO NAO IDENTIFICADO!");
        }
    }
}
