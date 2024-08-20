import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        int numero;
        int quantidade = 0;
        int i = 0;
        char resposta = 'S';
        List<Integer>  pares = new ArrayList<>();
        List<Integer>  impares = new ArrayList<>();
        
        while(resposta == 'S' || resposta == 's'){
            
            quantidade++;

            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            
            if (numero % 2 == 0) {
                
                pares.add(numero);
                
            } else {
                
                impares.add(numero);
                
            }

        
            System.out.println("Deseja continuar? (S - Sim / N - Não)");
            resposta = sc.next().charAt(0);
        }
        
        System.out.println("TOTAL DE NÚMEROS PARES: " + pares.size());

        for(; i < pares.size(); i++){

            System.out.println(pares.get(i));

        }

        i = 0;

        System.out.println("TOTAL DE NÚMEROS IMPARES: " + impares.size());

        for(; i < impares.size(); i++){

            System.out.println(impares.get(i));

        }

        sc.close();

    }
}
