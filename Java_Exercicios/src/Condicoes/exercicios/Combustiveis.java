import java.util.Scanner;

public class Combustiveis {

    public static void Posto() {
        Scanner sc = new Scanner(System.in);
        double desconto = 0;
        System.out.println(" --BEM-VINDO-AO-POSTO-SÃO-DOMINGOS------ ");
        System.out.println("Preço da gasolina: R$2,50 | Preço do álcool: R$1,90");
        System.out.println(
                "--------------------------------------------------------------------------------------------");
        System.out.print("Quanto de gasolina? ");

        double quantidade_gasolina = sc.nextDouble();
        System.out.print("Quanto de álcool? ");
        double quantidade_alcool = sc.nextDouble();

        double valor_final_gasolina = 0;
        double valor_final_alcool = 0;

        double preco_gasolina = 2.50;
        double preco_alcool = 1.90;

        double desconto_gasolina = 0.04;
        double desconto_alcool = 0.03;
        System.out.print("Aditivada ou comum? ");
        String tipo_gasolina = sc.next();

        if (tipo_gasolina.equalsIgnoreCase("aditivada")) {
            if (quantidade_gasolina <= 20) {
                valor_final_gasolina = quantidade_gasolina * preco_gasolina;
            } else {
                valor_final_gasolina = quantidade_gasolina * preco_gasolina * (1 - desconto_gasolina);
            }
        } else if (tipo_gasolina.equalsIgnoreCase("comum")) {
            if (quantidade_gasolina <= 20) {
                valor_final_gasolina = quantidade_gasolina * preco_gasolina;
            } else {
                valor_final_gasolina = quantidade_gasolina * preco_gasolina * (1 - desconto_gasolina);
            }
        }

        if (quantidade_alcool <= 20) {
            valor_final_alcool = quantidade_alcool * preco_alcool;
        } else {
            valor_final_alcool = quantidade_alcool * preco_alcool * (1 - desconto_alcool);
        }

        double valor_total = valor_final_gasolina + valor_final_alcool;
        System.out.printf("Valor a ser pago pela gasolina: R$%.2f%n", valor_final_gasolina);
        System.out.printf("Valor a ser pago pelo álcool: R$%.2f%n", valor_final_alcool);
        System.out.printf("Valor total a ser pago: R$%.2f%n", valor_total);
    }

    public static void main(String[] args) {
        Posto();
    }
}
