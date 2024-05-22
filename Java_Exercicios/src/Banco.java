import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Saque(100, 50);
    
    }

    public static double Saque(double saldo, double valor) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Digite o valor do saque: ");
        valor = sc.nextDouble();

        double novo_saldo = 0;
        if(valor <= saldo) {
            System.out.println("Saque realizado com sucesso");
            novo_saldo = saldo -= valor;
        }else if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }
        System.out.printf("O seu saldo atual é: R$%.2f", novo_saldo);
        return novo_saldo;
    }

}
