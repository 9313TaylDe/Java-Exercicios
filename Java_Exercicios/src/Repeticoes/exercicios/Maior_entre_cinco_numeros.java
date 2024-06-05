package Repeticoes.exercicios;

import java.util.Scanner;

public class Maior_entre_cinco_numeros {

    public static void Maior() {
        int num[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número", i);
            num[i] = sc.nextInt();
        }

        int maior = num[0];
        for (int i = 1; i < 5; i++) {
            if (num[i] > maior) {
                maior = num[i];
            }

        }
        System.out.printf("\nO maior número é %d", maior);

    }

    public static void main(String[] args) {
        Maior();
    }
}