package exercicios;

import java.util.Scanner;

public class ComprarBarato {
    public static void Comprar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro produto: ");
        double produto1 = sc.nextDouble();
        System.out.println("Digite o valor do segundo produto: ");
        double produto2 = sc.nextDouble();
        System.out.println("Digite o valor do terceiro produto: ");
        double produto3 = sc.nextDouble();

        if(produto1 <+ produto2 || produto1 <= produto3){
            System.out.printf("Primeiro produto com preço acessível: R$%.2f", produto1);
        }

        else if(produto2 <+ produto2 || produto2 <= produto3){
            System.out.printf("Segundo produto com preço acessível: R$%.2f", produto2);
        }

        else if(produto3 <+ produto1 || produto3 <= produto2){
            System.out.printf("Terceiro produto com preço acessível: R$%.2f", produto3);
        }
    }
    public static void main(String[] args) {
     Comprar();   
    }

}
