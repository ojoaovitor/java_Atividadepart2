/*A equipe Mercedes deseja calcular o número mínimo de litros que deverá colocar no tanque de seu carro para que 
ele possa percorrer um determinado número de voltas até o primeiro reabastecimento.

Escreva um programa que leia o comprimento da pista (em metros), o número total de voltas a serem percorridas no grande prêmio, 
o número de reabastecimentos desejados e o consumo de combustível do carro (em Km/L). 

O programa deve calcular e exibir o número mínimo de litros necessários para percorrer até o primeiro reabastecimento. 
Observação: considere que a quantidade de voltas entre os reabastecimentos é o mesmo, mas não poderá ser maior ou igual a 2. 

O usuário deve informar a quantidade de quilômetros total do circuito e a quantidade de litros que o carro pode possuir. 
*/

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Informe o tamanho da pista em metros: ");
            int tamanhoPista = in.nextInt();

        System.out.println("Informe o numero de voltas: ");
            int voltas = in.nextInt();
        
        System.out.println("Quantos reabastecimentos deseja fazer? ");
            int numReabastecimento = in.nextInt();
        
        System.out.println("Qual o consumo do carro? KM: ");
            int consumoCarro = in.nextInt();

        int voltasParada1 = voltas/numReabastecimento;

        int distanciaParada1 = (voltasParada1 / tamanhoPista) * 1000;

        int consumoParada1 = consumoCarro * distanciaParada1;

        System.out.println("distancia percorrida ate a primeira parada e: " + distanciaParada1);
        
        System.out.println("O numero de voltas ate a primeira parada e: " + voltasParada1);
        
        System.out.println("O carro vai gastar " + consumoParada1 + " litros ate a parada 1");
    }
}