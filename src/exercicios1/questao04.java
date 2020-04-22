/*
Escreva um programa em JAVA que realiza a divisão de duas variáveis e apresente
em tela o resultado. Em seguida realize a multiplicação do valor por 3.
*/

package exercicios1;

import java.util.Scanner;
public class questao04{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        double valor1 = input.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double valor2 = input.nextDouble();
        
        double total = valor1/valor2;
        
        System.out.println("A divisão dos dois números é igual a "+total+" e o "
                + "resultado multiplicado por 3 é igual a: "+total*3);
    }
}