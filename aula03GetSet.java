public class aula03GetSet {
    public static void main(String[] args) {
        Conta minhaConta = new Conta ();
        minhaConta.deposita(1000);
        System.out.println("Saldo: " + minhaConta.getSaldo());
    }
}

class Conta {
    int numero;
    private double saldo;
    Cliente titular = new Cliente ();

    Conta () {
        System.out.println("Construindo uma conta");
    }

    public double getSaldo(){
        return this.saldo;
    }

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

    /* void transferePara (Conta destino, double valor) {
        this.saldo -= valor;
        destino.saldo += valor;
    } */

    boolean transfereParaComVerif (Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            return false;
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }

    void mostraDados () {
        System.out.println(this.numero + "\n" + this.saldo + "\n" + this.titular.nome + " " + this.titular.sobrenome + "\n" + this.titular.cpf);
    }
}

class Cliente {
    String nome;
    String sobrenome;
    String cpf;
}