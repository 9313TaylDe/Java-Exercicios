package Operadores.exercicios;

import java.util.Scanner;

public class FahrenheitParaCelsius {

    public static double Conversao() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura em celsius: ");
        double temperaturaC = sc.nextDouble();
        double Farenheit = 5 *(temperaturaC - 32)/ 9;

        System.out.printf("A temperatura de Farenheit para Celsius é %.2f", Farenheit);
        return Farenheit;
    }

    public static void main(String[] args) {
        Conversao();
    }
}
