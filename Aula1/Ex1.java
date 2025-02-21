/*Escreva um código Java que leia dois números inteiros informados pelo usuário.
Cada número deve ser salvo em variáveis distintas, por exemplo, valor1 e valor2.
Após ler os dois números, o código deve trocar o conteúdo das variáveis.

Para pensar... e anotar as suas respostas no papel ou no digital (ou como comentário no código da sua solução):
Existe algum tipo de entrada [feita por quem usa o programa] que “quebra” o seu código? Como podemos resolver o problema?*/

import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int valor1 = entrada.nextInt();
        System.out.print("Informe o segundo número: ");
        int valor2 = entrada.nextInt();
        int aux;
        aux = valor2;
        valor2 = valor1;
        valor1 = aux;
        System.out.println("Agora o primeiro número é: " + valor1);
        System.out.println("E o segundo: " + valor2);
    }
}