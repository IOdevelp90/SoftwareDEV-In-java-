import java.util.Scanner;



public class NumTT {

    public static void main(String[] args){

   
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor de A");
    int A = scanner.nextInt();

    System.out.println("Digite o valor de B");
    int B = scanner.nextInt();

    System.out.println("Valores originais:");
    System.out.println("A = " + A);
    System.out.println("B = " + B);



    int temp = A;
    A = B;
    B = temp;

    System.out.println("Valores trocados:");
    System.out.println ("A = " + A);
    System.out.println ("B =" + B);


    scanner.close();
}
    }


