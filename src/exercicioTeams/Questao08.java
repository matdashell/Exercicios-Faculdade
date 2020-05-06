/*
Faça um algoritmo que calcule e imprime a soma dos inteiros de 1 a 10. Utilize as
estruturas ENQUANTO-FACA / REPITA-FACA para fazer um laço com as instruções de 
cálculo e incremento. O laço deve terminar quando o valor de x se tornar 11.
 */
package exercicioTeams;


public class Questao08 {
    public static void main(String[] args) {
        boolean acess = true;
        int y = 0;
        
        for(int x = 0; x <= 11; x++){
            y += x;
            System.out.println(y);
        }
        
    }
}
