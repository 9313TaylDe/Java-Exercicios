package Condicoes.exercicios;

import java.util.Scanner;

public class Qual_a_media {
    public static String Media() {

        Scanner sc = new Scanner(System.in);

        double notas[] = new double[2];
        double media = 0;
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + i + "º nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
            }
        media = soma / notas.length;
       

        if(media > 9 && media <= 10.0){
            System.out.print("Resultado: A ");
            System.out.println("----------------");
            System.out.println(media);
        }
        else if(media > 7.5 && media <= 9.0){
            System.out.print("Resultado: B ");
            System.out.println("----------------");
            System.out.println(media);
        }
        else if(media > 6.0 && media <=7.5){
            System.out.print("Resultado: C ");
            System.out.println("----------------");
            System.out.println(media);
        }
        else if(media > 4.0 && media <= 6.0){
            System.out.print("Resultado: D ");
            System.out.println("----------------");
            System.out.println(media);
        }
        else if(media > 0 && media <= 4.0){
            System.out.print("Resultado: E ");
            System.out.println("----------------");
            System.out.println(media);
        }

        return "";

    }
    public static void main(String[] args) {
        Media();
    }

}
