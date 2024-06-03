package Condicoes.exercicios;

import java.util.Scanner;

public class Jogo_Detetive {

    public static void Inicio() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Telefonou  pra vitima? ");
        String telefonou = sc.nextLine();
        System.out.print("Esteve no local do crime? ");
        String local_docrime = sc.nextLine();
        System.out.print("Mora perto da vitima? ");
        String mora_perto = sc.nextLine();
        System.out.print("Devia a vitima? ");
        String devia = sc.nextLine();
        System.out.print("Já trabalhou com a vitima? ");
        String trbalharam_juntas = sc.nextLine();
        String resposta = "";
        int resposta2 = 0;
        

        int cont = 0;

        if (telefonou.equals("sim")) {
            cont++;
        }
        if (local_docrime.equals("sim")) {
            cont++;
        }
        if (mora_perto.equals("sim")) {
            cont++;
        }
        if (devia.equals("sim")) {
            cont++;
        }
        if (trbalharam_juntas.equals("sim")) {
            cont++;
        }

        if(cont == 2){
            System.out.printf("%s você é suspito", nome);
        }else if (cont == 3 || cont == 4){
            System.out.printf("%s você é cumplíce", nome);
        }else if(cont == 5){
            System.out.printf("%s você é assassino", nome);
        }else if(cont == 0 || cont == 1){
            System.out.printf("%s você é inocente", nome);
        }

    }

    public static void main(String[] args) {
        Inicio();
    }

}
