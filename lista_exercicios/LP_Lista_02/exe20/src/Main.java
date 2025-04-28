import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada das raízes
        System.out.print("Digite a primeira raiz (x1): ");
        double x1 = sc.nextDouble();

        System.out.print("Digite a segunda raiz (x2): ");
        double x2 = sc.nextDouble();

        // Considerando a = 1
        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;

        System.out.println("\nA equação do segundo grau é:");
        System.out.printf("f(x) = %.1fx² + %.1fx + %.1f\n", a, b, c);
    }
}
