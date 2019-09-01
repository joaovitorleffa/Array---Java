import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] data = new int[4];
        int i;
        String resultado = "";
        Scanner sc = new Scanner(System.in);

        for (i=0; i<4; i++) {
            System.out.println("Numero: ");
            data[i] = sc.nextInt();
        }

        for (i = data.length -1 ; i>=0; i++) {
            resultado = "" + data[i];
        }

        for (i=0; i < resultado.length(); i++) {
            System.out.println(resultado.charAt(i));
        }
    }
}
