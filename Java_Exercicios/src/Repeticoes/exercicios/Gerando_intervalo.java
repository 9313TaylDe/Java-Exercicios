package Repeticoes.exercicios;

import java.util.Scanner;

public class Gerando_intervalo {
    public static void Intervalos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número menor: ");
        int menor = sc.nextInt();

        System.out.print("Digite um maior: ");
        int maior = sc.nextInt();
        for (int i = menor + 1; i < maior; i++) {
            System.out.printf("\nNúmeros no intervalo %d", i);
        }

    }

    public static void main(String[] args) {
        Intervalos();
    }

}
