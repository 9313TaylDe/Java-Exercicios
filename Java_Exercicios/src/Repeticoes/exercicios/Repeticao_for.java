package Repeticoes.exercicios;

import java.util.Scanner;

public class Repeticao_for {
    public static void RepeticaoPara() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int i = 0;

        for (i = 0; i < num; i++) {
            System.out.printf("\nContando: %d", i);
        }
    }

    public static void main(String[] args) {
        RepeticaoPara();
    }
}
