package Repeticoes.exercicios;

import java.util.Scanner;

public class CidadeA_CidadeB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a população da cidade A: ");
        double populacao_A = sc.nextDouble();
        double taxaA = 0.03;

        System.out.print("Digite a população da cidade B: ");
        double populacao_B = sc.nextDouble();
        double taxaB = 0.015;

        int anos = 0;

        while (populacao_A <= populacao_B) {
            populacao_A *= (1 + taxaA);
            populacao_B *= (1 + taxaB);
            anos++;
        }

        System.out.println("A cidade A igualará ou ultrapassará a cidade B em " + anos + " anos.");
    }
}
