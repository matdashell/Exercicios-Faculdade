/*
Elabore um algoritmo que leia um salário de R$580,00 e realize a multiplicação por 2
desse valor. Ao final o programa deverá exibir o nome desse funcionário e o saldo
do salário do funcionário.
*/

package exercicios1;

import java.util.Scanner;

public class questao09{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Obs: o benefício é válido apenas para pessoas com "
                + "renda fixa inferior ou igual a R$580,00.");
        
        System.out.println("Digite o seu primeiro nome: ");
        String nome = input.next();
        
        System.out.println("Digite o seu salário mensal:");
        Double salario = input.nextDouble();
        
        if(salario <= 580 && salario > 0){
            salario *= 2;
            System.out.println("olá "+nome+" seu saldo atual é de R$:"+salario+",00.");}
        
        else if(salario <= 0){
            System.out.println("voçê não possui salário...");}
        
        else{
            System.out.println("Seu salário é superior a R$:580,00 e não poderá"
                    + "receber o benefício.");} 
    }
}
