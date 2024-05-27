package Operadores.exercicios;

import java.util.Scanner;

public class ProdutoSomaTriploEElevadoAoCubo {
    public static int Metodo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um valor: ");
        int inteiro = sc.nextInt();
        System.out.print("\nDigite mais um valor: ");
        int inteiro2 = sc.nextInt();
        int metade = inteiro2 / 2;

        int produto = ((inteiro * 2) + metade);

        System.out.printf("O dobro do produto do primeiro número + a soma da metade do segundo número é: %d", produto);

        return produto;
    }

    public static double TriploComTerceiro() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um número: ");
        int inteiro = sc.nextInt();

        System.out.print("\nDigite outro número: ");
        double real = sc.nextDouble();

        double triplo = ((inteiro * 3) * real);

        System.out.printf("\nO triplo do primeiro com o terceiro é de: %.1f", triplo);

        return triplo;
    }

    public static double AoCubo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double real = sc.nextDouble();
        double AoCubo = Math.pow(real, 3);

        System.out.printf("O cubo de %.1f é igual a %.1f", real, AoCubo);
        return AoCubo;
    }

    public static void main(String[] args) {
        AoCubo();
        TriploComTerceiro();
        Metodo();
    }
}
