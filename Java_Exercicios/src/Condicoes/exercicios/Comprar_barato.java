package Condicoes.exercicios;

import java.util.Scanner;

public class Comprar_barato {

    public  static void Comprar(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        double preco = sc.nextDouble();
        System.out.print("Digite o preço do segundo produto: ");
        double preco2 = sc.nextDouble();
        System.out.print("Digite o preço do terceiro produto: ");
        double preco3 = sc.nextDouble();

        if(preco <= preco2 && preco <= preco3){
            System.out.printf("O preço %.1f é mais barato", preco);
        }
        else if(preco2 <= preco && preco2 <= preco3){
            System.out.printf("O preço %.1f é mais barato", preco2);
        }
        else if(preco3 <= preco && preco3 <= preco2){
            System.out.printf("O preço %.1f é mais barato", preco3);
        }
    }

    public static void main(String[] args) {
        Comprar();
        
    }

}
