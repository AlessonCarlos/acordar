import java.util.Scanner;

public class Carro {
    private String motorizacao;
    private int numPortas;
    private String tipoCarro;

    public Carro(String motorizacao, int numPortas, String tipoCarro) {
        this.motorizacao = motorizacao;
        this.numPortas = numPortas;
        this.tipoCarro = tipoCarro;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a motorização (1.0, 1.6 ou 2.0):");
        String motorizacao = scanner.nextLine();

        System.out.println("Digite o número de portas (2 ou 4):");
        int numPortas = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha

        System.out.println("Digite o tipo de carro (hatch, sedã ou suv):");
        String tipoCarro = scanner.nextLine();

        Carro meuCarro = new Carro(motorizacao, numPortas, tipoCarro);

        System.out.println("\nCaracterísticas do seu carro:");
        System.out.println("Motorização: " + meuCarro.motorizacao);
        System.out.println("Número de Portas: " + meuCarro.numPortas);
        System.out.println("Tipo de Carro: " + meuCarro.tipoCarro);

        scanner.close();
    }
}
