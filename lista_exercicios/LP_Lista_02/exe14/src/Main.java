import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);
    }
}
