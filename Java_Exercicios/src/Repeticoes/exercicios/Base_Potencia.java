package Repeticoes.exercicios;

import java.util.Scanner;

public class Base_Potencia {
    public static void BasePotencia() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = sc.nextDouble();

        System.out.print("Digite a potência: ");
        double potencia = sc.nextDouble();

        double exponenciacao = base *= potencia;
        System.out.println(exponenciacao);
    }

    public static void main(String[] args) {
        BasePotencia();
    }

}
