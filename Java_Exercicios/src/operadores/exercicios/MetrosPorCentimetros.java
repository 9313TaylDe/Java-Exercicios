package operadores.exercicios;

import java.util.Scanner;

public class MetrosPorCentimetros {
    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;

        System.out.printf("A conversão de %.1fm para centimetros é: %.1fc",metros, centimetros);

    }

}