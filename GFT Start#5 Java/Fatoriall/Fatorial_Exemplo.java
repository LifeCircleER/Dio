import java.util.Scanner;

public class Fatorial_Exemplo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int fatorial;
        int multiplicacao = 1;

        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();

        System.out.print(fatorial +"! = ");
        for(int i = fatorial; i >= 1; i --) {
             multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }
}
