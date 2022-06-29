import java.util.Scanner;

//Escreva um programa em que o usuário informe dois números utilizando o "prompt". Então escreva em tela o maior deles.

public class Atv3 {
    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Digite o primeiro numero: ");
            int n1 = in.nextInt();

        System.out.println("Digite o segundo numero: ");
            int n2 = in.nextInt();
        
        if (n1 > n2) {
            System.out.println("O maior numero digitado foi " + n1);
        } else {
            System.out.println("O maior numero digitado foi " + n2);
        }
    }
}