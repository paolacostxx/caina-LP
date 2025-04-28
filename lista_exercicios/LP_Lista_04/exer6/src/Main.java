import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = in.nextInt();

        // Descobrindo o menor e o maior
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("Números naturais entre " + menor + " e " + maior + ":");

        for (int i = menor + 1; i < maior; i++) {
            if (i >= 0) {
                System.out.println(i);
            }
        }

        in.close();
    }
}
