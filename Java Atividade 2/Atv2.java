import java.util.Scanner;

// Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: 
//PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

public class Atv2 {
    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

            System.out.println("Digite a primeira nota: ");
            int num1 = in.nextInt();

            System.out.println("Digite a segunda nota: ");
            int num2 = in.nextInt();

            System.out.println("Digite a terceira nota: ");
            int num3 = in.nextInt();

            System.out.println("Digite a quarta nota: ");
            int num4 = in.nextInt();
            
        double media = (num1 + num2 + num3 + num4)/ 4;

        if (media >= 6.0 ){
            
            System.out.println("Suas notas foram " + num1 + ", " + num2 + ", " + num3 + ", " + num4 );
            System.out.println("PARABENS! Voce foi aprovado!  e sua media foi " + media + "!");

        }else {
            System.out.println("Que pena voce foi reprovado.");
        }
    }
}