import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota N1 (peso 1): ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a nota N2 (peso 2): ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2 * 2) / 3;
        System.out.println("Média ponderada: " + media);
    }
}
