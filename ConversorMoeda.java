import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        double taxaDolar = 5.17;
        double taxaEuro = 5.60;
        double taxaPesoArgentino = 0.05;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em reais (R$):");
        double valorEmReais = scanner.nextDouble();

        double valorEmDolar = valorEmReais / taxaDolar;
        double valorEmEuro = valorEmReais / taxaEuro;
        double valorEmPesoArgentino = valorEmReais / taxaPesoArgentino;

        System.out.println("Valor em dolar: $" + valorEmDolar);
        System.out.println("Valor em euro: €" + valorEmEuro);
        System.out.println("Valor em peso argentino: $" + valorEmPesoArgentino);

        scanner.close();
    }
}
