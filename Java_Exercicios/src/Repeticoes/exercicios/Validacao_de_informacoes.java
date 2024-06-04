package Repeticoes.exercicios;

import java.util.Scanner;

public class Validacao_de_informacoes {
    public static void Informacoes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine().replaceAll("\\s+", "");

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o seu sexo: ");
        String sexo = sc.next();

        System.out.print("Seu estado civil: ");
        String estado_civil = sc.next();

        if (nome.length() > 1) {
            System.out.printf("\nSeu nome %s têm %s cacteres",nome, nome.length());
        }
        if (idade >= 0 && idade <= 150) {
            System.out.printf("\nA sau idade é %d e portanto está entre 0 e 150", idade);
        }
        if (salario > 0) {
            System.out.printf("\nSalário é %.2f e prtanto ele é maior que 0", salario);
        }
        if (sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("masculino")) {
            System.out.printf("\nO seu sexo é %s e portanto você é feminino ou masculino", sexo);
        }
        if (estado_civil.equalsIgnoreCase("solteiro") || estado_civil.equalsIgnoreCase("casado") ||
                estado_civil.equalsIgnoreCase("divorciado") || estado_civil.equalsIgnoreCase("viuvo")) {
            System.out.printf("\nO seu estado civil é %s e portato voce esta C ou S ou V ou D", sexo);
        }
    }

    public static void main(String[] args) {
        Informacoes();
    }

}
