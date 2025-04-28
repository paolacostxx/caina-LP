import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1, sqrt;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        number1 = in.nextDouble();

        if (number1 >=0){
            sqrt = Math.sqrt(number1);

            System.out.println("A raiz quadrada de " + number1 + " é: " +sqrt);

        }
        else {
            System.out.println("Não existe raiz" );
        }

    }
}