import  java.util.Scanner;

public class UPO {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A:" );
        int numero = scanner.nextInt();

        switch(numero){
            case 1:  
                System.out.println("Um");
                break;
             case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println ("Tres");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;    

        default:
        
        System.out.println();

        }
        scanner.close();
    }
}
