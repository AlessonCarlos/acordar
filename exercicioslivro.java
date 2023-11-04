public class exercicioslivro {
    
    public static long calcularFatorial(long n) {
        if ( n == 0 || n == 1){
            return 1;
        } else {
            long resultado = 1;
            for (long i = 2; i <= n; i++){
                resultado *= i;
            }
            return resultado;
        }
    }

        public static void main (String [] args) {
            for (long i = 1; i <= 40; i++) {
                long fatorial = calcularFatorial(i);
                System.out.println("Fatorial de " + i + " é " + fatorial);
            }
        
    }

}
