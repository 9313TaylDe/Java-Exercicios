package Condicoes.exercicios;

import java.util.Scanner;

public class Opcoes {
    public static void Calculadora() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        boolean passe = true;
        int resultado = 0;
        System.out.println("Digite a sua opção: *, /, -, +");
        String opcao = sc.next();

        switch (opcao) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;

            default:
                System.out.print("operação inválido!");
                break;
        }
        if (passe) {
            System.out.print("Resultado " + resultado);
            if (resultado >= 0) {
                System.out.print("\nResultado positivo");
            } else {
                System.out.print("\nResultado negativo");
            }
            if (resultado % 2 == 0) {
                System.out.print("\nÉ par");
            } else {
                System.out.print("\nÉ ímpar");
                passe = false;
            }
        }

    }

    public static void main(String[] args) {
        Calculadora();
    }
}
