package exercicios;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 1;
        
        int soma = num1 + num2;
        int subtracao =  num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        num1 =  num1 - 1;

        System.out.printf("Soma de %d + %d = %d", num1, num2, soma);
        System.out.printf("Subtração de %d + %d = %d",num1,num2,subtracao);
        System.out.printf("Multiplicação de %d + %d = %d",num1,num2,multiplicacao);
        System.out.printf("Divisão de %d + %d = %d",num1,num2,divisao);
        System.out.printf("Decremento de %d",num1);
        //System.out.printf("Soma de %d + %d = %d");
    }

}
