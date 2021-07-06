public class aula06ImovelExercicio {
    public static void main(String[] args) {
        Imovel imovel = new Imovel();
        Novo imovel2 = new Novo();
        Velho imovel3 = new Velho();
        imovel.setPreco(1000);
        imovel2.setPreco(1000);
        imovel3.setPreco(1000);
        System.out.println(imovel.getPreco());
        System.out.println(imovel2.getPreco());
        System.out.println(imovel3.getPreco());
    }
}

class Imovel {
    protected String Endereco;
    protected double Preco;

    void setEndereco (String endereco) {
        this.Endereco=endereco;
    }

    String getEndereco () {
        return this.Endereco;
    }

    void setPreco (double preco) {
        this.Preco=preco;
    }

    double getPreco () {
        return this.Preco;
    }
}

class Novo extends Imovel {
    @Override
    void setPreco (double preco) {
        this.Preco=preco*1.3;
    }
}

class Velho extends Imovel {
    @Override
    void setPreco (double preco) {
        this.Preco=preco*0.8;
    }
}