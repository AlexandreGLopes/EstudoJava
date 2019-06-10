public class aula05Baralho {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.imprimeBaralho();
        baralho.embaralha();
        baralho.imprimeBaralho();
    }
}

class Carta {
    private String Nome;
    private String Naipe;

    void setNome (String nome) {
        this.Nome = nome;
    }

    String getNome () {
        return this.Nome;
    }

    void setNaipe (String naipe) {
        this.Naipe = naipe;
    }

    String getNaipe () {
        return this.Naipe;
    }
}

class Baralho {
    Carta[] baralho = new Carta[56];

    Baralho () {
        for (int i=0; i<baralho.length; i++) {
            baralho[i] = new Carta();
        }
        int contador = 1;
        for (int i=0; i<baralho.length; i++) {
            if (i<13) {
                baralho[i].setNaipe("Paus");
            }
            else if (i>=13 && i<26) {
                baralho[i].setNaipe("Copas");
            }
            else if (i>=26 && i<39) {
                baralho[i].setNaipe("Espadas");
            }
            else if (i>=39 && i<52) {
                baralho[i].setNaipe("Ouros");
            }
            else {
                baralho[i].setNaipe("Coringa");
                baralho[i].setNome("Coringa");
            }
        }
        for (int i=0; i<52; i++) {
            if (contador==1) {
                baralho[i].setNome("Ás");
            }
            else if (contador>1 && contador<11){
                String NomeString = Integer.toString(contador);
                baralho[i].setNome(NomeString);
            }
            else if (contador == 11) {
                baralho[i].setNome("Valete");
            }
            else if (contador == 12) {
                baralho[i].setNome("Dama");
            }
            else if (contador == 13) {
                baralho[i].setNome("Rei");
                contador=0;
            }
        contador++;
        }
    }

    void embaralha () {
        int valor = (int) (Math.random()*56);
        for (int i=0; i<valor; i++) {
            int carta1 = (int) (Math.random()*56);
            int carta2 = (int) (Math.random()*56);
            Carta aux = new Carta();
            aux=baralho[carta1];
            baralho[carta1]=baralho[carta2];
            baralho[carta2]=aux;

        }
    }

    void imprimeBaralho () {
        for (int i=0; i<baralho.length; i++) {
            System.out.println(this.baralho[i].getNaipe() + " " + this.baralho[i].getNome());
        }
    }
}