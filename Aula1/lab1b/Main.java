package lab1b;
//tem que botar isso pra linkar os códigos dessa pasta

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

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
                System.out.print("A frase é um palindromo");
            }
            else{
                System.out.print("A frase não é um palindromo.");
            }
        }
        catch(IllegalArgumentException erro){
            System.out.println("Erro: "+erro.getMessage());
        }

        //fechando o scanner
        entrada.close();
    }
}