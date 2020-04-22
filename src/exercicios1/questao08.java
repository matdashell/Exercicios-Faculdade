/*
Desenvolva um algoritmo que leia um número inteiro, uma string e um número
double ou float.
*/

package exercicios1;

import java.util.Scanner;

public class questao08{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        
        int  inteiro = input.nextInt();
        
        System.out.println("Digite uma palavra: ");
        String string = input.next();
        
        System.out.println("Digite uma número decimal: ");
        double decimal = input.nextDouble();
        
        System.out.println(" número inteiro: "+inteiro+"\n string: "+string+"\n"
                + "número decimal "+decimal);
    }
}