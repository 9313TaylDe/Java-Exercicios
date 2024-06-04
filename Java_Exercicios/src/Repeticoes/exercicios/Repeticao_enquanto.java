package Repeticoes.exercicios;

import java.util.Scanner;

public class Repeticao_enquanto {

    public static void Equanto(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int fim = sc.nextInt();
        int i = 0;

        while(i <= fim){
            System.out.printf("\nContando: %d", i);
            i ++;
        }
    }
    public static void main(String[] args) {
        Equanto();
    }
}
