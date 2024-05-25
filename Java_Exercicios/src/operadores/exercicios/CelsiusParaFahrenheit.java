package operadores.exercicios;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static double Celsius() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em celsius: ");
        double celsius = sc.nextDouble();

        double Farenheit = (celsius * 1.8) + 32;

        System.out.printf("A temperaturs de celsius para farenheit: %.2f", Farenheit);
        return Farenheit;
    }

    public static void main(String[] args) {
        Celsius();
    }
}
4