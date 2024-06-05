package Repeticoes.exercicios;

import java.util.Scanner;

public class Listando_numeros {

    public static void Listando()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i ++){
            System.out.printf("%d - ",i);
        }
    
    }

  

    public static void main(String[] args) {
        Listando();
    }

}
