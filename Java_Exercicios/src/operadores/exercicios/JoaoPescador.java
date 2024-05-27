package Operadores.exercicios;

import java.util.Scanner;

public class JoaoPescador {

    public static double PesandoPeixes(){
        Scanner sc =  new Scanner(System.in);

        String nome = "João";
        int pesoMax = 50;
        double pesoPeixes = 0.0;

        System.out.print("Digite o peso dos peixes: ");
        pesoPeixes = sc.nextDouble();
        double multaFixa = 4.00;
        double pesando = (pesoPeixes - pesoMax);
        double multa = pesando * multaFixa;
        if(pesoPeixes <= pesoMax){
            System.out.printf("Sr %s, o peso não excede o peso max, portanto não precisará pagar a multa:  R$0,0.", nome);
        }else if(pesoPeixes > 50){
            System.out.printf("Sr %s,o peso excede o limite de peso max, portanto o sr deverá pagar o valor de R$%.2f de multa.",nome, multa);
        }
        return 0.0;
    }

    

    
public static void main(String[] args) {
    PesandoPeixes();
}

}
