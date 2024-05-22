package exercicios;

import java.util.Scanner;

public class VogalOuConsoante {

    public static void VogalOuConsoante(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a letra: ");
        String letra = sc.next();
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("é uma vogal sim!");
        }
        else if(letra.length() > 1){
            System.out.println("Digite apenas uma letra, e não uma palavra");
        }
        else {
            System.out.println("É  uma consoante");
        }

        //USANDO O SWITCH CASE
        /*
         *   if(letra != null) {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":System.out.println("é uma vogal");  
                    break;
            
                default:System.out.println("Não é uma vogal");
                    break;
            }
        }
         * 
         */
      
    }
    public static void main(String[] args) {
        VogalOuConsoante();
    }

}
