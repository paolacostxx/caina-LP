import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a velocidade em m/s: ");
        double ms = sc.nextDouble();
        double kmh = ms * 3.6;
        System.out.println("Velocidade em km/h: " + kmh);
    }
}
