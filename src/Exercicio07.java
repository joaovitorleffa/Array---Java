public class Exercicio07 {
    public static void main(String[] args) {
        int[][] imagem = new int[40][40];
        int i, j;

        for (i=0; i<imagem.length; i++) {
            for (j=0; j<imagem[0].length; j++) {
                int gerador = (int) (Math.random() * 256);
                imagem[i][j] = gerador;
            }
        }

        for (i=0; i<imagem.length; i++) {
            for (j=0; j<imagem[0].length; j++) {
                System.out.println(imagem[i][j]);
            }
        }
    }
}
