package Condicoes.exercicios;

import java.util.Scanner;

public class Vogal_ou_Consoante {

    public static void VogalConsoante(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = sc.next();

        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
           letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
           letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("á") ||
           letra.equalsIgnoreCase("à") || letra.equalsIgnoreCase("é") || 
           letra.equalsIgnoreCase("ì") || letra.equalsIgnoreCase("ò") ||
           letra.equalsIgnoreCase("ù")){
            System.out.printf("A letra %s é uma vogal", letra);
           }
    }

}
