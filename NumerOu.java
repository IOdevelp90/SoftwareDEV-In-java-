import java.util.Scanner;

public class NumerOu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println("Numero maior do que 10");

        } else {

            System.out.println("Numero menor ou igual a 10!");

        }

        scanner.close();
    }
}