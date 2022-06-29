// Um zoológico muito louco
//Escreva um programa que leia a idade de 2 javalis e 2 girafas (considere que a idade dos javalis será sempre diferente, assim como das girafas ). 
//Calcule e escreva a soma das idades do javali mais velho com a girafa mais nova, e o produto das idades do javali mais novo com a girafa mais velha.

import java.util.Scanner;

public class Atv21 {
    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("Digite a idade do primeiro Javali: ");
            int javali1 = in.nextInt();
        System.out.println("Digite a idade do segundo Javali: ");
            int javali2 = in.nextInt();
        System.out.println("Digite a idade da primeira girafa: ");
            int girafa1 = in.nextInt();
        System.out.println("Digite a idade da segunda girafa");
            int girafa2 = in.nextInt();

        if (javali1 > javali2 && girafa1 < girafa2) {
            System.out.println("A soma das idades do Javali mais velho com a Girafa mais nova e " + (javali1 + girafa1));
        } else if (javali1 < javali2 && girafa1 > girafa2) {
            System.out.println ("A soma das idades do Girafa mais velho com a Javali mais nova e " + (javali2+ girafa2));
        }
    }
}