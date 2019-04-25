public class aula03NovaContaNovoCliente {
    public static void main(String[] args) {
        Conta minhaConta = new Conta ();
        minhaConta.numero = 1;
        minhaConta.saldo = 100;
        minhaConta.titular.nome = "Jose";
        minhaConta.titular.cpf = "123256789-00";
        minhaConta.titular.sobrenome = "Da Silva";

        Conta minhaConta2 = new Conta ();

        minhaConta2.numero = 2;
        minhaConta2.saldo = 200;
        minhaConta2.titular.nome = "Joao";
        minhaConta2.titular.cpf = "987654321-00";
        minhaConta2.titular.sobrenome = "Goulart";

        minhaConta.mostraDados();
        minhaConta2.mostraDados();
    }
}

class Conta {
    int numero;
    double saldo;
    Cliente titular = new Cliente ();

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