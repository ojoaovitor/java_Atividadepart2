/* Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
Sabendo-se que o preço do combustível é de R$ 2,90, escreva um programa para ler: a marcação do odômetro (Km) no início do dia, 
a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. 
Sabendo que o carro desse taxista roda 14 kilômetros por litro de gasolina, crie um programa que calcule e escreva: a média do consumo em Km/L e o lucro (líquido) do dia.
*/

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Digite a numeraçao do odometro no começo do dia em KM: ");
            double odometro = in.nextFloat();
        
        System.out.println("Digite a númeração do odômetro no final do dia em KM: ");
            double fdia = in.nextFloat();

        System.out.println("Quantos litros de combustivel foi gasto?");
            double combustivel = in.nextFloat();

        System.out.println("Valor total recebido pelos passageiros?");
            double valor = in.nextFloat();

        double gasto = combustivel * 2.90;

        
            System.out.println("Valor liquido recebido foi " + (gasto - valor) + ".");
        
            System.out.println("A media do consumo foi  " + (fdia / combustivel) + ".");
    }
}