import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");

        int num = sc.nextInt();
        String dia = "";

        if (num >= 1 && num <= 7) {
            dia = switch (num) {
                case 1 -> "Domingo";
                case 2 -> "Segunda-feira";
                case 3 -> "Terça-feira";
                case 4 -> "Quarta-feira";
                case 5 -> "Quinta-feira";
                case 6 -> "Sexta-feira";
                case 7 -> "Sábado";
                default -> dia;
            };
            System.out.println("O dia que corresponde a " + num + " é : " + dia);

        } else {
            System.out.println("Tente novamente com um número válido!");
        }
    sc.close();
    }
}
