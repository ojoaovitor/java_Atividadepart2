//Faça um programa que leia dois valores informados pelo usuário e exiba uma das três mensagens a seguir: 
//‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; 
//‘Segundo maior’, caso o segundo seja maior que o primeiro.

import java.util.Scanner;

public class Atv4 {
    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Digite o primeiro numero: ");
            int n1 = in.nextInt();

        System.out.println("Digite o segundo numero: ");
            int n2 = in.nextInt();

        if (n1 == n2) {
            System.out.println("Numero iguais!");
        } else if (n1 > n2) {
            System.out.println("O primeiro e maior!");
        } else {
            System.out.println("O segundo e maior!");
        }
        in.close();
    }
}