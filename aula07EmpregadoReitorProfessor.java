import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class aula07EmpregadoReitorProfessor {
    public static void main(String[] args) {
        Reitor r = new Reitor();
        r.setNome("Joao");
        r.setSalario(1000);

        Professor p = new Professor();
        p.setNome("Ricardo");
        p.setSalario(500);

        Relatorio r1 = new Relatorio();
        r1.adiciona(r);

        Relatorio r2 = new Relatorio();
        r2.adiciona(p);
    }
}

class Empregado {
    private String nome;
    private double salario;

    public void setNome (String nome) {
        this.nome=nome;
    }
    public void setSalario (double salario){
        this.salario=salario;
    }
    public double getSalario() {
        return this.salario;
    }
    public double getGastos() {
        return this.salario;
    }
    public String getInfo() {
        return "nome: " + this.nome + " com salário " + this.salario;
    }
}

class Professor extends Empregado {
    private int horasDeAula=20;

    public double getGastos() {
        return this.getSalario() + this.horasDeAula*10;
    }
    public String getInfo() {
        String informacaoBasica = super.getInfo();
        String informacao = informacaoBasica + " horas de aula: " + this.horasDeAula;
        return informacao;
    }
}

class Reitor extends Empregado {
    public String getInfo() {
        return super.getInfo() + " ele é Reitor";
    }
}

class Relatorio {
    public void adiciona (Empregado f) {
        System.out.println(f.getInfo());
        System.out.println(f.getGastos());
    }
}