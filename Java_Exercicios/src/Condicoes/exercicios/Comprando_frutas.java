package Condicoes.exercicios;

import java.util.Scanner;

public class Comprando_frutas {

    public static void Comprando() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs em kg: ");
        double qtd_macas = sc.nextDouble();
        System.out.print("Digite a quantidade de morangos em kg: ");
        double qtd_morangos = sc.nextDouble();
        double quilo_de_maca = 0;
        double quilo_morango = 0;
        double preco_morango = 2.50;
        double preco_maca = 1.90;
        double valor_total = 0;
        double desconto_acima_vintecinco = 0;
        valor_total = (qtd_macas * preco_maca) + (qtd_morangos * preco_morango);

        if (qtd_macas + qtd_morangos > 8 || valor_total > 25.00) {
            desconto_acima_vintecinco = valor_total * (0.1);
            System.out.printf("\nValor total sem desconto: R$%.2f", valor_total);
            System.out.printf("\nValor total com desconto: R$%.2f", valor_total - desconto_acima_vintecinco);
            System.out.printf("\nValor do desconto:  R$%.2f", desconto_acima_vintecinco);
        } else if (qtd_macas > 5) {

        }
    }

    public static void main(String[] args) {
        Comprando();

    }

}
