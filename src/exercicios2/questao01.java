/*
Crie uma classe java que contenha um método principal que receba dois números
inteiros e imprima os dois valores.
*/

package exercicios2;

import java.util.Scanner;

public class questao01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();
        
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();   
        
        System.out.println("Os dois número informados foram "+num1+" e "+num2);
    }
}