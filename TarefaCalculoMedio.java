import java.util.Scanner;

public class TarefaCalculoMedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        System.out.printf("A média das notas é: %.2f%n", media);

        scanner.close();
    }
}


