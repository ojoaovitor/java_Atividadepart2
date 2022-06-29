import java.util.Scanner;

//Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e 
//escreva a média aritmética desses valores lidos.

public class Atv1 {
    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

        int cont = 1;
        int soma = 0;

        while (cont <= 10) {
            System.out.println("Digite o " + cont + " numero: ");
            int num = in.nextInt();
            cont ++;
            soma += num;
        }

        double media = soma / cont;
        System.out.println("A media dos valores somados foram " + media);
    }
}