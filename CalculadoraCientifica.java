import java.util.Scanner;

public class CalculadoraCientifica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operator;

        System.out.println("Digite o primeiro número:");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        num2 = scanner.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /, ^, s - seno, c - cosseno, t - tangente, l - logaritmo):");
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
                    System.out.println("Erro: divisão por zero.");
                    scanner.close();
                    return;
                }
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                break;
            case 's':
                resultado = Math.sin(num1);
                break;
            case 'c':
                resultado = Math.cos(num1);
                break;
            case 't':
                resultado = Math.tan(num1);
                break;
            case 'l':
                resultado = Math.log(num1);
                break;
            default:
                System.out.println("Operação inválida.");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
