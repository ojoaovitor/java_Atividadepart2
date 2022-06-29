//Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem:
// PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args){

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

        if (media > 6.0 ){
            System.out.println("Voce foi APROVADO! E sua nota final foi " + media + ".");
        } else {
            System.out.println("Infelizmente voce foi reprovado e sua media foi " + media + ".");
        }

    }
}