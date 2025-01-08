import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Numero: ");
        int  n = entrada.nextInt();
        int  fator = 1;

        for (int i = 1; i <= n; i++) {
            fator = i * fator;
        }

        System.out.println("Fatorial = " + fator);

    }}