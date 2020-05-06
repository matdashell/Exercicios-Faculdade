/*
 Crie um algoritmo chamado Zodiaco. Este algoritmo deve ler a data do seu
aniversário e atribuir um valor para a variável inteira chamada signo, conforme
lista abaixo:

a) 1º signo do zodíaco: Aquário (21/jan a 19/fev)
b) 2º signo do zodíaco: Peixes (20/fev a 20/mar)
c) 3º signo do zodíaco: Áries (21/mar a 20/abr)
d) 4º signo do zodíaco: Touro (21/abr a 20/mai)
e) 5º signo do zodíaco: Gêmeos (21/mai a 20/jun)
f) 6º signo do zodíaco: Câncer (21/jun a 21/jul)
g) 7º signo do zodíaco: Leão (22/jul a 22/ago)
h) 8º signo do zodíaco: Virgem (23/ago a 22/set)
i) 9º signo do zodíaco: Libra (23/set a 22/out)
j) 10º signo do zodíaco: Escorpião (23/out a 21/nov)
k) 11º signo do zodíaco: Sagitário (22/nov a 21/dez)
l) 12º signo do zodíaco: Capricórnio (22/dez a 20/jan)

O algoritmo deve imprimir uma mensagem, como o exemplo: "Você é do seguinte
signo do zodíaco: Libra
*/

package exercicioTeams;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args){
        String signo;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dia do seu aniversário: ");
        int dia = input.nextInt();
        System.out.println("Digite o mês do seu aniversario: ");
        int mes = input.nextInt();
        int reg = (28*mes)+dia;
        
        
        if(reg >= 49 && reg <= 75){signo = "Aquário";}
        else if(reg >= 76 && reg <= 104){signo = "Peixes";}
        else if(reg >= 105 && reg <= 132){signo = "Áries";}
        else if(reg >= 133 && reg <= 160){signo = "Touro";}
        else if(reg >= 161 && reg <= 188){signo = "Gêmeos";}
        else if(reg >= 189 && reg <= 217){signo = "Câncer";}
        else if(reg >= 218 && reg <= 246){signo = "Leão";}
        else if(reg >= 247 && reg <= 274){signo = "Virgem";}
        else if(reg >= 275 && reg <= 302){signo = "Libra";}
        else if(reg >= 303 && reg <= 329){signo = "Escorpião";}
        else if(reg >= 330 && reg <= 357){signo = "Sagitário";}
        else{signo = "Capricórnio";}
        
        System.out.println("Você é do seguinte signo do zodíaco: "+signo);
        
    }
}
