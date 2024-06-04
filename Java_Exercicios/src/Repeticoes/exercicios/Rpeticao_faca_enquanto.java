package Repeticoes.exercicios;

import java.util.Scanner;

public class Rpeticao_faca_enquanto {
    public static void FacaEnquanto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int i = 0;

        do {
            i++;
            System.out.printf("Começo: %d", i);
        } while (i <= numero);
        System.out.printf("Valor e %d", i);
    }

    public static void main(String[] args) {
        FacaEnquanto();
    }
}
