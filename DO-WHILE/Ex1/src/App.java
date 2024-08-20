import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Hello, World!");

        int numero;

        do {

            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            
        } while (numero < 1 || numero > 5);

        System.out.println("Programa encerrado. ");
        
    }
}
