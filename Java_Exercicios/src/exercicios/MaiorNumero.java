package exercicios;
import java.util.Scanner;
public class MaiorNumero {
    

    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       System.out.println("Digite: ");
       int num1 = sc.nextInt();
       System.out.println("Digite novamente: ");
       int num2 = sc.nextInt();

       if(num1 > num2){
        System.out.println("Primeiro é maior");
       } else if(num2 > num1){
        System.out.println("Segundo número é maior");
       } else if( num1 ==  num2){
        System.out.println("Os núeros são iguais");
       }
       
    }

}
