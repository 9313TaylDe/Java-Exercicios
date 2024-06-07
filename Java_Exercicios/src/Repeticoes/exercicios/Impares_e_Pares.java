package Repeticoes.exercicios;

import java.util.Scanner;

public class Impares_e_Pares {
    public static void ImparesPares() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o ultimo número a ser mostrado: ");
        int parada = sc.nextInt();

        for (int i = inicio; i < parada; i++) {
            if (i % 2 == 0) {
                System.out.printf("\nPares: %d", i);
            }
            if (i % 2 != 0) {
                System.out.printf("\nÍmpares: %d", i);
            }

        }
    }

    public static void main(String[] args) {
        ImparesPares();
    }
}
