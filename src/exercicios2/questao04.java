/*
Utilizando a estrutura de condição if-else, desenvolva uma classe java que receba
dois valores referentes a notas de um aluno. E calcule a média desse aluno, sendo
que: caso a média do aluno seja menor que seis o aluno está reprovado e caso a
média do aluno seja maior que seis este aluno estará aprovado por média. Ao final
do programa imprima a média final desse aluno e as suas duas notas.

*/

package exercicios2;

import java.util.Scanner;

public class questao04{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a sua primeira nota: ");
        double nota1 = input.nextDouble();
        
        System.out.println("Digite a sua segunda nota: ");
        double nota2 = input.nextDouble();
        
        double media = (nota1+nota2)/2;
        
        
        if(media >= 6){
            System.out.println("Você foi aprovado! \nprimeira nota: "+nota1+"\n"
                    + "segunda nota: "+nota2+"\nmédia das notas: "+media);}
        else{
            System.out.println("Você foi reprovado! \nprimeira nota: "+nota1+"\n"
                    + "segunda nota: "+nota2+"\nmédia das notas: "+media);}
    }
}