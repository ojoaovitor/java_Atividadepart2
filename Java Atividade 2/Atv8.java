//Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10. 
//No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente".

import java.util.Scanner;

public class Atv8 {

    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Digite a primeira nota entre 0 e 10 : ");
            int n1 = in.nextInt();

        System.out.println("Digite a segunda nota entre 0 e 10 : ");
            int n2 = in.nextInt();

        System.out.println("Digite a terceira nota entre 0 e 10 :  ");
            int n3 = in.nextInt();

        System.out.println("Digite a quarta nota entre 0 e 10 :  ");
            int n4 = in.nextInt();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media > 5 ){
            System.out.println("Voce foi APROVADO! E sua nota final foi " + media + ".");
        } else {
            System.out.println("Infelizmente voce foi reprovado e sua media foi " + media + ".");
        }
    }
}