
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        float totalMedia = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Aluno " + i + ":");
            
            System.out.print("Digite a primeira nota: ");
            float nota1 = sc.nextFloat();
            
            System.out.print("Digite a segunda nota: ");
            float nota2 = sc.nextFloat();
            
            float media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);
            
            if (media >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }

            totalMedia += media;
        }

        float mediaGeral = totalMedia / 3;
        System.out.println("\nMédia Geral da Turma: " + mediaGeral);

        sc.close();
    }
}
