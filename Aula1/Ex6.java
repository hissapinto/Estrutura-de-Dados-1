/*Escreva um método estático mulComAdicao() que recebe dois números como
parâmetros. O primeiro parâmetro é um número real e o segundo parâmetro um
número inteiro. A função deve retornar a multiplicação entre os parâmetros,
porém, a multiplicação deve ser feita usando apenas a operação de adição.
Inclua um código na main() que exemplifica o uso do método mulComAdicao(). */

import java.util.Scanner;

public class Ex6 {
    //So usa o 'class' no metodo "maior"

    public static float mulComAdicao(int a, float b){
        float resultado = 0;
        for (int i = 0; i < a; i++){
            resultado = resultado + b;
        }
        return resultado;
    }

    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int a = entrada.nextInt();
        System.out.print("Informe um número real: ");
        float b = entrada.nextFloat();
        entrada.close();

        System.out.print("A múltiplicação entre esse números é: "+mulComAdicao(a, b));
    }
}
