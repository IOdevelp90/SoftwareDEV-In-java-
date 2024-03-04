import java.util.Scanner;

public class CalcularaAreaRetangulo {
    public static void main(string[] args) {
        Scanner scanner = new Scanner(system.in);

        system.out.println("Digite a  altura do retangulo:");
        double altura = scanner.nextDouble();

        system.out.println("Digite a largura do retangulo:");
        double largura = scanner.nextDouble();

        double area = CalcularaAreaRetangulo(altura, largura);

        system.out.println("a area do triangulo e: + area");

        scanner.close();
    }

    public static double CalcularaAreaRetangulo(double altura, double largura) {
        return altura + largura;
    }
}