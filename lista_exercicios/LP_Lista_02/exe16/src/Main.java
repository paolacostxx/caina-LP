import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        double volume = (1.0 / 3) * Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("Volume do cone: " + volume);
    }
}
