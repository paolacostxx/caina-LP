public class Main {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10}
        };

        int[][] produto = new int[3][2];

        for (int i = 0; i < 3; i++) { // linha a
            for (int j = 0; j < 2; j++) { // coluna b
                produto[i][j] = 0;
                for (int k = 0; k < 2; k++) { // coluna a  linhas b
                    produto[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < produto.length; i++) {
            for (int j = 0; j < produto[0].length; j++) {
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }
    }
}