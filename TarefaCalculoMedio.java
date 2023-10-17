import java.util.Scanner;

public class TarefaCalculoMedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

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

        if (media >= 7.0) {
            System.out.println("Aluno aprovado");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Esse aluno irá para recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }

        
        
            System.out.println("Deseja inserir mais notas? (s/n): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.println("Obrigado por usar o sistema de notas.");
            }
            scanner.close();
        }
    }
}



