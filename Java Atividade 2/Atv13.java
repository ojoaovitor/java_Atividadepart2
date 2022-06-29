// As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. 
//Escreva um programa que leia o número de maçãs compradas (considere que o usuário informará a quantidade), e calcule e escreva o valor total da compra.

import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Quantas maçãs comprou?");
            int maca = in.nextInt();

        double valor_maca = 0.30;
        double valor_duzia = 0.25;

        if (maca > 12) {
            System.out.println("O valor total da compra foi RS " + (maca * valor_duzia));
        } else {
            System.out.println("O valor total da compra foi R$ " + (maca * valor_maca));
        }


    }
}