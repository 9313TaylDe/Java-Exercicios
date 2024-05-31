package Condicoes.exercicios;

import java.util.Scanner;

public class Ano_issexto {
    static Scanner sc = new Scanner(System.in);

    public static void Bissexto() {
        boolean E_bissexto = false;

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 != 0 || ano % 400 == 0) {
                E_bissexto = true;
            }

        }
        if (E_bissexto) {
            System.out.printf("O ano %d é bissexto ", ano);
        } else {
            System.out.printf("\nAno %d não é bissexto ", ano);
        }

    }

    public static void main(String[] args) {
        Bissexto();
    }

}
