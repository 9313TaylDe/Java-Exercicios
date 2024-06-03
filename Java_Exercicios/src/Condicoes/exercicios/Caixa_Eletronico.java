package Condicoes.exercicios;

import java.util.Scanner;

public class Caixa_Eletronico {

    public static void Saque() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        double valor = sc.nextDouble();

        System.out.print("\nNotas disponiveis:  100,00 - 50,00 - 10,00, 5,00 - 1,00");
        boolean passe = true;

        if (valor < 10.00) {
            System.out.print("Valor minimo é 10,00: ");
        }
        passe = false;
        if (valor > 600) {
            System.out.print("\nValor máximo  de 600,00 ultrapassado: ");
        }
        passe = false;
        if (valor >= 10.00 && valor <= 600.00) {
            if (valor == 256) {
                System.out.print("\nNotas: 2 x 100,00 --- 1 x 50,00 --- 1 x 5,00 --- 1 x 1,00  o total será de 256,00");
            } else if (valor == 399) {
                System.out.print(
                        "\nNotas: 3 x 100,00 --- 1 x 50,00 --- 4 x 10,00 --- 1 x 5,00 --- 4 x 1,00  o total será de 399,00");
            }
        }
    }

    public static void main(String[] args) {
        Saque();
    }
}