package Condicoes.exercicios;

import java.util.Scanner;

public class Organizacoes_Nildinha {

    public static Double Salario(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o seu salário atual: ");
        double salario = sc.nextDouble();

        if(salario <= 280){
            double aumento_vinte = (salario * 20)/100;
            double antigo_salario = salario;
            int percentual = 20 ;
            System.out.printf("Seu antigo salário era de R$%.2f", antigo_salario);
            System.out.printf("\nO percentual de aumento é de %d%%", percentual);
            System.out.printf("\n$s o seu novo salário com auemnto de 20%% será de R$%.2f", (salario + aumento_vinte));
        }
        else if(salario > 280 && salario <= 700){
            double aumento_quinze = (salario * 15)/100;
            double antigo_salario = salario;
            int percentual = 15 ;
            System.out.printf("Seu antigo salário era de R$%.2f", antigo_salario);
            System.out.printf("\nO percentual de aumento é de %d%%", percentual);
            System.out.printf("\n$s o seu novo salário com auemnto de 15%% será de R$%.2f", (salario + aumento_quinze));
        }
        else if(salario > 700 && salario <= 1500){
            double aumento_dez = (salario * 10)/100;
            double antigo_salario = salario;
            int percentual = 10;
            System.out.printf("Seu antigo salário era de R$%.2f", antigo_salario);
            System.out.printf("\nO percentual de aumento é de %d%%", percentual);
            System.out.printf("\n$s o seu novo salário com auemnto de 10%% será de R$%.2f", (salario + aumento_dez));
        }
        else if(salario > 1500){
            double aumento_cinco = (salario * 5)/100;
            double antigo_salario = salario;
            int percentual = 5 ;
            System.out.printf("Seu antigo salário era de R$%.2f", antigo_salario);
            System.out.printf("\nO percentual de aumento é de %d%%", percentual);
            System.out.printf("\n$s o seu novo salário com auemnto de 5%% será de R$%.2f", (salario + aumento_cinco));
        }

        return salario;
    }

    public static void main(String[] args) {
        Salario();
    }

}
