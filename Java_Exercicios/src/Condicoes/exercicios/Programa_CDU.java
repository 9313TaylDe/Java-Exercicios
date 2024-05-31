package Condicoes.exercicios;

import java.util.Scanner;

public class Programa_CDU {
    public static void DEZ_UNI_CEN() {
        Scanner sc = new Scanner(System.in);
        
        boolean ativado = true;

        System.out.print("Digite um númmero: ");
        int num = sc.nextInt();
        int centena = (num / 100) % 10;
        int dezena = (num / 10) % 10;
        int unidade = num % 10;
        if (num < 0 || num == 0) {
            System.out.println("Programa encerrado!");
        }
        ativado = false;
        if (num > 0) {
            System.out.printf("O número digitado foi: %d", num);
            System.out.printf("\nCentenas: %d", centena);
            System.out.printf("\nDezenas:  %d", dezena);
            System.out.printf("\nUnidades: %d", unidade);
        }
    }

    public static void main(String[] args) {
        DEZ_UNI_CEN();
    }

}
