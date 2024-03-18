import java.util.Scanner;

public class IguaID {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite  o primeiro numero:");
    int A = scanner.nextInt();

    System.out.println("Digite o segundo numero:");
    int B = scanner.nextInt();

    if(A == B){
        System.out.println("Os numeros sao iguais. ");

    }else{
        System.out.println("Os numeros sao diferenciais.");

        int maior = (A > B) ? A : B;
        System.out.println("O maior numero e: " + maior);

    }

    scanner.close();
}

}