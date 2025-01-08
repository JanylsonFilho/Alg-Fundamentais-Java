import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner dado=new Scanner(System.in);
        System.out.println("Numero de termos: ");
        int n = dado.nextInt();

        int a = 0;
        int  b = 1;
        int  i = 2;
        int  c;

        if (n == 1) {
            System.out.print(a);
        } else {
            System.out.print(a + " " + b);
        }

        while (i < n) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            i++;
        }
    }}