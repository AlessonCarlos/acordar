import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class tarefa_colecoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomesMasculinos = new ArrayList<>();
        ArrayList<String> nomesFemininos = new ArrayList();

        while (true) {
            System.out.print("Digite um nome (ou 'sair' para encerrar): ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o gênero da pessoa (Masculino ou Feminino): ");
            String genero = scanner.nextLine().trim();

            if (genero.equalsIgnoreCase("Masculino")) {
                nomesMasculinos.add(entrada + " - Masculino");
            } else if (genero.equalsIgnoreCase("Feminino")) {
                nomesFemininos.add(entrada + " - Feminino");
            } else {
                System.out.println("Gênero inválido. Por favor, digite 'Masculino' ou 'Feminino'.");
            }
        }

        scanner.close();

        Collections.sort(nomesMasculinos);
        Collections.sort(nomesFemininos);

        System.out.println("Masculino:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nFeminino:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }
    }
}


