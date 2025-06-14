import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int cont = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }

        sc.close();
    }
}