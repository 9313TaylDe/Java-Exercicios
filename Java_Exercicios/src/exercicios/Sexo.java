package exercicios;

import java.util.Scanner;

public class Sexo {

    public static void SEXO(){
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu sexo: ");
        String sexo = sc.next();

        if(sexo != null){
            switch (sexo) {
                case "f":
                case "F":System.out.println("Feminino");
                    break;
                case "m":
                case "M":System.out.println("Masculino");
                    break;
            
                default:System.out.println("Sexo inválido");
                    break;
            }
        }
        System.out.println("Digite F ou M");
    }
    public static void main(String[] args) {
        SEXO();
    }
}
