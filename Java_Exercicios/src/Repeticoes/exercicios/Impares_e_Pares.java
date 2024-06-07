package Repeticoes.exercicios;

import java.util.Scanner;

public class Impares_e_Pares {
    public static void ImparesPares() {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];
        int i = 0;
        int impares = 0;
        int pares = 0;
        for (i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            numeros[i] = sc.nextInt();
        }
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.printf("Quantidade de pares:  %d", pares);
        System.out.printf("\nQuantidade de ímpares: %d", impares);
    }

    public static void ParesImpares() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o inicio: ");
        int inicio = sc.nextInt();
        int impares = 0;
        int pares = 0;
        System.out.print("Digite o final: ");
        int parada = sc.nextInt();

        for (int i = inicio; i < parada + 1; i++) {
            if (i % 2 == 0) {
                System.out.printf("\nPares %d", i);
            } else {
                System.out.printf("\nímpares %d", i);
            }
        }
    }

    public static void main(String[] args) {
        ParesImpares();
    }
}
