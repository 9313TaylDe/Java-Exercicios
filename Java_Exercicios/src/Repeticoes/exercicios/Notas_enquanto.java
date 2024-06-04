package Repeticoes.exercicios;

import java.util.Scanner;

public class Notas_enquanto {

    public static void Notas_enquanto() {
        Scanner sc = new Scanner(System.in);

        boolean notaValida = false;

        while (!notaValida) {
            System.out.print("Digite a nota: ");
            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                System.out.printf("A nota digitada é válida: %.1f", nota);
                break;
            } else {
                System.out.print("Nota inválida, ");
            }
        }
    }

    public static void main(String[] args) {
        Notas_enquanto();
    }

}
