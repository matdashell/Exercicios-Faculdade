/*
Desenvolva um programa java que define uma variável que representará o salário
R$980,00 de um funcionário de uma empresa. Esse funcionário ao receber seu
salário, na primeira semana realiza o pagamento de seu cartão de crédito no valor
de R$38,00, na segunda semana ele realiza o pagamento de seu aluguel no valor de
R$450,00 e por fim ele realiza o pagamento da parcela de seu veículo R$400,00. Ao
final do mês esse funcionário possuirá quanto de seu salário disponível? Imprima ao
final desse programa os gastos referente a cada item que esse funcionário gastou.
*/

package exercicios2;
public class questao05{
    public static void main(String[] args){
        int saldo = 980;
        //gastos
        
        saldo-= 38;
        saldo-= 450;
        saldo-= 400;
        
        System.out.println("Gastos: \ncartão de crédito: -R$38,00 \naluguel:"
                + " -R$450,00 \nparcela do veículo: -R$400,00 \nSaldo atual: "
                + "R$"+saldo+",00.");
        
    }
}