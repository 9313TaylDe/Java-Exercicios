package Condicoes.exercicios;

import java.util.Scanner;

public class DDMMAAAA {
    public static void DMA() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma data: dia/mes/ano:  ");
        boolean ativa = true;

        System.out.print("\nDia: / ");
        int dia = sc.nextInt();
        if (dia > 31) {
            System.out.print("\nPrograma encerrado");
        }
        ativa = false;

        if (dia < 32) {
            System.out.printf("%d / Mês: / ", dia);
            int mes = sc.nextInt();
            System.out.printf("%d / %d / Ano: /", dia, mes);
            int ano = sc.nextInt();

            if (dia <= 31 && mes <= 12 || ano > 0) {
                System.out.printf("A data a seguir é  válida: %d / %d / %d", dia, mes, ano);
            }
        }
    }

    public static void main(String[] args) {
        DMA();
    }
}
