// Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. 
//A senha válida é o número "1234" sem aspas. Devem ser impressas as seguintes mensagens: "ACESSO PERMITIDO" caso a senha seja válida. 
//"ACESSO NEGADO" caso a senha seja inválida.

import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Digite sua senha");
            int password = in.nextInt();
        
            int senha = 1234;

        if (password != senha) {
            System.out.println("ACESSO NEGADO!");
        } else {
            System.out.println("ACESSO PERMITIDO!");
        }
    }
}