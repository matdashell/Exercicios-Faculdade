/*
Escreva um programa em JAVA que realiza a soma de duas variáveis e apresente
em tela o resultado dessa soma.
*/

package exercicios1;

import java.util.Scanner;

public class questao02{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        
        int soma = num1 + num2;
        
        System.out.println("A soma dos dois números é igual a: "+soma);
    }
}
