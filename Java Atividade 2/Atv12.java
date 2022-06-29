// Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela 
//poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Digite o ano que voce nasceu: ");
        
            int ano = in.nextInt();

            int idade = 2022 - ano;

        if (ano > 2006) {
            System.out.println("Desculpe, sua idade e " + idade + " e voce nao pode votar :(");
        } else {
            System.out.println("Parabens, sua idade e " + idade + " e voce pode votar :)");
        }
    }
}