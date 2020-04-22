/*
Escrever um programa que apresente em tela um nome, uma cidade, um cpf e um
email.

*/

package exercicios1;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = input.next();
        
        System.out.println("digite o nome de sua cidade: ");
        String cidade = input.next();
        
        System.out.println("digite seu CPF: ");
        String CPF = input.next();
        
        System.out.println("digite seu E-mail: ");
        String email = input.next();
        
        System.out.println("\nseu dados são: \nNome: "+nome+"\ncidade: "+cidade+""
                + "\nCPF: "+CPF+"\nE-mail: "+email);
        
    }
}
