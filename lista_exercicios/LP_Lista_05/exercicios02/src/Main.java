public class Main {
    public static void main(String[] args) {

        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = vetor[i] + 2; // índice par
            } else {
                vetor[i] = vetor[i] * 2; // índice ímpar
            }
        }

        // Imprime o vetor alterado
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}