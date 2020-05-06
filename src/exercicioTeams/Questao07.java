/*
 Faça um algoritmo que leia um número e imprima a sua tabela de multiplicação de 1 até 13
 */
package exercicioTeams;

import java.util.Scanner;
public class Questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero que deseja multiplicar...");
        double numero = input.nextDouble();
        
        for(int i = 1; i <= 13; i++){
            System.out.println(numero+" * "+i+" = "+i*numero);
        }
    }
}
