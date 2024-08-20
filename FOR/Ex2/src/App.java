import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        char resposta = 'S';
        int n = 0;
        List<Integer> in =  new ArrayList<>();
        List<Integer> out =  new ArrayList<>();

        while (resposta == 'S' || resposta == 's') {
            
            System.out.println("Digite um número");
            n = sc.nextInt();

            if ( n >= 10 && n <= 20) {
                
                in.add(n);

            } else {

                out.add(n);
                
            }

            System.out.println("Deseja continuar? (S - SIM / N - NÃO)");
            resposta = sc.next().charAt(0);
        }

    
        System.out.println(in.size() + " in");
            
        System.out.println(out.size() + " out");
        
        
    }
}
