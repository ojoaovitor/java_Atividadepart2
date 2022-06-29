// Escreva um programa que leia as notas das duas avaliações normais e a nota da avaliação optativa. 
//Calcular a média do semestre considerando que a prova optativa substitui a nota mais baixa entre as duas primeiras avaliações. 
//Escrever a média e mensagens que indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo com as informações abaixo:

import java.util.Scanner;

public class Atv18 {
    public static void main(String[] args){

        double media = 0;
        double media1 = 0;
        
        Scanner in = new Scanner (System.in);

        System.out.println("Qual foi sua nota na primeira avaliação?");
            double prova1 = in.nextFloat();

        System.out.println("Qual foi sua nota na segunda avaliação?");
            double prova2 = in.nextFloat();

        System.out.println("Qual foi sua nota na avaliação optativa?");
            double opta = in.nextFloat();

        if (prova1 < prova2) {

             media = (prova2 + opta)/2;

            if (media >= 6.0){

            System.out.println("Voce foi APROVADO! E sua nota foi " + media);

            } 
            
            else if (media < 3.0) {
                System.out.println("Voce foi REPROVADO! E sua nota foi " + media);
            } 
            
            else if (media >= 3.0 && media <= 6.0){
                media = (prova1 + opta)/2;
                System.out.println("Voce esta em EXAME! E sua nota foi " + media);
            }
        }

        if (prova1 > prova2){

             media1 = (prova1 + opta)/2;

            if (media1 >= 6.0){

            System.out.println("Voce foi APROVADO! E sua nota foi " + media1);

            } 

            else if (media1 < 3.0) {
                System.out.println("Voce foi REPROVADO! E sua nota foi " + media1);
            } 
            
            else if (media1 >= 3.0 && media1 < 6.0){
                media1 = (prova1 + opta)/2;
                System.out.println("Voce esta em EXAME! E sua nota foi " + media1);
            }
        }
    }
}