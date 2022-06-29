// Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. 
//Escreva o valor final da soma efetuada e também todos valores que o usuário informou.  

import java.util.Scanner;

public class Atv7 {
    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        int soma = 0;
        int num = 0;

        for ( int count = 1; count <= 6; count++) {
            System.out.println("Digite o " + count + "° numero: ");
            num = in.nextInt();

            if (num < 72 ){
                soma += num;
            }
        }
        
        System.out.println("A soma total dos valores foi " + soma + ".");
    }
}