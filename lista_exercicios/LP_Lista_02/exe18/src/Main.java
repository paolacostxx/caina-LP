import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.println("A solução da equação é: x = " + x);
        } else {
            System.out.println("A equação não é do 1º grau ou não tem solução.");
        }
    }
}
