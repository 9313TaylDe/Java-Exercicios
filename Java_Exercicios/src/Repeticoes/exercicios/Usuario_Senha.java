package Repeticoes.exercicios;

import java.util.Scanner;

public class Usuario_Senha {

    public static void User() {
        Scanner sc = new Scanner(System.in);

        boolean usuarioAtivo = false;

        while (!usuarioAtivo) {
            System.out.print("USUÁRIO: ");
            String usuario = sc.next();

            System.out.print("SENHA: ");
            String senha = sc.next();

            String valida_user = usuario;
            String valida_senha = senha;
            if (!usuario.equalsIgnoreCase(valida_user) && !senha.equalsIgnoreCase(valida_senha)) {
                System.out.flush();
                System.out.println("\nUsuario e senha incorretos");
            } else if (usuario.equals(senha)) {
                System.out.flush();
                System.out.println("\nSenha não poe ser igual ao usuario!");
            } else {
                System.out.flush();
                System.out.print("\nLogin bem sucedido");
                break;

            }
        }

    }

    public static void main(String[] args) {
        User();
    }

}
