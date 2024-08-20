
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("digite um número positivo");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                System.out.printf("%d  %n", i);
            }
        }
        System.out.printf("%d %n", n);
        sc.close();
    }
}
