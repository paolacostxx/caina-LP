import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de linhas da primeira matriz: ");
        int linhasA = scanner.nextInt();
        System.out.print("Número de colunas da primeira matriz: ");
        int colunasA = scanner.nextInt();

        System.out.print("Número de linhas da segunda matriz: ");
        int linhasB = scanner.nextInt();
        System.out.print("Número de colunas da segunda matriz: ");
        int colunasB = scanner.nextInt();

        if (colunasA != linhasB) {
            System.out.println("Multiplicação não é possível: colunas da primeira matriz diferente de linhas da segunda.");
            scanner.close();
            return;
        }

        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];

        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        int[][] produto = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                produto[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    produto[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matriz produto:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}