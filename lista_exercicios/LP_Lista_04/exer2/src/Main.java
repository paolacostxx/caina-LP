import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number;
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            number = in.nextInt();
            if(i == 0){
                maior = number;
                menor = number;
            }else{
                if(number> maior) {
                    maior = number;
                }
                if(number < menor){
                    menor = number;
                }
            }
        }
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        in.close();
    }
}