import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a velocidade inicial (v0): ");
        double v0 = sc.nextDouble();
        System.out.print("Digite a aceleração: ");
        double a = sc.nextDouble();
        System.out.print("Digite o tempo: ");
        double t = sc.nextDouble();
        double v = v0 + a * t;
        System.out.println("Velocidade final: " + v);
    }
}
