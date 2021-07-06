public class aula04Pessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ();
        p1.setNome("Alexandre Lopes");
        p1.setNascimento(16, 8, 1988);
        p1.setAltura(1.69);

        p1.ImprimeDados();
        System.out.println("A idade de " + p1.getNome() + " é:");
        System.out.println(p1.calculaIdade());
    }
}

class Pessoa {
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private double altura;

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome () {
        return this.nome;
    }

    public void setNascimento (int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }

    public void getNascimento () {
        System.out.println(this.diaNascimento + "/" + this.mesNascimento + "/" + this.anoNascimento);
    }

    public void setAltura (double altura) {
        this.altura = altura;
    }

    public double getAltura () {
        return this.altura;
    }

    public void ImprimeDados () {
        System.out.println(this.nome);
        System.out.println(this.diaNascimento + "/" + this.mesNascimento + "/" + this.anoNascimento);
        System.out.println(this.altura + "m");
    }

    public int calculaIdade () {
        int anoAtual = 2019;
        int Idade = anoAtual - this.anoNascimento;
        return Idade;
    }
}