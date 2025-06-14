public class Main {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Imprimir em ordem inversa
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}