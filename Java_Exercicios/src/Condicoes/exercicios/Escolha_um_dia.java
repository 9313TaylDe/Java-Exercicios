package Condicoes.exercicios;

import java.util.Scanner;

public class Escolha_um_dia {
    public static void Dia_da_semana(){
        Scanner  sc = new Scanner(System.in);

        System.out.print("Digite um numero e veja o dia da semana: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1: System.out.print("Domingo");
            break;
            case 2: System.out.print("Segunda-feira");
            break;
            case 3: System.out.print("Terça-feira");
            break;
            case 4: System.out.print("Quarta-feira");
            break;
            case 5: System.out.print("Quinta-feira");
            break;
            case 6: System.out.print("Sexta-feira");
            break;
            case 7: System.out.print("Sabádo");
            break;
        
            default: System.out.print("Dia inválido");
                break;
        }
    }
    public static void main(String[] args) {
        Dia_da_semana();
    }

}
