//Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, 
//o último e o maior de todos eles (considere que todos os números informados serão diferentes)

import java.util.Scanner;

public class Atv5 {
    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

            System.out.println("Digite o primeiro numero: ");
            int n1 = in.nextInt();

            System.out.println("Digite o segundo numero: ");
            int n2 = in.nextInt();

            System.out.println("Digite o terceiro numero: ");
            int n3 = in.nextInt();

            System.out.println("Digite o quarto numero: ");
            int n4 = in.nextInt();

            System.out.println("O primeiro valor digitado foi " + n1 + ".");
            System.out.println("O ultimo valor digitado foi " + n4 + ".");

            if (n1 > n2 && n1 > n3 && n1 > n4) {
                System.out.println("O maior valor digitado foi " + n1 + ".");
            } else if (n2 > n1 && n2 > n3 && n2 > n4) {
                System.out.println("O maior valor digitado foi " + n2 + ".");
            } else if (n3 > n1 && n3 > n2 && n3 > n4) {
                System.out.println("O maior valor digitado foi " + n3 + ".");
            } else {
                System.out.println("O maior valor digitado foi " + n4 + ".");
            }
            in.close();
    }
}