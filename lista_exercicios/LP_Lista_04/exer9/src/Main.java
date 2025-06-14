import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jogar;

        do {
            boolean perdeu = false;

            System.out.println("===== JOGO DA TABUADA =====");
            System.out.println("Responda todas as operações.");
            System.out.println("Se errar, o jogo acaba.");
            System.out.println("============================\n");

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(i + " x " + j + " = ");
                    int resposta = sc.nextInt();

                    if (resposta == (i * j)) {
                        System.out.println("Correto!\n");
                    } else {
                        System.out.println("\nErrou! O resultado era " + (i * j));
                        System.out.println("Você perdeu!");
                        perdeu = true;
                        break;
                    }
                }
                if (perdeu) {
                    break;
                }
            }
            if (!perdeu) {
                System.out.println("======================================");
                System.out.println("Parabéns! Você completou a tabuada!!");
                System.out.println("======================================");
            }

            System.out.print("\nDeseja jogar novamente? (S/N): ");
            jogar = sc.next();

        } while (jogar.equalsIgnoreCase("S"));

        System.out.println("\nFim do jogo. Até mais!");
        sc.close();
    }
}