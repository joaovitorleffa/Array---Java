import javax.swing.*;

public class Exercicio08 {
    public static void main(String[] args) {
        int[] numPar = new int[10];
        int[] numImpar = new int[10];
        int i, Par = 0, Impar = 0;

        System.out.println("---- NÚMEROS GERADOS ----");

        for (i=0; i<10; i++) {
            int gerador;
            do {
                gerador = (int) (Math.random() * 21);
            } while (gerador == 0);

            System.out.println(gerador);

            if (gerador % 2 == 0) {
                numPar[Par] = gerador;
                Par++;
            } else if (gerador % 2 == 1){
                numImpar[Impar] = gerador;
                Impar++;
            }
        }

        System.out.println("\n---- NÚMEROS PARES ----");
        for (i=0; i<Par; i++) {
            System.out.println(numPar[i]);
        }

        System.out.println("\n---- NÚMEROS ÍMPARES ----");
        for (i=0; i<Impar; i++) {
            System.out.println(numImpar[i]);
        }

    }
}
