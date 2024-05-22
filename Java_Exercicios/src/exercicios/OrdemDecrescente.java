package exercicios;

import java.util.Scanner;

public class OrdemDecrescente {
    public static void Decrescente(){
        Scanner sc = new Scanner(System.in);

        int num = 0;

        for(int i = 0; i < 3; i ++){
            System.out.println("Digite um número: ");
            num = sc.nextInt();
        }

        for (int i = 0; i > 3; --i) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Decrescente();
    }
}
