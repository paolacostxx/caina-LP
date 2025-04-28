public class Main {
    public static void main(String[] args) {

    System.out.println("Conversão de Graus ");
    System.out.println("Celsius / Fahrenheit: ");



        for(int celsius = -80; celsius <=80; celsius+=10){
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.printf("%d°C = %.1f°F\n", celsius, fahrenheit); // pra exibir esses valores, precisa de uma string de formatação
            // %d°C = celsius // % = numeros de ponto flutuante(n é inteiro) // .1f°F: fahrenheit
        }
    }
}