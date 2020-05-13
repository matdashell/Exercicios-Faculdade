package prova;
import java.util.Scanner;
public class Questao_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("BEM VINDO À MÁQUINA DE SORTEIOS! \nQuantos anos você tem?");
        int idade = input.nextInt();
        if(idade < 5){
            System.out.println("você ganhou um toddynho!");
        }
        else if(idade >= 5 && idade < 12){
            System.out.println("você ganhou um videogame!");
        }
        else if(idade >= 12 && idade < 18){
            System.out.println("você ganhou um skate!");
        }
        else if(idade >= 18 && idade < 65){
            System.out.println("você ganhou uma cerveja!");
        }
        else{
            System.out.println("Você ganhou uma dentadura!");
        }
    }
}
