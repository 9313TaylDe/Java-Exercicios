package Operadores.exercicios;

import java.util.Scanner;

public class NotasBimestrais {
    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double num3 = sc.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double num4 = sc.nextDouble();

        double media = (num1 + num2 + num3 + num4)/4;

        System.out.printf("A média é: %.1f", media);

    }

}
