import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        number = in.nextInt();
        for (int i= 0 ; i<=10; i++){
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}
