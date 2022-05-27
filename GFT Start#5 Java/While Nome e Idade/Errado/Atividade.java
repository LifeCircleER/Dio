import javax.swing.*;

public class Atividade{

    public static void main (String[] args){

//variaveis
        int n1;
        String nomeAluno ="";
        String msg ="";

//Entrada de Dados
        nomeAluno = (JOptionPane.showInputDialog("Digite seu nome"));
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));

//processamento e saída de Dados
        while (!nomeAluno.equals("") && n1 > 0) { // Não consegui interromper o código quando recebe 0, entretanto ele não finaliza a execução ao colocar números no lugar do nome
            msg = msg + "O aluno " + nomeAluno + " tem " + n1 + " anos. ";
            JOptionPane.showMessageDialog(null, msg);
            System.exit(0);
            break;
        }
    }
}
