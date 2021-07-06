public class aula03PrivatePublic {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.mudaCPF("12345678900");
        c.mudaCPF("cpf");
    }
}

class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public void mudaCPF (String cpf) {
        validaCPF(cpf);
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {
        if (cpf.length() == 11) {
            System.out.println("O CPF digitado tem 11 digitos");
        }
        else {
            System.out.println("O CPF digitado NAO tem 11 digitos. Refaça a operacao");
        }
    }
}