package Condicoes.exercicios;

import java.util.Scanner;

public class Horario {
    public static void Horario_cumprimento(){
        Scanner sc = new Scanner(System.in);

        System.out.print("    Horario de estudo?");
        System.out.println("\n---------------------------");
        System.out.print("    Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("M(Matutino) - V(vespertino) - N(Noturno):");
        String letra = sc.next();

        if(letra.equalsIgnoreCase("m")){
            System.out.printf("Bom dia, %s", nome);
        }else if(letra.equalsIgnoreCase("v")){
            System.out.printf("Boa tarde,%s", nome);
        }else if(letra.equalsIgnoreCase("n")){
            System.out.printf("Boa noite, %s", nome);
        }else{
            System.out.print("Valor inválido");
        }
    }

    public static void main(String[] args) {
        Horario_cumprimento();
    }

}
