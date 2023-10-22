import java.util.Scanner;
public class Colecoesparte2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas pessoas deseja cadastrar? ");
        int numPessoas = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha
        
        String[] nomes = new String[numPessoas];
        String[] sexos = new String[numPessoas];
        
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
            
            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F):");
            sexos[i] = scanner.nextLine();
        }
        
        // Separar as pessoas em grupos
        String[] masculino = new String[numPessoas];
        String[] feminino = new String[numPessoas];
        int numMasculino = 0;
        int numFeminino = 0;
        
        for (int i = 0; i < numPessoas; i++) {
            if (sexos[i].equalsIgnoreCase("M")) {
                masculino[numMasculino] = nomes[i];
                numMasculino++;
            } else if (sexos[i].equalsIgnoreCase("F")) {
                feminino[numFeminino] = nomes[i];
                numFeminino++;
            }
        }
        
        // Exibir os grupos
        System.out.println("Pessoas do grupo Masculino:");
        for (int i = 0; i < numMasculino; i++) {
            System.out.println(masculino[i]);
        }
        
        System.out.println("Pessoas do grupo Feminino:");
        for (int i = 0; i < numFeminino; i++) {
            System.out.println(feminino[i]);
        }
        scanner.close();
    }
}


