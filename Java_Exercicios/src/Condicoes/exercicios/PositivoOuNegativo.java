package Condicoes.exercicios;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void PosiNega(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        if(n1 < 0){
            System.out.printf("O número %d é negativo",n1);
        }else if (n1 > 0){
            System.out.printf("O número %d é positivo",n1);
        }else {
            System.out.print("O número é neutro");
        }
    }
    public static void main(String[] args) {
        PosiNega();
    }

}
