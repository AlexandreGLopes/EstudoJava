public class aula03totalDeContas {
    public static void main(String[] args) {
        Conta5 c1 = new Conta5();
        Conta5 c2 = new Conta5();
        Conta5 c3 = new Conta5 ();
        System.out.println(Conta5.gettotalDeContas());
    }
}

class Conta5 {
    private static int totalDeContas;

    Conta5 () {
        Conta5.totalDeContas = Conta5.totalDeContas + 1;
    }

    public static int gettotalDeContas () {
        return Conta5.totalDeContas;
    }
}