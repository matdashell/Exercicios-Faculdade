/*
Um banco concederá um crédito especial aos seus clientes, variável com o saldo
médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente e
calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem
informando o saldo médio e o valor do crédito.

Saldo médio                       Percentual
de 0 a 200                         nenhum crédito
de 201 a 400              20% do valor do saldo médio
de 401 a 600              30% do valor do saldo médio
acima de 601             40% do valor do saldo médio
*/

package exercicioTeams;
import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor médio do seu saldo: ");
        
        double media = input.nextDouble();
        
        if(media >= 0 && media <= 200){
            System.out.println("Você não tem direito ao crédito!");
            System.out.println("Saldo atual: "+media);
        }
        
        else if(media > 200 && media <= 400){
            System.out.println("Você tem direito a 20% de credito!");
            System.out.println("Saldo atual: "+(media*1.2)/1+"\n"
                    + "Teve um acrescimo de: "+media*0.2);
        }
        
        else if(media > 400 && media <= 600){
            System.out.println("Você tem direito a 30% de credito!");
            System.out.println("Saldo atual: "+(media*1.3)/1+"\n"
                    + "Teve um acrescimo de: "+media*0.3);
        }
        
        else if(media > 600){
            System.out.println("Você tem direito a 40% de credito!");
            System.out.println("Saldo atual: "+(media*1.4)/1+"\n"
                    + "Teve um acrescimo de: "+media*0.4);
        }
        
        else{
           System.out.println("Saldo inválido!"); 
        }
        
    }
}
