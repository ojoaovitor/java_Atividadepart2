// Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, ]
//construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:

import java.util.Scanner;

public class Atv15 {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);

        System.out.println("Qual seu genero sexual? (f/m)");
            String genero = in.next();

        System.out.println("Qual sua altura?");
            double h = in.nextFloat();

        double m = (72.7 * h) - 58;
        double f = (62.1 * h) - 44.7;

        if (genero == "f") {
            System.out.println("Seu peso ideal é " + f);
        } else {
            System.out.println("Seu peso ideal e " + m);
        }
    }
}