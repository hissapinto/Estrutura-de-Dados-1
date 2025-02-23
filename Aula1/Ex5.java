/*Escreva um método estático min() que recebe dois parâmetros numéricos
inteiros e retorna o menor valor entre eles e um método estático max()
que recebe dois parâmetros numéricos inteiros e retorna o maior valor
entre eles. Inclua um código na main() que exemplifica o uso dos dois
métodos. */

import java.util.Scanner;

public class Ex5 {
    //Medoto do menor valor
    public static int min(int a, int b){
        return(a<b)? a : b;
        //a é maior que b?  se cond vdd -> a : se não b
    }
    //Metodo do maior valor
    public static int max(int a, int b){
        return(a>b)? a : b;
    }
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int a = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = entrada.nextInt();

        System.out.println("O maior valor informado foi :"+max(a,b));
        System.out.print("O menor valor informado foi: "+min(a,b));
    }
}
