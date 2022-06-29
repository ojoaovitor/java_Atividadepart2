// A Loja Remi du Fromage está com uma promoção onde cada capacete artesanal para tartaruga custa R$18.230 e pode ser pago em até 15 vezes sem juros. 
//Crie um programa onde o usuário possa informar o valor parcelas que deseja pagar e exiba o valor de cada parcela.

import java.util.Scanner;

public class Atv19 {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Digite a quantidade de parcelas, você pode parcelar em até 15 vezes! ");
            int parcela = in.nextInt();

        int capacete = 18230;

        double valor = capacete / parcela;

            System.out.println("O valor de parcelas que solicitou foi em " + parcela + " e o valor que irá pagar por cada parcela será de " + valor);
    }
}
