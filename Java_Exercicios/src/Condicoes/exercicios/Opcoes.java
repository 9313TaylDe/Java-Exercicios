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

        if (n1 == 0 && n2 == 0) {
            System.out.println("O número é neutro!");
            System.out.println("\nPrograma encerrado! ");
        }
        passe = false;

        if (n1 > 0 ^ n2 < 0) {
            System.out.println("Digite a sua opção: *, /, -, +");
            String opcao = sc.next();
            switch (opcao) {
                case "+":
                    int soma = n1 + n2;
                    if (n1 < 0 && n2 < 0) {
                        System.out.printf("O número é negativo: %d", soma);
                    } else if (n1 > 0 && n2 > 0) {
                        System.out.printf("A soma de %d + %d = %d", n1, n2, soma);
                        System.out.printf("\nO número é positivo e par: %d", soma);
                    }
                    break;

                case "-":
                    int subtracao = n1 + n2;
                    if (n1 < 0 && n2 < 0) {
                        System.out.printf("O número é negativo: %d", subtracao);
                    } else if (n1 > 0 && n2 > 0) {
                        System.out.printf("A subtração de %d - %d = %d", n1, n2, subtracao);
                        System.out.printf("\nO número é positivo e par: %d", subtracao);
                    }
                    break;

                case "*":
                    int multiplicacao = n1 + n2;
                    if (n1 < 0 && n2 < 0) {
                        System.out.printf("O número é negativo: %d", multiplicacao);
                    } else if (n1 > 0 && n2 > 0) {
                        System.out.printf("A multiplicação de %d * %d = %d", n1, n2, multiplicacao);
                        System.out.printf("\nO número é positivo e par: %d", multiplicacao);
                    }
                    break;

                case "/":
                    int divisao = n1 + n2;
                    if (n1 < 0 && n2 < 0) {
                        System.out.printf("O número é negativo: %d", divisao);
                    } else if (n1 > 0 && n2 > 0) {
                        System.out.printf("A divisão de %d / %d = %d", n1, n2, divisao);
                        System.out.printf("\nO número é positivo e par: %d", divisao);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Calculadora();
    }
}
