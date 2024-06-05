package Repeticoes.exercicios;

import java.util.Scanner;

public class Impares_Ate50 {
    public static void Impares() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.printf("\nÍmpares: %d", i);
            }
        }

    }

    public static void main(String[] args) {
        Impares();
    }
}
