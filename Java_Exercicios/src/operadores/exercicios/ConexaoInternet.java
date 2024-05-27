package Operadores.exercicios;
import java.util.Scanner;

public class ConexaoInternet {
    public static String Conexao(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho do arquivo Mb: ");
        double tamanho_arquivo = sc.nextDouble();

        System.out.print("Velocidade da conexão em Mbps: ");
        double velocidade_conexao = sc.nextDouble();
        double minutos = velocidade_conexao /  60;

        double tempo_estimado = tamanho_arquivo / velocidade_conexao;

        System.out.printf("O tempo estimado do download de %.1fmb será de: %.1fs", tamanho_arquivo, tempo_estimado);
        System.out.printf("\nO tempo estimado do download de %.1fmb será de: %.1fm", tamanho_arquivo, minutos);
        
        
        return "";
    }

    public static void main(String[] args) {
        Conexao();
    }

}
