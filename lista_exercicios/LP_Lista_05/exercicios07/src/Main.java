import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        // Ler matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Soma das linhas
        int maiorSomaLinha = Integer.MIN_VALUE;
        int linhaMaiorSoma = -1;
        for (int i = 0; i < 5; i++) {
            int soma = 0;
            for (int j = 0; j < 5; j++) {
                soma += matriz[i][j];
            }
            if (soma > maiorSomaLinha) {
                maiorSomaLinha = soma;
                linhaMaiorSoma = i;
            }
        }

        // Soma das colunas
        int maiorSomaColuna = Integer.MIN_VALUE;
        int colunaMaiorSoma = -1;
        for (int j = 0; j < 5; j++) {
            int soma = 0;
            for (int i = 0; i < 5; i++) {
                soma += matriz[i][j];
            }
            if (soma > maiorSomaColuna) {
                maiorSomaColuna = soma;
                colunaMaiorSoma = j;
            }
        }

        System.out.println("Maior soma de linha: " + maiorSomaLinha + " na linha " + linhaMaiorSoma);
        System.out.println("Maior soma de coluna: " + maiorSomaColuna + " na coluna " + colunaMaiorSoma);

        scanner.close();
    }
}