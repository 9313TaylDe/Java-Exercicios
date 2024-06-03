package Condicoes.exercicios;

import java.util.Scanner;

public class Impar_Par {

    public static void Lets() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.printf("O número %d é par", num);
        } else {
            System.out.printf("O número %d é ímpar", num);
        }
    }

    public static void main(String[] args) {
        Lets();
    }

}
