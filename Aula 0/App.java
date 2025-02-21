import java.util.Scanner;
//pra poder fazer input e output

public class App{
    // funciona como o main, mas tem que ser o nome do arquivo, no caso App
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //Criando um scanner pra poder ler o input.
        System.out.print("Infome seu nome: ");
        String nome = entrada.nextLine();
        //Para ler uma linha (scanf)
        System.out.println("Bem vindo, " + nome + ", à disciplina de Estrutura de Dados 1!");
        // print com o ln pra criar uma nova linha. 
    }
}

//Pra rodar o código escreva no terminal javac App.java e depois java App