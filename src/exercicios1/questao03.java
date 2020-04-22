/*
Escreva um programa que realize a multiplicação de duas variáveis e em seguida
realize soma do resultado da multiplicação por 30.

*/

package exercicios1;

import java.util.Scanner;

public class questao03{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a primeira variável: ");
        int variavel1 = input.nextInt();
        
        System.out.println("Digite a segunda variável: ");
        int variavel2 = input.nextInt();
        
        int resultado = variavel1*variavel2+30;
        
        System.out.println("O valor pe igual a: "+resultado);
    }
}