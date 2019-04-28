public class aula04Televisao {
    public static void main(String[] args) {
        ControleRemoto Controle = new ControleRemoto();
        Televisao tv = new Televisao();
        Controle.emparelhaTVeControle(tv);
        Controle.aumentaVolume();
        //System.out.println(tv.getVolume()); //para ver se o objeto tv criado é o mesmo que está dentro da classe ControleRemoto
        Controle.diminuiVolume();
        Controle.aumentaCanal();
        //System.out.println(tv.getCanal()); //para ver se o objeto tv criado é o mesmo que está dentro da classe ControleRemoto
        Controle.diminuiCanal();
        Controle.consultaCanal();
        Controle.consultaVolume();
    }
}

class Televisao {
    private int volume=1;
    private int canal=1;

    public int getVolume () {
        return this.volume;
    }

    public void setAumentaVolume () {
        this.volume += 1;
    }

    public void setDiminuiVolume () {
        this.volume -= 1;
    }

    public int getCanal () {
        return this.canal;
    }

    public void setAumentaCanal () {
        this.canal += 1;
    }

    public void setDiminuiCanal () {
        this.canal -= 1;
    }

    public void setCanal (int canalIndicado) {
        this.canal = canalIndicado;
    }
}

class ControleRemoto {
    Televisao tvEmparelhada;

    void emparelhaTVeControle (Televisao tv){
        tvEmparelhada = tv;
    }

    void aumentaVolume () {
        tvEmparelhada.setAumentaVolume();
        System.out.println("Volume: " + tvEmparelhada.getVolume());
    }
    void diminuiVolume () {
        tvEmparelhada.setDiminuiVolume();
        System.out.println("Volume: " + tvEmparelhada.getVolume());
    }
    void aumentaCanal () {
        tvEmparelhada.setAumentaCanal();
        System.out.println("Canal: " + tvEmparelhada.getCanal());
    }
    void diminuiCanal () {
        tvEmparelhada.setDiminuiCanal();
        System.out.println("Canal: " + tvEmparelhada.getCanal());
    }

    void escolheCanal (int canalDigitado) {
        tvEmparelhada.setCanal(canalDigitado);
        System.out.println("Canal: " + tvEmparelhada.getCanal());
    }

    void consultaVolume () {
        System.out.println("Volume: " + tvEmparelhada.getVolume());
    }
    void consultaCanal () {
        System.out.println("Canal: " + tvEmparelhada.getCanal());
    }
}