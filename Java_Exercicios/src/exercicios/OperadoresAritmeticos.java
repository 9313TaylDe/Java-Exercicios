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
        System.out.printf("\nSubtração de %d + %d = %d",num1,num2,subtracao);
        System.out.printf("\nMultiplicação de %d + %d = %d",num1,num2,multiplicacao);
        System.out.printf("\nDivisão de %d / %d = %.2f",num1,num2,divisao);
      
        //System.out.printf("Soma de %d + %d = %d");
    }

}
