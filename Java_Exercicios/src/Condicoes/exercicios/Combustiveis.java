package Condicoes.exercicios;

import java.util.Scanner;

public class Combustiveis {

    public static void Posto() {
        Scanner sc = new Scanner(System.in);
        double desconto = 0;
        System.out.print(" --BEM-VINDO-AO-POSTO-SÃO-DOMINGOS------ ");
        System.out.print("Preço da gasolina: R$2,50 | Preço do alcool: R$1,90");
        System.out.print(
                "\n--------------------------------------------------------------------------------------------\n");
        System.out.print("Quanto de gasolina? ");

        double quantidade_gasolina = sc.nextDouble();
        System.out.print("Quanto de alcool? ");

        double quantidade_alcool = sc.nextDouble();
        double valor_alcool = 1.90;
        double valor_gasoline = 2.50;
        String alcool = "";
        System.out.print("Aditivada ou comum? ");
        String gasolina = sc.next();
        System.out.println("\n");
        if (gasolina.equalsIgnoreCase("aditivada")) {
            System.out.printf("Tipo de gasolina %s", gasolina);
            System.out.print("\n-----------------------------");
            if (quantidade_gasolina <= 20) {
                desconto = quantidade_gasolina * 0.06;
                System.out.printf("\nValor a ser pago pela gasolina: R$%.2f", quantidade_gasolina - desconto);
                System.out.printf("\nDesconto na compra da gasolina R$%.2f", desconto);
            } else if (quantidade_gasolina >= 20) {
                desconto = quantidade_gasolina * 0.05;
                System.out.printf("\nValor a ser pago pela gasolina: R$%.2f", quantidade_gasolina - desconto);
                System.out.printf("\nDesconto na compra da gasolina R$%.2f", desconto);
            }
        }
        else if (gasolina.equalsIgnoreCase("comum")) {
            System.out.printf("Tipo de gasolina %s", gasolina);
            System.out.print("\n-----------------------------");
            if (quantidade_gasolina >= 20) {
                desconto = quantidade_gasolina * 0.06;
                System.out.printf("\nValor a ser pago pela gasolina: R$%.2f", quantidade_gasolina - desconto);
                System.out.printf("\nDesconto na compra da gasolina R$%.2f", desconto);
            } else if (quantidade_gasolina <= 20) {
                desconto = quantidade_gasolina * 0.05;
                System.out.printf("\nValor a ser pago pela gasolina: R$%.2f", quantidade_gasolina - desconto);
                System.out.printf("\nDesconto na compra da gasolina R$%.2f", desconto);

            }
        }
        System.out.println("\n-------------------------------------------------------");

        if (quantidade_alcool <= 20) {
            desconto = quantidade_alcool * 0.03;
            System.out.printf("\nValor a ser pago pelo álcool: R$%.2f", quantidade_alcool - desconto);
            System.out.printf("\nDesconto na compra do álcool R$%.2f", desconto);
        } else {
            desconto = quantidade_alcool * 0.05;
            System.out.printf("\nValor a ser pago pelo álcool: R$%.2f", quantidade_alcool - desconto);
            System.out.printf("\nDesconto na compra do álcool R$%.2f", desconto);
        }
    }

    public static void main(String[] args) {
        Posto();
    }
}
