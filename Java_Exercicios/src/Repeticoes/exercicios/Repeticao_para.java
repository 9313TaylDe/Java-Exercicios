package Repeticoes.exercicios;

import java.util.Scanner;

public class Repeticao_para {
    public static void Para() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um fim: ");
        int fim = sc.nextInt();

        for (int i = 0; i < fim; i++) {
            System.out.printf("Contando: %d ", i);
        }
    }

    public static void main(String[] args) {
        Para();
    }

}
