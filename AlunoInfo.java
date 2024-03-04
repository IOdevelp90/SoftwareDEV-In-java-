import java.util.Scanner;

public class AlunoInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação das informações do aluno
        System.out.println("Informe a matrícula do aluno:");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.println("Informe o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Informe a nota 1 do aluno:");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a nota 2 do aluno:");
        double nota2 = scanner.nextDouble();

        // Cálculo da nota final
        double notaFinal = (nota1 + nota2) / 2;

        // Verificação se o aluno está aprovado ou reprovado
        boolean aprovado = notaFinal >= 6;

        // Imprime o relatório
        System.out.println("\nRelatório do Aluno:");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Aprovado: (" + (aprovado ? "X" : " ") + ") Sim (" + (aprovado ? " " : "X") + ") Não");
    }
}
