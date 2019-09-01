import javax.swing.*;

public class Exercicio02 {
    public static void main(String[] args) {
        char opcao;
        int i, posicao;
        String lt;
        String frase = "I like Java";

        JOptionPane.showMessageDialog(null, frase);

        do {
            lt = JOptionPane.showInputDialog("Informe a posição: ");
            posicao = Integer.parseInt(lt);
            for (i=0; i<frase.length(); i++) {
                if (i == posicao) {
                    JOptionPane.showMessageDialog(null, "Letra: " + frase.charAt(i));
                }
            }

            lt = JOptionPane.showInputDialog("Deseja continuar? (S/N)");
            opcao = lt.charAt(0);

        } while (opcao != 'n');
    }
}
