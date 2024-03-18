import java.util.Scanner;

public class OperacoesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        System.out.println("Soma: " + soma);

        double subtracao = numero1 - numero2;
        System.out.println("subtracao:" + subtracao);

        double multiplicacao = numero1 * numero2;
        System.out.println("multiplicacao" + multiplicacao);

        if (numero2 != 0) {

            double divisao = numero1 / numero2;
            System.out.println("Divisao:" + divisao);
        } else {
            System.out.println("Nao e possivel dividir por zero.");

        }
        scanner.close();
    }
}
