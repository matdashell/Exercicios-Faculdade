/*
Escrever um programa que apresente sua idade em 2019 e sua apresente também
sua idade em 2021

*/

package exercicios1;

import java.util.Scanner;

public class questao05{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano de seu nascimento: ");
        
        int ano = input.nextInt();
        int idade1 = 2019 % ano;
        int idade2 = 2021 % ano;
        
        System.out.println("Sua idade em 2019 foi de: "+idade1+" anos e sua idade em"
                + " 2021 será de: "+idade2+" anos");
    }
}