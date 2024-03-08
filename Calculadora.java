import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operator;

        System.out.println("Digite o primeiro numero:");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero :");
        num2 = scanner.nextDouble();

        System.out.println("Escolha a operacao (+,-,*,/):");
        operator = scanner.next().charAt(0);

        double resultado = 0;

        switch (operator) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisao por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operacao invalida.");
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
