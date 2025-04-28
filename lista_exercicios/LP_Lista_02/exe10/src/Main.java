import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a distância em milhas: ");
        double milhas = sc.nextDouble();
        double km = milhas * 1.60934;
        System.out.println("Distância em km: " + km);
    }
}
