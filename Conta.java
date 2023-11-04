public class Conta {
    
    String dono;
    double saldo;

    public void saca (double valor){
        if (saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Não tem dinheiro, seu POBRE!");
        }
    }

    public void deposita(double valor){
        saldo += valor;
        }

    public static void main(String[] args) {
        //conta bancaria
        Conta minhaConta;
        minhaConta = new Conta();

        //alterando os valores de conta bancaria
        minhaConta.dono = "Alesson";
        minhaConta.saldo = 1000;

        //saca 200 reais
        minhaConta.saca(2000);

        //deposita 500 reais
        minhaConta.deposita(500);
        System.out.println(minhaConta.saldo);
        


    }
}
