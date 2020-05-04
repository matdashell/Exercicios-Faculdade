/*Suponha que o conceito de um aluno seja determinado em função da sua nota.
Suponha, também, que esta nota seja um valor inteiro na faixa de 0 a 100,
conforme a seguinte faixa:
Nota         Conceito
0 a 49      Insuficiente
50 a 64    Regular
65 a 84    Bom
85 a 100   Ótimo

Crie um algoritmo que apresente o conceito e a nota do aluno
*/

package exercicioTeams;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        
        System.out.println("Digite a nota da sua prova");
        Scanner input = new Scanner(System.in);
        int nota = input.nextInt();
        
        
        if(nota >= 0 && nota <= 49){
            System.out.println("Nota insuficiente.");
        }
        else if(nota >= 50 && nota <= 64){
            System.out.println("Nota regular.");
        }
        else if(nota >= 65 && nota <= 84){
            System.out.println("Nota boa!");
        }
        else if(nota >= 85 && nota <= 100){
            System.out.println("Nota ótima!");
        }
        else{
            System.out.println("nota inválida.");
        }
    }
}
