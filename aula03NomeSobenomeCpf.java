public class aula03NomeSobenomeCpf {
    public static void main(String[] args) {
        Conta minhaConta = new Conta ();
        Cliente c = new Cliente ();
        minhaConta.titular = c;
        
        String res = minhaConta.titular.nome = "Jose";
        System.out. println(res);
    }
}

class Conta {
    int numero;
    double saldo;
    Cliente titular;

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
}

class Cliente {
    String nome;
    String sobrenome;
    String cpf;
}