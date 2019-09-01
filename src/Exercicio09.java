import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        String[] estacionamento = new String[10];
        int i;
        int opcao, numVaga;
        String placa = null, buscaPlaca;

        for (i=0; i<estacionamento.length; i++) {
            if (estacionamento[i] == null) {
                estacionamento[i] = "livre";
            }
        }

        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("     ===========ESTACIONAMENTO==========");
            System.out.println("    |            1 - Entrada            |");
            System.out.println("    |            2 - Saída              |");
            System.out.println("    |            3 - Listar             |");
            System.out.println("    |            4 - ar                 |");
            System.out.println("     ===================================");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1 :
                    System.out.println("Placa do veículo: ");
                    placa = leitor.next();
                    System.out.println("Número da Vaga: ");
                    numVaga = leitor.nextInt();
                    estacionamento[numVaga] = placa;
                break;

                case 2 :
                    System.out.println("Placa do veículo");
                    buscaPlaca = leitor.next();
                    for (i=0; i<estacionamento.length; i++) {
                        if (estacionamento[i].equals(placa)) {
                            estacionamento[i] = "livre";
                        }
                    }
                break;

                case 3 :
                    for (i=0; i<estacionamento.length; i++) {
                        System.out.println("Vaga " + i + ": " + estacionamento[i]);
                    }
                break;

                case 4 :
                    System.out.println("\nEncerrando sistema...");
                break;

                default:
                    System.out.println("\nOpção inválida!");
                break;
            }

        } while (opcao != 4);


    }
}
