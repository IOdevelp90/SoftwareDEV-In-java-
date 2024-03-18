import java.util.Scanner;

public class NumDis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int A = scanner.nextInt();

        System.out.println("Digite o valor de B:");
        int B = scanner.nextInt();

        if (A == B) {
            System.out.println("A sequencia de numeros informada e invalida,pois os numeros sao iguais.");

        } else if (A > B) {
            System.out.println("O valor de A e maior que o valor de B");
        } else {
            System.out.println("O valor de B e maior que o valor de A");

        }
        scanner.close();
    }
}