import java.util.Scanner;

public class WhileNota {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nota;

    System.out.println("nota: ");
    nota = scan.nextInt();

    while (nota >= 1 | nota <= 10) {
        System.out.println("Sua nota e " + nota);
        if (nota < 0 | nota > 10) {
            System.out.println("Nota invalida, repita a operacao digitando numeros entre 1 a 10");
        }
        break;
    }
  }
}