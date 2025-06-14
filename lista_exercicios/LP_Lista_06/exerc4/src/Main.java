import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();

        if (isPalindromo(texto)) {
            System.out.println("\"" + texto + "\" é um palíndromo!");
        } else {
            System.out.println("\"" + texto + "\" não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean isPalindromo(String texto) {
        String textoLimpo = texto.replaceAll("\\s+", "").toLowerCase();

        int inicio = 0;
        int fim = textoLimpo.length() - 1;

        while (inicio < fim) {
            if (textoLimpo.charAt(inicio) != textoLimpo.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}
