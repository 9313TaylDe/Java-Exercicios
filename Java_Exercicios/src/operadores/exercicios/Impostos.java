package Operadores.exercicios;

import java.util.Scanner;

public class Impostos {
    public static double Salario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Horas trabalhadas por dia: ");
        int horas = sc.nextInt();
        
        double salario_bruto = valorHora * horas;
        double importo_renda = (salario_bruto / 100) * 11;
        double inss = (salario_bruto / 100) * 8;
        double sindicato = (salario_bruto / 100) * 5;
        double total_descontos = inss + sindicato + importo_renda;
        double salario_liquido =  salario_bruto  - total_descontos;

         

        System.out.printf("Salário bruto: R$%.2f", salario_bruto);
        System.out.printf("\nQuando pagou ao inss: R$%.2f",inss);
        System.out.printf("\nTotal pago ao sindicato: R$%.2f", sindicato);
        System.out.printf("\nQuanto pagou de imposto de rendas: R$%.2f", importo_renda);
        System.out.printf("\nO total dos descontos é de: R$%.2f", total_descontos);
        System.out.printf("\nSalário líquido: R$%.2f", salario_liquido);

        return salario_liquido;
    }

    public static void main(String[] args) {
        Salario();
    }
}
