public class aula03testaContasIguais {
    public static void main(String[] args) {
        Conta c1 = new Conta ();
        c1.titular = "Duke";
        c1.saldo = 227;

        Conta c2 = new Conta ();
        c2.titular = "Duke";
        c2.saldo = 227;

        if (c1 == c2) {
            System.out.println("Contas iguais");
        }

        boolean consegui = c1.transfereParaComVerif (c2, 500);
        if (consegui == true) {
            System.out.println("Transferência de valores concluída.");
        }
        else {
            System.out.println("A transferência não pode ser concluída por falta de saldo.");
        }

        System.out.println(c1.saldo);
        System.out.println(c2.saldo);
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