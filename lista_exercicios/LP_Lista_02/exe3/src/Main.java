import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        double numero = sc.nextDouble();
        System.out.println("A quinta parte é: " + (numero / 5));
    }
}
