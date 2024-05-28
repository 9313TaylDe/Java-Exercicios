package Condicoes.exercicios;

import java.util.Scanner;

public class Ordem_decrescente {

    public static void Decrescente(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Dgite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite mais um número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num3 = sc.nextInt();

        if(num1 <= num2 && num1 <= num3 && num3 <= num2){
            //1 é menor
            //3 é do meio
            //2 é maior
            System.out.printf("1:  %d - %d - %d ",num1,num3,num2);
        }else if(num1 <= num2 && num1 <= num3 && num2 <= num3){
            //1 é menor
            //2 é do meio
            //3 é maior
            System.out.printf("2:  %d - %d - %d",num1,num2,num3);
        }else if(num2 <= num1 && num2 <= num3 && num3 <= num1){
            //2 é menor
            //3 é do meio
            //1 é maior
            System.out.printf("3:  %d - %d - %d",num2,num3,num1);
        }else if(num3 <= num2 && num3 <= num1 && num2 <= num1){
            //2 é menor
            //3 é do meio
            //1 é maior
            System.out.printf("4:  %d - %d - %d",num3,num2,num1);
        }else if(num3 <= num2 && num3 <= num1 && num1 <= num2){
            //2 é menor
            //3 é do meio
            //1 é maior
            System.out.printf("5:  %d - %d - %d",num3,num1,num2);
        }
        
            //num2 é menor
            //num1 é maior
            //num2 < num3 < num1

        
    }

    public static void main(String[] args) {
        Decrescente();
    }

}
