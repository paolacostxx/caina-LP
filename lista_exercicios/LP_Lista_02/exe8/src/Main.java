import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a medida em polegadas: ");
        double polegadas = sc.nextDouble();
        double mm = polegadas * 25.4;
        System.out.println("Medida em milímetros: " + mm);
    }
}
