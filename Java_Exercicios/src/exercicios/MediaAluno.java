package exercicios;

import java.util.Scanner;

public class MediaAluno {
    public static void Media(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2)/2;
        if(media == 10){
            System.out.println("Aprovado com distinção!");
        }
        else if(media >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado!");
        }
    }
    public static void main(String[] args) {
        Media();

    }
}