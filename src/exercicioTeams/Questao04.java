/*
 Crie um algoritmo em que o aluno digita duas notas bimestrais e informa se o
aluno foi aprovado ou não. Nota: Considere aprovado se a nota for maior que
5.0
*/ 

package exercicioTeams;
import java.util.Scanner;
public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a sua primeira nota");
        
        double nota1 = input.nextDouble();
        System.out.println("Digite a sua segunda nota");
        double nota2 = input.nextDouble();
        
        double media = ((nota1+nota2)/2);
        
        if(media <= 5){
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Aprovado");
        }
    }
}
