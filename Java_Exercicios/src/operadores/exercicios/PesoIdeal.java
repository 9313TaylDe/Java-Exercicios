package Operadores.exercicios;

import java.util.Scanner;

public class PesoIdeal {
    public static double Peso() {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;
        System.out.println("[1] entrar\n[0] sair");
        opcao = sc.nextInt();

        while (opcao > 0){

            System.out.print("Digite o seu nome: ");
            String nome = sc.next();
            System.out.print("\nDigite o seu sexo: ");
            String sexo = sc.next().toLowerCase();
            double altura = 0.0;
            double peso = 0.0;
            switch (sexo) {
                case "M":
                case "m":
                    System.out.print("\nDigite a altura: ");
                    altura = sc.nextDouble();
                    peso = (72.7 * altura) - 58;
                    double imc = peso / (altura * altura);
                    System.out.printf("%s o seu peso ideal é de:  %.1f", nome, imc);
                    if (imc < 18.5) {
                        System.out.println("\nO seu IMC é menor que 18,5 e portanto você está abaixo do peso");
                    } else if (imc > 18.5) {
                        System.out.println("\nO seu IMC está 18,5 e 24,9 e portanto você está  Peso normal");
                    } else if (imc > 24.9) {
                        System.out.println("\nO seu IMC está entre 25,0 e 29,9e portanto você está com sobrepeso");
                    } else if (imc > 29.9) {
                        System.out.println("\nO seu IMC entre 30,0 e 34,9 e portanto você está com Obesidade nivel 1");
                    } else if (imc > 34.9) {
                        System.out.println("\nO seu IMC entre 35,0 e 39,9 e portanto você está com Obesidade nivel 2");
                    } else if (imc > 39.9) {
                        System.out.println("\nO seu IMC está acima de 40,0 portanto voc~e está com Obesidade grau 3 (mórbida)");
                    }
                    break;

                case "F":
                case "f":
                    System.out.print("Digite a altura: ");
                    altura = sc.nextDouble();
                    peso = (83 * altura) - 44.7;
                    double imcF = peso / (altura * altura);
                    System.out.printf("%s o seu peso ideal é de:  %.1f", nome, imcF);
                    if (imcF < 18.5) {
                        System.out.println("\nO seu IMC é menor que 18,5 e portanto você está abaixo do peso");
                    } else if (imcF > 18.5) {
                        System.out.println("\nO seu IMC está 18,5 e 24,9 e portanto você está  Peso normal");
                    } else if (imcF > 24.9) {
                        System.out.println("\nO seu IMC está entre 25,0 e 29,9e portanto você está com sobrepeso");
                    } else if (imcF > 29.9) {
                        System.out.println("\nO seu IMC entre 30,0 e 34,9 e portanto você está com Obesidade nivel 1");
                    } else if (imcF > 34.9) {
                        System.out.println("\nO seu IMC entre 35,0 e 39,9 e portanto você está com Obesidade nivel 2");
                    } else if (imcF > 39.9) {
                        System.out.println("\nO seu IMC está acima de 40,0 portanto voc~e está com Obesidade grau 3 (mórbida)");
                    }
                    break;

                default:
                    System.out.println("Por favor digite um sexo válido");
                    break;

            }

        }
        System.out.println("Obrigado por utilizar o meu algoritmo!");
        return 0.0;
    }
    public static void main(String[] args) {
        Peso();
    }

}

//Fco Expedito Nascimento de Paulo
