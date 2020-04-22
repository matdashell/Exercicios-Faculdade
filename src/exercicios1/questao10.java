/*
Desenvolva um algoritmo que calcule a média de dois valores
*/

package exercicios1;

import java.util.*;

public class questao10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        double num1 = input.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double num2 = input.nextDouble();
        
        System.out.println("A média dos dois valores informados é igual a "
        +(num1+num2)/2);
    }
}