import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada dos coeficientes
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

        // Verifica se é equação do 2º grau
        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else {
            // Calcula o delta
            double delta = Math.pow(b, 2) - 4 * a * c;

            System.out.println("Delta: " + delta);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("A equação possui uma raiz real: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("A equação possui duas raízes reais:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
