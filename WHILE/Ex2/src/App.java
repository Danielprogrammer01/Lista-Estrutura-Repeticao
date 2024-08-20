import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        int codigo;
       int a = 0;
       int b = 0;
       int c = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("bem vindo ao posto wano");
            System.out.println(
                    "para participar da nossa pesquisa basta apenas digitar o codigo de acordo com o seu tipo de combustivel");
            System.out.println("1 = alcool");
            System.out.println("2 = gasolina");
            System.out.println("3 = disel");
            System.out.println("digite 4 para encerrar:");
            codigo = sc.nextInt();
            clearConsole();
            if (codigo == 1) {
                a++;
            }
    
            if (codigo == 2) {
                b++;
            }
    
            if (codigo == 3) {
                c++;
            }
        } while (codigo != 4);


       System.out.println("muito obrigado");
       System.out.println("quantidade votada");
       System.out.printf("alcool: %d %n", a);
       System.out.printf("gasolina: %d %n", b);
       System.out.printf("disel: %d", c);

        sc.close();
    }
}
