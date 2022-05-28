import java.util.Scanner;


public class Maior_Media {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        //var
        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        // processamento e dados
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;
            count = count + 1;
        } while(count < 5);
        System.out.println("A media e: " + soma/5);
        System.out.println("O maior numero e: " + maior);
    }
}
