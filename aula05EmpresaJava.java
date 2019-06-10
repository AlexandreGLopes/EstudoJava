public class aula05EmpresaJava {
    public static void main(String[] args) {
        Empresa E1 = new Empresa();
        Funcionario F1;
        F1 = E1.Adiciona("Joao", 1000);

        System.out.println(F1.Nome + F1.Salario);

        E1.MostraEmpregados();
    }
}

class Funcionario {
    String Nome;
    double Salario;

    void Bonifica (double bonificacao) {
        this.Salario += bonificacao;
    }
}

class Empresa {
    Funcionario[] Funcionarios = new Funcionario[100];
    int QtdeFuncionarios = 0;

    Empresa () {
        // Aqui temos um loop para instanciar os funcionarios num array de 100 posições
        /* for (int i=0; i<100; i++){
            Funcionarios[i] = new Funcionario();
        }*/
    }

    Funcionario Adiciona (String Nome, double Salario) {
        this.QtdeFuncionarios += 1;
        // A próxima linha instancia uma posição específica do array de Funcionários como um Funcionário novo de acordo com a chamada do método
        Funcionarios[this.QtdeFuncionarios-1] = new Funcionario();
        Funcionarios[this.QtdeFuncionarios-1].Nome = Nome;
        Funcionarios[this.QtdeFuncionarios-1].Salario = Salario;
        return Funcionarios[this.QtdeFuncionarios-1];
    }

    void MostraEmpregados () {
        System.out.println(this.QtdeFuncionarios);
        for (int i=0; i<this.QtdeFuncionarios; i++) {
            System.out.println(Funcionarios[i].Nome + "\n" + Funcionarios[i].Salario);
        }
    }
}