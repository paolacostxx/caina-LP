import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.print("Digite o primeiro numero: ");
        double numero1 = teclado.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = teclado.nextDouble();


        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("  1. Soma");
        System.out.println("  2. Subtracao");
        System.out.println("  3. Multiplicacao");
        System.out.println("  4. Divisao");
        System.out.println("------------------------------");


        System.out.print("Escolha uma opcao: ");
        int opcao = teclado.nextInt();

        System.out.println("------------------------------");

        if (opcao == 1) {
            double resultado = numero1 + numero2;
            System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);
        } else if (opcao == 2) {
            double resultado = numero1 - numero2;
            System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + resultado);
        } else if (opcao == 3) {
            double resultado = numero1 * numero2;
            System.out.println("Resultado: " + numero1 + " x " + numero2 + " = " + resultado);
        } else if (opcao == 4) {
            if (numero2 != 0) {
                double resultado = numero1 / numero2;
                System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
            } else {
                System.out.println("Erro: nao existe divisao por zero.");
            }
        } else {
            System.out.println("Opção inválida.");
        }

        // Fechar o Scanner
        teclado.close();
    }
}
