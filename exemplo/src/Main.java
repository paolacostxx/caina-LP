import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name;
        int year;
        int option;

        System.out.println("Digite seu nome:");
        name = in.next();
        System.out.println("Digite o ano de nascimento:");
        year = in.nextInt();

        gerarMenu();
        System.out.println("Escolha uma opção:");
        option = in.nextInt();

        gerarSaudacao(name, year, option);

        System.out.println("Você escolheu a opção: " + option);
    }

    public static void gerarSaudacao(String name, int year, int option){
        int age = calcularIdade(year);
        System.out.println("Olá " + name + ", você tem " + age + " anos, e escolheu a opção: " + option);
    }

    public static int calcularIdade(int year){
        return 2025 - year;
    }

    public static void gerarMenu(){
        System.out.println("Menu:");
        System.out.println("1: Opção 1");
        System.out.println("2: Opção 2");
        System.out.println("3: Opção 3");
    }
}
