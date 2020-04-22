
package ExercicioAula;

import java.util.*;

public class Exercicio1 {
    
    public static void limpar(){ //classe pra limapar a tela:
        for(int i = 0;i < 50;i++){
            System.out.println(" ");}
    }
    
    
    
    
     
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // cadastro:
        
        System.out.println("Olá bem vindo a minha plataforma de teste!\n"
                + "nela você ira encontrar varios derivados dentre outros\n"
                + "primeiro é necessario fazer um pequeno cadastro!\n"
                + "digite seu user e senha...");
        System.out.println("\n\n\n");
        
        System.out.println("digite seu user: ");
        String user = input.next();
        
        System.out.println("digite sua senha: ");
        String senha = input.next();
        
        limpar();
        
        System.out.println("Faça loguin:\n\n\n" 
                + "digite o seu user: ");
        boolean acesso = true;
        
        
        
        
        
        while(acesso == true){ // autenticação do cadastro:
            String userAut = input.next();
            
            if(userAut.equals(user)){
                System.out.println("Digite a sua senha: ");
                String senhaAut = input.next();
                
                if(senhaAut.equals(senha)){
                    break;
                    
                }else{limpar();
                    System.out.println("Senha incorreta...tente novamente \nDigite"
                            + " seu user: ");
                }
            }else{limpar();
                System.out.println("Usuário enxistente...tente novamente \nDigite "
                        + "seu user: ");
            }
        }limpar();// opções de usuário:
        
        
        
        
        
        // pagina padrão..
        
        while(acesso == false){
        acesso = true;}
        
        
        
        while(acesso == true){System.out.println("bem vindo(a) "+user+" "
                + "selecione uma das opções válidas: \n1-Jogo basico\n2-mini gif\n"
                + "3- Sair \n\n\n(escreva apenas números)\n: ");
        int escolha = input.nextInt();
        
            if(escolha == 1){limpar();
            System.out.println("O jogo consiste em acetar um número aleatório em "
                    + "no máximo 20 tentativas... deseja jogar? \n1- sim\n2- não"
                    + "\n: ");
            int escolha1 = input.nextInt();
            limpar();
            
            
            
            
            
            
            
            
            if(escolha1 == 1){ // jogo de acertar número aleatório:

                System.out.println("Bem vindo ao jogo... o objetivo é acertar um "
                        + "número aleatorio....BEM DIFÍCIL...boa sorte! \n"
                        + "o número aleatorio foi gerado...");
                
                Random aleatorio = new Random();
                int numero_aleatorio = aleatorio.nextInt();
                for(int tentativas = 0;tentativas <= 20; tentativas++){
                    
                    System.out.println("Digite o seu chute: ");
                    long chute = input.nextLong();
                    
                    if(chute == numero_aleatorio){ limpar();
                        System.out.println("Parabens, você fez o impossivel! kk"
                                + "\nDeseja jogar novamente?\n1- sim\n2- não");
                         escolha1 = input.nextInt();
                        
                        if(escolha1 == 1){
                            
                            limpar();
                            
                        }else{
                            acesso = false;
                            break;}
                        
                    }if(chute != numero_aleatorio){
                        
                        System.out.println("você errou...");
                        
                        if(chute > numero_aleatorio){ limpar();
                            System.out.println("Tente um número mais baixo");
                        }else{ limpar();
                            System.out.println("Tente um número mais alto");
                        }
                        if(tentativas >= 10){
                            System.out.println("O número é menor que "+ (numero_aleatorio
                            +5));
                        }
                        if(tentativas >= 15){
                            System.out.println("O número é maior que "+ (numero_aleatorio
                                    -5));
                        }
                        if(tentativas == 20){ limpar();
                            System.out.println("O seu número de tentativas acabou...que pena"
                                    + " Deseja jogar novamente?\n1- sim\n2- não");
                            
                            escolha1 = input.nextInt();
                            if(escolha1 == 1){ limpar();
                                tentativas = 0;
                                int numero_aletorio = aleatorio.nextInt();
                                
                                
                            }else{limpar();
                                break;}
                        }
                    }System.out.println("você tem "+(20 - tentativas)+" tentativas");
                    
                }}else{limpar();}}
            
            
            
            
            
            // gif
            if(escolha == 2){ limpar();
                for(int cont = 0;cont < 10000;cont++){
                    
                    if(cont<1000){ 
                        System.out.println("\n\n\n\n\n\n\n\n\n\n"
                                + "….._|\\____________________,,__\n" +
                                "…./ `–|||||||||||———————-_]\n" +
                                "…/_==o ____________________|\n" +
                                "…..),—.(_(__) /\n" +
                                "….// (\\) ),——\n" +
                                "…//___//\n" +
                                "../`—-‘ / …\n" +
                                "./____ / … .");
                    }if(cont>1000 && cont<2000){ 
                        System.out.println("\n\n\n\n\n\n\n\n\n\n"
                                + "….._|\\____________________,,__\n" +
                                "…./ `–|||||||||||———————-_] ░ ▒▓▓█D\n" +
                                "…/_==o ____________________|\n" +
                                "…..),—.(_(__) /\n" +
                                "….// (\\) ),——\n" +
                                "…//___//\n" +
                                "../`—-‘ / …\n" +
                                "./____ / … .");            
                    }if(cont>2000 && cont<5000){ 
                        System.out.println("\n\n\n\n\n\n\n\n\n\n"
                                + "….._|\\____________________,,__\n" +
                                "…./ `–|||||||||||———————-_] ░------- ▒▓▓█D\n" +
                                "…/_==o ____________________|\n" +
                                "…..),—.(_(__) /\n" +
                                "….// (\\) ),——\n" +
                                "…//___//\n" +
                                "../`—-‘ / …\n" +
                                "./____ / … .");
                    }if(cont>5000 && cont<7000){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n"
                                + "….._|\\____________________,,__\n" +
                                "…./ `–|||||||||||———————-_] ░           ---- ▒▓▓█D\n" +
                                "…/_==o ____________________|\n" +
                                "…..),—.(_(__) /\n" +
                                "….// (\\) ),——\n" +
                                "…//___//\n" +
                                "../`—-‘ / …\n" +
                                "./____ / … .");
                    }if(cont>7000 && cont<8000){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n"
                                + "….._|\\____________________,,__\n" +
                                "…./ `–|||||||||||———————-_] ░***                  ---- ▒▓▓█D\n" +
                                "…/_==o ____________________|\n" +
                                "…..),—.(_(__) /\n" +
                                "….// (\\) ),——\n" +
                                "…//___//\n" +
                                "../`—-‘ / …\n" +
                                "./____ / … .");
                    }if(cont>8000 && cont<9000){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n"
                                + "….._|\\____________________,,__\n" +
                                "…./ `–|||||||||||———————-_] ░****                             ---- ▒▓▓█D\n" +
                                "…/_==o ____________________|\n" +
                                "…..),—.(_(__) /\n" +
                                "….// (\\) ),——\n" +
                                "…//___//\n" +
                                "../`—-‘ / …\n" +
                                "./____ / … .");
                    }
                }
                limpar();
                System.out.println("Pser....ta meio bugado...");
            }if(escolha == 3){
                break;
            }
        }
    }   
}
