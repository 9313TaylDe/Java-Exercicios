package Repeticoes.exercicios;

import java.util.Scanner;

public class Repeticao_para {
    public static void Para() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um fim: ");
        int fim = sc.nextInt();
        int i = 0;

        for (i = 0; i < fim; i++) {
            System.out.printf("Contando: %d ", i);
        }
        System.out.println("----");

        for(i = fim; i > 0; i--){
            System.out.printf("\nContando: %d", i);
        }
    }

    public static void main(String[] args) {
        Para();
    }

}
