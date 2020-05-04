/*
O cardápio de uma lanchonete é o seguinte:

Especificação                        Preço unitário
100 Cachorro quente ----->        1,10
101 Bauru simples ----->             1,30
102 Bauru c/ovo ----->               1,50
103 Hamburger ----->                1,10
104 Cheeseburger ----->            1,30
105 Refrigerante----->                1,00

Escrever um algoritmo que leia o código do item pedido, a quantidade e calcule
o valor a ser pago por aquele lanche. Considere que a cada execução somente
será calculado um item.
*/

package exercicioTeams;
import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean acess = true;
        
        String nome [] = {"Cachorro quente(s)", "Bauru simples", "Bauru c/ovo(s)", 
        "Hamburger(s)", "Cheeseburger(s)", "Refrigerante(s)"};
        
        double preco [] = {1.10, 1.30, 1.50, 1.10, 1.30, 1.0};
        
        System.out.println("Os salgados disponíveis são: \n"
                + "100 - Cachorro quente   ----->     1,10\n" +
                  "101 - Bauru simples     ----->     1,30\n" +
                  "102 - Bauru c/ovo       ----->     1,50\n" +
                  "103 - Hamburger         ----->     1,10\n" +
                  "104 - Cheeseburger      ----->     1,30\n" +
                  "105 - Refrigerante      ----->     1,00\n"
                + "\nDigite o número do seu pedido: \n");
        
        while(acess == true){
            
        int numeroPedido = input.nextInt();  
        
        if(numeroPedido >= 100 && numeroPedido <= 105){
        
        System.out.println("Digite o numero de "+nome[(numeroPedido - 100)]+" que"
                + "deseja comprar");
        int numeroDePedidos = input.nextInt();
        
        System.out.println("o preço total de "+numeroDePedidos+" "+nome[(numeroPedido - 100)]
        +" é igual a R$:"+((preco[(numeroPedido - 100)]*numeroDePedidos)/1)); 
        
        break;
        }
        
        else{
            System.out.println("opção inválida. Número de pedidos disponíveis apenas"
                    + " entre 100 - 105!");
            
            }
        }
    }
}
