import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado;
        dado=new Scanner(System.in);
        System.out.println("Número inteiro decimal:");
        int n =dado.nextInt();
        int  q = n;
        int ndigit = 0;
        int  r;
        int binario[] = new int[ndigit];

        do {
            r = q % 2;
            binario = r;
            ndigit = ndigit + 1;
            q = (int)q / 2;
        } while (q != 0);

        System.out.println("Número binário: ");

        for (var i = ndigit-1; i >= 0; i--) {
            System.out.println(binario[i]);
        }

    }}