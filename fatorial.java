import java.math.BigInteger;
import java.util.Scanner;

public class fatorial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Qual número você deseja fatorar?");
        int numero = scanner.nextInt();
        BigInteger fatorial = BigInteger.ONE;
        for (int i = 1; i <= numero; i++) {
        fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);

        System.out.println("Deseja fatorar outro número? (SIM/NAO)");
        String resposta = scanner.next();

        if (!resposta.equalsIgnoreCase("SIM")) {
            break;
        }
        
        
    
    }
}
}