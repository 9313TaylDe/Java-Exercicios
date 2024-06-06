package Repeticoes.exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void Tabuada_de_qualquer_numero() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int soma = 0;
        int multiplicacao = 0;
        int divisao = 0;
        int subtracao = 0;
        System.out.println("  T-A-B-U-A-D-A");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n  %d + %d = %d", numero, i, (soma = numero + i));
        }
        System.out.println("\n--------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n  %d*%d = %d      %d + %d = %d      %d - %d = %d      %d / %d = %d", numero, i,
                                                (multiplicacao = numero * i), numero, i, (soma = numero + i), numero,i,
                                                            (subtracao = numero - i), numero, i, (divisao = numero / i));
        }
      
    }

    public static void main(String[] args) {
        Tabuada_de_qualquer_numero();
    }
}
