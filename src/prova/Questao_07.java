package prova;
import java.util.Scanner;
public class Questao_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        
        System.out.println("Digite a nota na sua primeira avalição: ");
        nota1 = input.nextDouble();
        
        System.out.println("Digite a nota na sua segunda avalição: ");
        nota2 = input.nextDouble();
        
        System.out.println("Digite a nota na sua terceira avalição: ");
        nota3 = input.nextDouble();
        
        media = (nota1+nota2+nota3)/3;
        if(media >= 6){
            System.out.println("Sua média é de "+(media)/1.0+" e voce foi aprovado!");
        }
        else{
            System.out.println("Sua média é de "+(media)/1.0+" e voce foi reprovado!");
        }
    }
}
