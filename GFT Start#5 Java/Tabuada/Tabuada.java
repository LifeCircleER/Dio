import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //var
        int tabuada;

        //processamento e dados
        System.out.println("Tabuada: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for(int i = 1; i<=10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }


    }
}