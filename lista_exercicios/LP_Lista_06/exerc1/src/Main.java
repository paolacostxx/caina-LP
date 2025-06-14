import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 1: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Erro: n deve ser maior que 1");
            return;  // Sai do programa
        }

        int resultado = soma(n);
        System.out.println("A soma de 1 até " + n + " é: " + resultado);

        scanner.close();
    }

    public static int soma(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
}
