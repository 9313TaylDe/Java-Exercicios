package Repeticoes.exercicios;

import java.util.Scanner;

public class Soma_e_Media {
    public static void Media() {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double notas[] = new double[5];
        double soma = 0;
        

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº  número: ", i);
            notas[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i ++){
            soma = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]);
            media = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4])/5;   
            System.out.printf("\nAs notas são as seuintes: %.1f", notas[i]);
        }
                System.out.println("\n"+media);
                System.out.printf("\nA soma das notas é: %.1f", soma);

    }
    public static void main(String[] args) {
        Media();
    }
}
