/*  Uma micro calculadora
Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem
executadas (codificada da seguinte forma: 1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação).
O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos. Observação: Considere
que só serão lidos os valores 1, 2, 3 ou 4 para as operações
*/

import java.util.Scanner;

public class Atv22 {
    public static void main (String [] args) {
        
        Scanner in = new Scanner (System.in);

        System.out.println("Digite o primeiro numero: ");
            int num1 = in.nextInt();
        System.out.println("Digite o segundo numero: ");
            int num2 = in.nextInt();

        System.out.println("Agora escolha uma operacao, 1-Adicao, 2-Subtracao, 3-Divisao, 4-Multiplicacao");
            int operacao = in.nextInt();
        
        if (operacao == 1) {
            System.out.println("A operacao escolhida foi adicao, e o resultado foi " + (num1 + num2));
        } else if (operacao == 2) {
            System.out.println("A operacao escolhida foi subtracao, e o resultado foi " + (num1 - num2));
        } else if (operacao == 3) {
            System.out.println("A operacao escolhida foi divisao, e o resultado foi " + (num1 / num2));
        } else {
            System.out.println("A operacao escolhida foi multiplicacao, e o resultado foi " + (num1 * num2));
        }
    }
}