/*Dois círculos se sobrepõem (colidem) se a soma dos seus raios é maior que
ou igual a distância entre seus centros. A distância entre dois pontos pode
ser calculada usando o teorema de Pitágoras (c = √𝑎! + 𝑏!). Escreva um
método estático haColisaoEntreCirculos() que recebe seis parâmetros:
a posição p1(x,y) e o raio r1 do primeiro círculo e a posição p2(x,y) e o
raio r2 do segundo círculo. Com os parâmetros informados, a função deve
retornar true caso os círculos estejam sobrepostos ou false, caso contrário.
Inclua um código na main() que exemplifica o uso do método
haColisaoEntreCirculos(). */

import java.util.Scanner;

public class Ex8 {

    public static boolean haColisaoEntreCirculos(float x1, float y1, float r1, float x2, float y2, float r2) {
        //teorema de Pitágoras
        float distancia = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        // Se r1 + r2 >= distância -> os círculos se sobrepõem
        return (r1 + r2) >= distancia;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Circulo 1
        System.out.println("Informe a posição (x e y) e o raio do primeiro círculo:");
        System.out.print("x1: ");
        float x1 = entrada.nextFloat();
        System.out.print("y1: ");
        float y1 = entrada.nextFloat();
        System.out.print("r1: ");
        float r1 = entrada.nextFloat();
        // Circulo 2
        System.out.println("Informe a posição (x e y) e o raio do segundo círculo:");
        System.out.print("x2: ");
        float x2 = entrada.nextFloat();
        System.out.print("y2: ");
        float y2 = entrada.nextFloat();
        System.out.print("r2: ");
        float r2 = entrada.nextFloat();
        entrada.close();
        boolean colisao = haColisaoEntreCirculos(x1, y1, r1, x2, y2, r2);
        //flag se tem colisão
        if (colisao == true) {
            System.out.print("Os círculos se sobrepõem.");
        } else {
            System.out.print("Os círculos NÃO se sobrepõem.");
        }
    }
}
