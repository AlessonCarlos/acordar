public class classePessoa {

    abstract static class Pessoa {
        private String nome;
        private int idade;
        private String endereco;

        public Pessoa(String nome, int idade, String endereco) {
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public abstract void imprimirDetalhes();
    }

    static class PessoaFisica extends Pessoa {
        private String cpf;

        public PessoaFisica(String nome, int idade, String endereco, String cpf) {
            super(nome, idade, endereco);
            this.cpf = cpf;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        @Override
        public void imprimirDetalhes() {
            System.out.println("Pessoa Física - Nome: " + getNome() + ", Idade: " + getIdade() + ", Endereço: " + getEndereco() + ", CPF: " + cpf);
        }
    }

    static class PessoaJuridica extends Pessoa {
        private String cnpj;

        public PessoaJuridica(String nome, int idade, String endereco, String cnpj) {
            super(nome, idade, endereco);
            this.cnpj = cnpj;
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

        @Override
        public void imprimirDetalhes() {
            System.out.println("Pessoa Jurídica - Nome: " + getNome() + ", Idade: " + getIdade() + ", Endereço: " + getEndereco() + ", CNPJ: " + cnpj);
        }
    }

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", 30, "Rua A, 123", "123.456.789-00");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", 5, "Avenida B, 456", "12.345.678/0001-90");

        pessoaFisica.imprimirDetalhes();
        pessoaJuridica.imprimirDetalhes();
    }
}
