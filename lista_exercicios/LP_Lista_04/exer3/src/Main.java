import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner im = new Scanner(System.in);

             for(int i = 0; i <200; i++){
                 if(i % 4 == 0){ // % é usado pra verificar se é divisível
                     System.out.print(i + ", ");
                 }
             }
        }
    }
