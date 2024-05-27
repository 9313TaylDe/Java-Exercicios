package Condicoes.exercicios;

import java.util.Scanner;

public class VerificaSexo {

    public static void Verificando_Sexo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu sexo: ");
        String sexo = sc.next();

        if(sexo.equalsIgnoreCase("feminino")){
            System.out.printf("Você é do sexo %s",sexo);
        }else if(sexo.equalsIgnoreCase("masculino")){
            System.out.printf("Você é do sexo %s",sexo);
        }else {
            System.out.print("Sexo inválido");
        }
    }
    public static void main(String[] args) {
        
    Verificando_Sexo();
    }
}
