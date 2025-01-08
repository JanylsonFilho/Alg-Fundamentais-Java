import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        Scanner dado;
        dado= new Scanner (System.in);
        System.out.println("Insira o numero de notas: ");
        int n =dado.nextInt();
       int nota;
        int contagem = 0;
       int  i = 0;

        while (i < n) {
            i = i + 1;
            System.out.println("coloque o valor da nota: ");
            nota = dado.nextInt();

            if (nota >= 50) {
                contagem = contagem + 1;
            }
        }

       System.out.println("Número de aprovações: " + contagem);
    }
}