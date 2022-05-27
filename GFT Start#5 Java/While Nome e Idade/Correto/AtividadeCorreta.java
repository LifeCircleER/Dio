import java.util.Scanner;

public class AtividadeCorreta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //instanciar objeto

        //variaveis
        String nome;
        int idade;

        //Processamento e Dados
        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
            System.out.println("Seu nome e " + nome + " e voce tem " + idade);
            }
        System.out.println("Você digitou 0, Fim do Código");
        }
    }
