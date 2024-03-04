import java.util.Scanner;

public class ComparadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        int menor, maior;
        if (numero1 < numero2) {
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }

        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
