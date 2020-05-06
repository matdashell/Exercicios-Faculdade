/*
Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit.
A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5, em
que a variável F representa é a temperatura em graus Fahrenheit e a variável C 
representa é a temperatura em graus Celsius.
*/
package exercicioTeams;
import java.util.Scanner;

public class Questao09 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double C = input.nextDouble();
        double F = (9*C + 160)/5;
        
        System.out.println("A temperatura em graus Fahrenheit equivale a: "+F+"F.");
    }
}
