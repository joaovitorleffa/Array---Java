import javax.swing.*;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        String palavra, novaPlavra = "";
        int i;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe uma palavra: ");
        palavra = leitura.next();

        for (i = palavra.length() - 1; i >= 0; i--) {
            novaPlavra += palavra.charAt(i);
        }

        JOptionPane.showMessageDialog(null, novaPlavra);

        if (palavra.equals(novaPlavra)) {
            JOptionPane.showMessageDialog(null, "Palíndromo");
        } else {
            JOptionPane.showMessageDialog(null, "Não é um Palíndromo");
        }

    }
}

