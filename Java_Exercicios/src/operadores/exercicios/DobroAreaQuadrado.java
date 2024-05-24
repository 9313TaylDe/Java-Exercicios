package operadores.exercicios;

import java.util.Scanner;

public class DobroAreaQuadrado {
    public static void main(String[] args) {
        
     Scanner sc =  new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = sc.nextDouble();
        double area = Math.pow(lado, 2)*2;

        System.out.printf("O dobro da área de um quadrado cujo um lado é de %.1f, será de %.1fa ",lado, area);
    }
}
