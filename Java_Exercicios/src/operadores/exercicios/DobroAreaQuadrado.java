package operadores.exercicios;

import java.util.Scanner;

public class DobroAreaQuadrado {
    public static void main(String[] args) {
        
     Scanner sc =  new Scanner(System.in);

        System.out.print("Digite o valor do lado: ");
        double lado = sc.nextDouble();
        
        double dobro = Math.pow(lado, 2)* 2;

        System.out.printf("O dobro da are de um quadrado é: %.1f", dobro);
    }
}
