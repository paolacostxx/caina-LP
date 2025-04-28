
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1,n2, media;

        Scanner in = new Scanner(System.in);
        System.out.println("digite o primeiro número: ");
        n1= in.nextDouble();

        System.out.println("digite o segundo número: ");
        n2= in.nextDouble();

        media = (n1+n2)/2;
        System.out.println("Média: "+media);


        if(media>50){
            System.out.println("Aprovado");

        }else{
            System.out.println("Reprovado");
        }
    }
}