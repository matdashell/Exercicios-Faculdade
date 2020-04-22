/*
Faça um programa que calcule a idade atual de uma pessoa e que calcule sua idade
daqui a 5 anos.
*/

package exercicios1;

import java.util.*;

public class questao07{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Em que ano estamos?: ");
        int ano = input.nextInt();
        
        System.out.println("Digite seu ano de nascimento: ");
        int data = input.nextInt();
        
        int reg = ano - data;
        System.out.println("Sua idade atual é de "+reg+" anos e daqui 5 anos "
                + "você tera "+(reg + 5)+" anos");
    }
}