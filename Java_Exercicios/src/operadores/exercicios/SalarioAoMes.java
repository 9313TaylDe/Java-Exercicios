package Operadores.exercicios;

import java.util.Scanner;

public class SalarioAoMes {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: ");
        double valor = sc.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas:  ");
        int horas = sc.nextInt();
        int diasSemanais = 5;
        int horasSemanais = horas * diasSemanais;
        int horasMensais = horasSemanais * 4;

        double salario = valor * horasMensais;

        System.out.printf("O seu salário mensal será de: R$%.2f ",salario);

    }

}
