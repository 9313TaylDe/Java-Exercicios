package Operadores.exercicios;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        
     Scanner sc =  new Scanner(System.in);

        System.out.print("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();
        
        double area = Math.PI * (raio * raio);
        System.out.printf("A área de um circulo de raio %.1fr é %.2f", raio, area);

    }
}
