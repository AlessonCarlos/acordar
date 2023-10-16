import java.util.Scanner;

public class tarefa_wrapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor de tipo: ");

        if (scanner.hasNextInt()) {
            int valorPrimitivo = scanner.nextInt();
            Integer valorWrapper = Integer.valueOf(valorPrimitivo);
            System.out.println("Valor em tipo primitivo: " + valorPrimitivo);
            System.out.println("Valor convertido para Integer (wrapper): " + valorWrapper);
        } else if (scanner.hasNextDouble()) {
            double valorPrimitivo = scanner.nextDouble();
            Double valorWrapper = Double.valueOf(valorPrimitivo);
            System.out.println("Valor em tipo primitivo: " + valorPrimitivo);
            System.out.println("Valor convertido para Double (wrapper): " + valorWrapper);
        } else {
            System.out.println("Valor não reconhecido como int ou double.");
        }

        scanner.close();
    }
}

