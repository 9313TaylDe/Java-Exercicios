package operadores;

public class Logicos {

    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        System.out.println("Operadores lógicos são");
        boolean ee = (a == 3) && (b == 5);
        System.out.println("Operador de &&  AND, será verdadeiro somente se ambos forem verdadeiros "+ee);

        boolean or = (a == 3) || (a <= 3) || (b == 5);
        System.out.println("Operador de ||  OR, será falso se ambos forem falsos "+ or);

        boolean xor = (a == 3) ^ (b == 5);
        System.out.println("Operador de XOR ou or exclusivo, que só será falso se ambos forem falsos ou verdadeiros "+xor);

        boolean not = !(a == 3) && (b == 5);
        System.out.println("Operador de NOT, inverterá a lógica ou seja, se for verdadeira inverterá e será falso "+ not);
    }

}
