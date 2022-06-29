//Faça um programa que leia 10 números informados pelo usuário e ao 
//final da leitura escrever a soma total dos 10 números lidos.

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        int soma = 0;
        int num = 0;

        for ( int count = 1; count <= 10; count++) {
            System.out.println("Digite o " + count + "° numero: ");
            num = in.nextInt();
            soma += num;
        }

        System.out.println("A soma total dos valores foi " + soma + ".");
    }
}