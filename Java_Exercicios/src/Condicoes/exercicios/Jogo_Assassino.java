package Condicoes.exercicios;

import java.util.Scanner;

public class Jogo_Assassino {
    public static void Assassino() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Telefonou pra vitima? ");
        String telefonou = sc.nextLine();
        System.out.print("Esteve no loca? ");
        String esteve_no_local = sc.nextLine();
        System.out.print("Mora perto da vitima? ");
        String mora = sc.nextLine();
        System.out.print("Devia para a vitima? ");
        String devia = sc.nextLine();
        System.out.print("Já trabalhou com a vitima? ");
        String trabalhou = sc.nextLine();

        int cont = 0;

        if (telefonou.equals("s")) {
            cont++;
        }
        if (esteve_no_local.equals("s")) {
            cont++;
        }
        if (mora.equals("s")) {
            cont++;
        }
        if (devia.equals("s")) {
            cont++;
        }
        if (trabalhou.equals("s")) {
            cont++;
        }

        if (cont == 2) {
            System.out.printf("\n%s você é suspeito", nome);
        } else if (cont == 3 || cont == 4) {
            System.out.printf("\n%s você é cumplíce", nome);
        } else if (cont == 5) {
            System.out.printf("\n%s você é o assassino", nome);
        } else if (cont == 5) {
            System.out.printf("\n%s você é inocente", nome);
        }

        boolean passe = true;
        System.out.print("\nVocê confirma as respostas");
        String tem_certeza = sc.nextLine();

        if (passe) {
            System.out.println("Programa encerrado!");
        }
        passe = false;
    }

    public static void main(String[] args) {
        Assassino();
    }
}
