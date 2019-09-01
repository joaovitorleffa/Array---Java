import javax.swing.*;
import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        String[] mesesDoAno = new String[12];
        int i;

        for (i=0; i<mesesDoAno.length; i++) {
            if (i == 0) {
                mesesDoAno[i] = "Janeiro";
            } else if (i == 1) {
                mesesDoAno[i] = "Fevereiro";
            } else if (i == 2) {
                mesesDoAno[i] = "Março";
            } else if (i == 3) {
                mesesDoAno[i] = "Abril";
            } else if (i == 4) {
                mesesDoAno[i] = "Maio";
            } else if (i == 5) {
                mesesDoAno[i] = "Junho";
            } else if (i == 6) {
                mesesDoAno[i] = "Julho";
            } else if (i == 7) {
                mesesDoAno[i] = "Agosto";
            } else if (i == 8) {
                mesesDoAno[i] = "Setembro";
            } else if (i == 9) {
                mesesDoAno[i] = "Outubro";
            } else if (i == 10) {
                mesesDoAno[i] = "Novembro";
            } else {
                mesesDoAno[i] = "Dezembro";
            }
        }

        int gerador = (int) (Math.random() * 12);
        JOptionPane.showMessageDialog(null, "Mês sorteado: " + (gerador + 1));


        for (i=0; i<mesesDoAno.length; i++) {
            if (i == gerador) {
                JOptionPane.showMessageDialog(null, "Mês: " + mesesDoAno[i]);
            }
        }
    }
}
