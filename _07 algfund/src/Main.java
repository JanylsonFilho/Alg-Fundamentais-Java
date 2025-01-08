import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado ;
        dado = new Scanner(System.in);
        System.out.println("Numero inteiro positivo: ");
        int n =dado.nextInt();

        int invertido = 0;
        int d;

        while (n > 0) {
            d = n % 10;
            invertido = invertido * 10 + d;
            n = (int)n / 10;
        }

        System.out.println("Número invertido: " + invertido);
    }}