import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {5, 8, 2, 9, 1, 3, 7, 4, 6, 0};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                posicao = i;
                break;
            }
        }

        if (posicao == -1) {
            System.out.println("Valor não encontrado");
        } else {
            System.out.println("Valor encontrado na posição: " + posicao);
        }

        scanner.close();
    }
}