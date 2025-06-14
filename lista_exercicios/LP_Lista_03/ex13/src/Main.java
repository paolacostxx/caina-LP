import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("  1. Círculo");
        System.out.println("  2. Triângulo Retângulo");
        System.out.println("  3. Retângulo");
        System.out.println("--------------------------");


        System.out.print("Escolha uma opção: ");
        int opc = sc.nextInt();
        System.out.println("--------------------------");

        if (opc == 1) {
            System.out.print("Informe o raio: ");
            double raio = sc.nextDouble();

            double area = Math.PI * raio * raio;
            double peri = 2 * Math.PI * raio;

            System.out.println("--------------------------");
            System.out.println("Área = " + area);
            System.out.println("Perímetro = " + peri);

        } else if (opc == 2) {
            System.out.print("Informe a base: ");
            double base = sc.nextDouble();

            System.out.print("Informe a altura: ");
            double altura = sc.nextDouble();

            double area = (base * altura) / 2;

            double hipotenusa = Math.sqrt((base * base) + (altura * altura));

            double peri = base + altura + hipotenusa;

            System.out.println("--------------------------");
            System.out.println("Área = " + area);
            System.out.println("Perímetro = " + peri);

        } else if (opc == 3) {
            System.out.print("Informe a base: ");
            double base = sc.nextDouble();

            System.out.print("Informe a altura: ");
            double altura = sc.nextDouble();

            double area = base * altura;
            double peri = 2 * (base + altura);

            System.out.println("--------------------------");
            System.out.println("Área = " + area);
            System.out.println("Perímetro = " + peri);

        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}