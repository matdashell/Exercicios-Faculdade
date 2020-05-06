/*
 Crie um algoritmo para uma calculadora utilizando a instrução escolha-caso para
determinar a operação que deve ser executada, conforme o usuário escolher no menu 
de opções. Conforme a opção escolhida pelo usuário, uma operação diferente da 
calculadora deve ser executada.
 */
package exercicioTeams;


import java.util.Scanner;
public class Questao06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Para o programa funcionar corretamente faça uma operação"
                + " de cada vez \nde modo que sempre fique:(numero) (operação) (numero)\n"
                + "separados por espaço.\noperações: +, -, *, /"
                + "\n\n");
        System.out.println("Digite a operação matematica: ");
        
        String operacao = input.nextLine();
        
        String reg[] = operacao.split(" ");
        double numero1 = Double.parseDouble(reg[0]);
        double numero2 = Double.parseDouble(reg[2]);
        
        if("*".equals(reg[1])){
            System.out.println("Resultado: "+((numero1)*(numero2)));
        }
        if("+".equals(reg[1])){
            System.out.println("Resultado: "+((numero1)+(numero2)));
        }
        if("-".equals(reg[1])){
            System.out.println("Resultado: "+((numero1)-(numero2)));
        }
        if("/".equals(reg[1])){
            System.out.println("Resultado: "+((numero1)/(numero2)));
        }
    }
    
}
