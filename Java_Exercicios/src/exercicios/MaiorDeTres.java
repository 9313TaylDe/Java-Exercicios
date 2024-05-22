package exercicios;

import java.util.Scanner;

public class MaiorDeTres {

    public static void Maior(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número : ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        if(n1 >= n2 && n1 >= n3 ){
            System.out.println("O primeiro número digitado é o maior");
        }
        else if(n2 >= n1 && n2 >= n3){
            System.out.println("O segundo númeor digitado é o maior");
        }else if(n3 >= n1 && n3 >= n2){
            System.out.println("O terceiro numero digitado é o maior");
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.printf("Os números digitados são \n1º%d \n2º%d \n3º%d",n1,n2,n3);

    }
        public static void main(String[] args) {
        Maior();
    }

}
