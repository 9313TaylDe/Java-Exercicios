package Condicoes.exercicios;

import java.util.Scanner;

public class Maior_e_menor_entre_tres {
    public static void MaiorMenor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int num1 = sc.nextInt();
        System.out.print("Digite mais um valor: ");
        int num2 = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int num3 = sc.nextInt();

        if(num1 <= num2 && num1 <= num3 ){
            System.out.printf("O menor entre os três é: %d", num1);
        }
        else if(num2 <= num1 && num2 <= num3 ){
            System.out.printf("O menor entre os três é: %d", num2);
        }
        else if(num3 <= num2 && num3 <= num1){
            System.out.printf("O menor entre os três é: %d", num3);
        }
        if(num1 >= num2 && num1 >= num3){
            System.out.printf("\nO maior entre os três é: %d", num1);
        }else if(num2 >= num1 && num2 >= num3){
            System.out.printf("\nO maior entre os três é: %d", num2);
        }else if(num3 >= num1 || num3 >= num2){
            System.out.printf("\nO maior entre os três é: %d", num3);
        }
    }

    public static void main(String[] args) {
        MaiorMenor();
    }

}
