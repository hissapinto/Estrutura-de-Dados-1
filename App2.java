import java.util.Scanner;
//pra poder fazer input e output

public class App2{
    // funciona como o main, mas tem que ser o nome do arquivo, no caso App

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //Criando um scanner pra poder ler o input.

        System.out.print("Infome o primeiro número: ");
        int numero1 = entrada.nextInt();
        //Para ler uma linha (scanf)
        /* pode usar double no lugar no int (32 bits) pra ser tipo um float (32 bits)
        só que com o dobro de espaço na memória (64 bits). long é o 64 bits de inteiros.*/

        System.out.print("Infome o segundo número: ");
        int numero2 = entrada.nextInt();
        //Para ler uma linha (scanf)

        System.out.println("Resultado da soma: " + (numero1 + numero2));
        // print com o ln pra criar uma nova linha. 
    }
}

//Pra rodar o código escreva no terminal javac App.java e depois java App