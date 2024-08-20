import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite um numero");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i %2 == 1) {
            System.out.printf("%d %n", i);
            }
        }


        sc.close();
    }
}
