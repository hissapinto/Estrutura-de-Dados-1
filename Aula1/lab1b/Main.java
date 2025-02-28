package lab1b;
//tem que botar isso pra linkar os códigos dessa pasta

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        boolean fraseValida = false;
        //Inicia uma variável pra o programa voltar a pedir uma frase caso um erro aconteça
        do{
        //Executa essa parte do código enquanto fraseValida for falsa
            //Recebendo a frase
            Scanner entrada = new Scanner(System.in);
            System.out.print("Escreva uma frase: ");
            String frase = entrada.nextLine();

             //Try e catch pro programa não encerrar caso haja algum erro
            try{
                //Criando o novo obj da classe palindromo
                Palindromo novoPalindromo = new Palindromo(frase);

                //chamando a função pra verificar se é palindromo
                boolean palindromoCorreto = novoPalindromo.verificar();
                if(palindromoCorreto){
                    System.out.println("A frase é um palindromo");
                }
                else{
                    System.out.println("A frase não é um palindromo.");
                }
                fraseValida = true;
                        entrada.close();
                //Se chegou até aqui não houve erro, então fraseValida pode virar true, pra sair do laço
            }
            catch(IllegalArgumentException erro){
                System.out.println("Erro: "+erro.getMessage());
                //O get.Message é um metodo que ja existe na classe Exception, então posso usa-lo para pegar
                //a frase de erro que eu escrevi no throw exeption.
            }
        }
        while(!fraseValida);
        //Executa enquanto fraseValida for false

        //fechando o scanner
    }
}