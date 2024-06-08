package Repeticoes.exercicios;

import java.util.Scanner;

public class Fatorial_de_n {
    public static void Fatorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Digite um número de parada: ");
        int parada = sc.nextInt();
        int soma = 0;
        int i = 0;
        for (i = inicio; i < parada++; i++) {

            System.out.printf("\nFatorial: %d", inicio *= i);
        }
    }

    public static void main(String[] args) {
        Fatorial();
    }

}
