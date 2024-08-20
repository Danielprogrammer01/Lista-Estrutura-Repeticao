import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        int senha = 2002;

        System.out.println("Digite a senha: ");
        senha = sc.nextInt();

        do {

            if(senha != 2002){
                
                System.out.printf("%nSenha Inválida!%n"); 
                System.out.printf("%nDigite a senha novamente: ");
                senha = sc.nextInt();
            }

        } while(senha != 2002);

        System.out.printf("%nAcesso Permitido!");


    }
}
