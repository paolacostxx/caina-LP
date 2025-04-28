import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota N1: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a nota N2: ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println("A média é: " + media);
    }
}
