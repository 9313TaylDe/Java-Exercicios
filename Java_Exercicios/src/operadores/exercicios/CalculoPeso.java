package Operadores.exercicios;

import java.util.Scanner;

public class CalculoPeso {
    public static double Peso(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        double peso = (72.7 * altura) - 58;

        System.out.printf("Seu peso ideal é %.1f", peso);

        return peso;
    }

    public static void main(String[] args) {
        Peso();
    }

}
