package Repeticoes.exercicios;

import java.util.Scanner;

public class Gerando_intervalo {
    public static void Intervalos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número menor: ");
        int menor = sc.nextInt();
        int i = 0;
        int soma = 0;

        System.out.print("Digite um maior: ");
        int maior = sc.nextInt();
        for ( i = menor + 1; i <= maior; i++) {
            System.out.printf("\nNúmeros no intervalo %d", i);
        }

        for(i = menor; i <= maior; i ++){
            soma += i;
        }
        System.out.printf("\nA soma dos números do intervalo é de %d",soma);

    }

    public static void main(String[] args) {
        Intervalos();
    }

}
