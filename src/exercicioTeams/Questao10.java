/*
Os estudos de Programação Orientada a Objeto (POO) nos permitem realizar a criação de objetos em JAVA e 
fazer que com eles realizem ações através de métodos bem definidos e atributos bem delimitados para 
nossa necessidade. Pensamos então em um objeto do tipo carro, nosso objeto tem atributos específicos 
de um carro e métodos particulares de um carro qualquer, conforme tabela :

Os métodos dessa aplicação em POO deverão seguir as ações descritas a seguir: 
•	O método status deverá exibir os atributos do carro (cor, modelo, ano e se está ligado etc...) 
•	O método ligar deverá notificar ao usuário que o carro se está ligado 
•	O método desligar deverá verificar se o carro está com velocidade, pois o mesmo só poderá frear
se estiver com baixa velocidade (até 20 km/h) 
•	O método nível de gasolina está diretamente ligado ao ligar o carro, ou seja, o carro só poderá
ser ligado caso o nível de gasolina esteja em pelo menos 5% e nesse caso deverá exibir a mensagem de 
“Procurar o posto mais próximo”. Utilize a lógica de acordo com os atributos e as funcionalidades de
um carro em situações normais de uso.
 */
package exercicioTeams;



public class Questao10 {
    public static void main(String[] args){
        Carro bluezao = new Carro();
        bluezao.cor = "preto";
        bluezao.modelo = "especialCars";
    }
    public static void ligar(){
        
    }
}

