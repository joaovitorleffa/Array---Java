import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double[] notas = new double[5];
        double count = 0.0, media;
        int i, j;

        Scanner scan = new Scanner(System.in);
        for (i=0; i<notas.length; i++) {
            System.out.println("Nota " + (i+1) + ": ");
            notas[i] = scan.nextDouble();
            count += notas[i];
        }

        for (i=1; i<notas.length; i++) {
            for (j=0; j<i; j++) {
                if (notas[i] > notas[j]) {
                    double temp = notas[i];
                    notas[i] = notas[j];
                    notas[j] = temp;
                }
            }
        }
        media = count/5;
        JOptionPane.showMessageDialog(null, "Notas em ordem decescente: " + Arrays.toString(notas));
        JOptionPane.showMessageDialog(null, "Media das notas: " + media);
    }
}
