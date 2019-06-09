import java.util.ArrayList;
import java.util.List;

public class aula09CompArray {
    public static void main(String[] args) {
        ContaCorrente.totalContas = 0;

        ContaCorrente conta1 = new ContaCorrente(1, 100.00);
        ContaCorrente conta2 = new ContaCorrente(2, 200.00);
        ContaCorrente conta3 = new ContaCorrente(3, 300.00);
        
        List contas = new ArrayList ();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        conta1.depositar(10);
        conta2.depositar(22);
        conta3.depositar(33);

        for (Object str : contas) {
            System.out.println(str);
        }

        for (int i=0; i<contas.size(); i++) {
            ContaCorrente con = (ContaCorrente) contas.get(i);
            System.out.println(con.getSaldo());
        }
    }
}

class ContaCorrente {
    protected int numero;
    protected double saldo;
    protected static int totalContas;

    public ContaCorrente (int n, double s) {
        this.numero = n;
        this.saldo = s;
        this.totalContas++;
    }

    public int getNumero () {
        return numero;
    }

    public double getSaldo () {
        return saldo;
    }

    public void depositar (double valor) {
        saldo += valor;
    }

    public void sacar (double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente.\n");
        }
    }

    @Override
    public String toString () {
        String retorno = "Conta " +getNumero()+ " -Saldo: "+getSaldo();
        return retorno;
    }
}