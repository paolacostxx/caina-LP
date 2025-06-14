import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor da compra: ");
        double valorCompra = sc.nextDouble();

        System.out.println("----------------------------------");
        System.out.println("Menu:");
        System.out.println("  1. Débito");
        System.out.println("  2. Pix");
        System.out.println("  3. Crédito");
        System.out.println("----------------------------------");

        System.out.print("Escolha a forma de pagamento: ");
        int opcao = sc.nextInt();
        System.out.println("----------------------------------");

        if (opcao == 1) {
            System.out.println("Débito selecionado");
            double valorFinal = valorCompra - (valorCompra * 0.05);
            System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);

        } else if (opcao == 2) {
            System.out.println("Pix selecionado");
            double valorFinal = valorCompra - (valorCompra * 0.10);
            System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);

        } else if (opcao == 3) {
            System.out.println("Crédito selecionado");
            System.out.println("----------------------------------");

            System.out.print("Escolha o número de parcelas (até 10x): ");
            int parcelas = sc.nextInt();

            if (parcelas >= 1 && parcelas <= 10) {
                double valorFinal;

                if (parcelas <= 4) {
                    valorFinal = valorCompra + (valorCompra * 0.02);
                } else {
                    valorFinal = valorCompra + (valorCompra * 0.05);
                }

                System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);
                System.out.printf("Em %d parcelas de R$ %.2f%n", parcelas, (valorFinal / parcelas));

            } else {
                System.out.println("Número de parcelas inválido.");
            }

        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}