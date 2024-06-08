package Repeticoes.exercicios;

import java.util.Scanner;

public class Fibonacci {
    public static void Fibo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um númmero: ");
        int numero_de_termos = sc.nextInt();
        int fibonacci = (numero_de_termos - 1) + (numero_de_termos - 2);
        int a = 0;
        int b = 1;

        for (int i = 0; i < numero_de_termos; i++) {
            System.out.printf("\nSquência de Fibonacci: %d", a);
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Fibo();
    }

}
