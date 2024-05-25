package operadores.exercicios;

import java.util.Scanner;

public class Impostos {
    public static Double Salario(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: ");
        double valor_Hora = sc.nextDouble();
        System.out.print("Horas trabalhadas por mês: ");
        double valor_Mes = sc.nextDouble();

        double imposto_de_Renda = 0.11;
        double Inss = 0.08;
        double Sindicato = 0.05;

        System.out.print("Salário bruto: R$%.2f");

        return 0.0;
    }
}
