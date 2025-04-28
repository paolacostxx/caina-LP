import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a medida em milímetros: ");
        double mm = sc.nextDouble();
        double polegadas = mm / 25.4;
        System.out.println("Medida em polegadas: " + polegadas);
    }
}
