package exercicios;

import java.util.Scanner;

public class PositivoFalso {
    public static void PositivoFalso() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        if(num1 > 0) {
            System.out.println("Número positivo");
        }else if(num1 < 0) {
            System.out.println("Número negativo");
        }else {
            System.out.println("Número neutro");
        }
    }
    public static void main(String[] args) {
        
    }

}
