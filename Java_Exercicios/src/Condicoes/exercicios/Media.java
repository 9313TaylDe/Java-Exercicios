package Condicoes.exercicios;

import java.util.Scanner;

public class Media {
    public static void Media(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota + nota2)/2;

        if(media == 10.0){
            System.out.print("Aprovado com distinção!");
        }else if(media >= 7.0){
            System.out.print("Aprovado!");
        }else {
            System.out.print("Reprovado");
        }

    }
    public static void main(String[] args) {
        Media();
    }
}
