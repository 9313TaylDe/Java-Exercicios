package Repeticoes.exercicios;

import java.util.Scanner;

public class Notas_equanto {

    public static void Notas() {
        Scanner sc = new Scanner(System.in);

        boolean passe = false;
        while (!passe) {
            System.out.print("Digite uma nota: ");
            double notas = sc.nextDouble();
            if (notas >= 0 && notas <= 10) {
                System.out.printf("Você digitou: %.1f", notas);
                break;
            } else {
                System.out.printf("\nNota inválida, ");
            }
        }
    }

    public static void main(String[] args) {
        Notas();
    }

}
