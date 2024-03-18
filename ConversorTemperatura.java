import java.util.Scanner;

public class ConversorTemperatura{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahreinheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em Fahreinheit e: " + fahreinheit);

        scanner.close();
    }
}