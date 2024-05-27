package Condicoes.exercicios;

import java.util.Scanner;

public class Maior_de_Dois {

    public static String Maior(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite mais um número: ");
        int n2 = sc.nextInt();

        if(n1 > n2){
            System.out.printf("O número %d é maior que o número %d",n1,n2);
        }else if(n1 < n2){
            System.out.printf("O número %d é  maior que o número %d",n2,n1);
        }

        return "hello";
    }
    public static void main(String[] args) {
        Maior();
    }

}
