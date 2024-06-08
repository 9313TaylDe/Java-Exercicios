package Repeticoes.exercicios;

import java.util.Scanner;

public class Maior_menor_soma {
    public static void Pacote() {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[4];
        int soma = 0;
        int num = 0;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int i = 0;

        for (i = 0; i < 4; i++) {
            System.out.printf("Digite o %dº número: ", i);
            numeros[i] = sc.nextInt();
            num = numeros[i];

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            soma += num;
        }

        System.out.printf("\nMaior número: %d", maior);
        System.out.printf("\nMenor número: %d", menor);
        System.out.printf("\nSoma dos números: %d", (soma));
    }

    public static void main(String[] args) {
        Pacote();

    }

}
