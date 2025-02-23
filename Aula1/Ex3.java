/*Escreva um código Java que leia 10 números reais e,
após a leitura dos números,
informe qual é o maior e qual é o menor.*/

import java.util.Scanner;

public class Ex3 {
    public static void main(String arg[]){
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Informe o número "+(i+1)+": ");
            numeros[i] = entrada.nextInt();
            //lê e armazena o numero no vetor
        }
        entrada.close();
        int maiorNumero = numeros[0];
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
        }
        System.out.print("O maior número digitado foi: " + maiorNumero);
    }
}
