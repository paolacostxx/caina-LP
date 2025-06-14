import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Informe quantos termos de Fibonacci deseja exibir: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Por favor, informe um número maior que zero.");
        } else {
            System.out.println("Sequência de Fibonacci com " + num + " termos:");

            int primeiro = 0;
            int segundo = 1;

            for (int i = 1; i <= num; i++) {
                System.out.print(primeiro + " ");

                int prox = primeiro + segundo;
                primeiro = segundo;
                segundo = prox;
            }
        }

        sc.close();
    }
}