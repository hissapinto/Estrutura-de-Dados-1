/*Escreva um código Java que leia 10 números inteiros e,em seguida,
exiba-os na ordem inversa que foram inseridas pelo usuário.*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String arg[]){
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Informe o número "+(i+1)+": ");
            numeros[i] = entrada.nextInt();
            //lê e armazena o numero no vetor
        }
        entrada.close();
        for (int i = numeros.length - 1; i >= 0; i--){
            System.out.print(numeros[i]);
            if (i != 0) {
                System.out.print(", ");
                //Pra não ter uma virgula depois o ultimo numero
                //Se o numero for diferente do indice 0 ele imprime
            }
        }
    }
}    
