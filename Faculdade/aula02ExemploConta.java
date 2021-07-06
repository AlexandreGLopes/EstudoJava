public class aula02ExemploConta {
    public static void main(String[] args) {
            Conta minhaConta = new Conta();

            minhaConta.titular = "Duke";
            minhaConta.saldo = 1000.0;

            boolean consegui = minhaConta.saca(1000);
                if (consegui) {
                    System.out.println("Consegui sacar");
                }
                else {
                    System.out.println("Não consegui sacar");
                }
            minhaConta.deposita(500);

            System.out.println("Saldo atual " + minhaConta.saldo);
    }
}

class Conta {
    String titular;
    int numero;
    double saldo;

    boolean saca(double valor) {
        if (this.saldo < valor){
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void deposita (double quantidade) {
        this.saldo += quantidade;
    }
}