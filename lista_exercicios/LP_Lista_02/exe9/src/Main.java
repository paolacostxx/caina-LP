import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a distância em km: ");
        double km = sc.nextDouble();
        double milhas = km / 1.60934;
        System.out.println("Distância em milhas: " + milhas);
    }
}
