public class aula04Elevador {
    public static void main(String[] args) {
        Elevador e1 = new Elevador();

        e1.Inicializa(10, 10);

        e1.Entra(9);
        e1.Entra(2);
        System.out.println(e1.getAndarAtual());
        e1.Sai(10);
        e1.Sai(1);

        boolean subir = e1.Sobe();
        if (subir == true) {
            System.out.println("O elevador subiu um andar");
        }
        else {
            System.out.println("O elevador já se encontra no último andar");
        }
        System.out.println(e1.getAndarAtual());

        boolean descer = e1.Desce();
        if (descer == true) {
            System.out.println("O elevador desceu um andar");
        }
        else {
            System.out.println("O elevador já se encontra no térreo andar");
        }
        System.out.println(e1.getAndarAtual());
    }
}

class Elevador {
    private int andarAtual;
    private int andares;
    private int capacidade;
    private int passageiros;

    public void Inicializa (int capacidade, int andares) {
        this.andarAtual = 0;
        this.capacidade = capacidade;
        this.andares = andares;
        this.passageiros = 0;
    }

    public void Entra (int qtde) {
        int vagas = this.capacidade - this.passageiros;
        if (vagas >= qtde) {
            this.passageiros += qtde;
            System.out.println("Entraram " + qtde + " passageiros novos no elevador");
        }
        else {
            int resto = qtde - vagas;
            this.passageiros += vagas;
            System.out.println("Não puderam entrar " + resto + " pessoas no elevador. Entraram " + vagas + " pessoas");
        }
    }

    public void Sai (int qtde) {
        if (qtde > this.passageiros) {
            System.out.println("Não há este número de passageiros dentro do elevador");
        }
        else {
            this.passageiros = this.passageiros - qtde;
            System.out.println(qtde + " pessoas saíram do elevador");
        }
    }

    public boolean Sobe () {
        if (this.andarAtual == this.andares) {
            return false;
        }
        else {
            this.andarAtual++;
            return true;
        }
    }
    public boolean Desce () {
        if (this.andarAtual == 0) {
            return false;
        }
        else {
            this.andarAtual--;
            return true;
        }
    }
    
    public int getAndarAtual () {
        return this.andarAtual;
    }

    public int getCapacidade () {
        return this.capacidade;
    }

    public int getAndares () {
        return this.andares;
    }

    public int getPassageiros () {
        return this.passageiros;
    }
}