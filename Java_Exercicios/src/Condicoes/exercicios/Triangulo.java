package Condicoes.exercicios;

import java.util.Scanner;

public class Triangulo {
    public static void Triangulo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double lado_a = sc.nextDouble();
        System.out.print("Digite o lado B: ");
        double lado_b = sc.nextDouble();
        System.out.print("Digite o valor da base:");
        double base = sc.nextDouble();

        if(lado_a == lado_b && lado_a == base && lado_b == base){
            System.out.println("é um triangulo equilatero");
        }else if(lado_a == lado_b || lado_a == base || lado_b == base){
            System.out.println("É mum trianulo isósceles");
        }else if(lado_a != lado_b && lado_a != base && lado_b != base){
            System.out.println("É um trianuglo escaleno");
        }
    }
    public static void main(String[] args) {
        Triangulo();
    }

}
