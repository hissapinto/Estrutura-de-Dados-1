//Escreva um código Java que leia uma letra e indique se é uma vogal ou consoante.

import java.util.Scanner;

public class Ex2 {
    public static void main(String arg[]){
        char [] vogais = {'a', 'e', 'i', 'o', 'u'};
        // Declarando o vetor de vogais
        Scanner entrada = new Scanner(System.in);
        //Declara um scanner chamado entrada
        System.out.print("Informe uma letra: ");
        String palavra = entrada.next();
        //Lê uma palavra ou caractere que foi botado pelo usuário
        char letra = palavra.charAt(0);
        //Pega o caractere na posição zero
        char letraMinuscula = Character.toLowerCase(letra);
        //Deixa o caractere minúsculo

        boolean ehVogal = false;
        //Cria uma flag pra caso encontre uma vogal
        for (int i = 0; i < vogais.length; i++){
            if (letraMinuscula == vogais[i]) {
                System.out.print("A letra digitada é uma Vogal.");
                ehVogal = true;
                //Flag encontrada, da break
                break;
            }
        }
        if (ehVogal == false){
            System.out.print("A letra digitada é uma Consoante.");
            //Se a flag continua false é consoante
        }
    }
}
