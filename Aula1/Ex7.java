
/*Escreva um método estático contarVogais() que recebe uma string como
parâmetro e retorna a quantidade de vogais encontradas na string.
Inclua um código na main() que exemplifica o uso do método contarVogais(). */

import java.util.Scanner;

public class Ex7{
    public static int contarVogais(String frase){
        char [] vogais = {'a', 'e', 'i', 'o', 'u'};
        int qtdVogais = 0;
        for (int i = 0; i<frase.length(); i++){
            char letraMinuscula = Character.toLowerCase(frase.charAt(i));
            for ( int j = 0; j<vogais.length; j++){
                if (letraMinuscula == vogais[j]){
                    qtdVogais++;
                    break;
                }
            }
        }
        return qtdVogais;
    }
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escreva uma frase: ");
        String frase = entrada.nextLine();
        //Tem que escrever o Line, se não ele so pega a primeira palavra
        entrada.close();

        System.out.print("A quantidade de vogais na sua frase é de: "+contarVogais(frase));
    }
}