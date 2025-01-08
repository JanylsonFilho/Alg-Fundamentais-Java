import java.util.Scanner;

public class Exemplo {
    public static void main  (String args[]) {
        Scanner dado;
        dado = new Scanner (System.in);

        System.out.print("Valor da variavel A : ");
      int a = dado.nextInt();
        System.out.print("Valor da variavel B : ");
        int b = dado.nextInt();
        int aux;

        aux = a;
        a = b;
        b = aux;

       System.out.println("Novo valor da variável A: " + a);
        System.out.println("Novo valor da variável B: " + b);
    }
}
