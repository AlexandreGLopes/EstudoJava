import java.util.ArrayList;

public class aula09arrayList {
    public static void main(String[] args) {
        
        ArrayList a1 = new ArrayList();
        System.out.println("Tamanho inicial: "+a1.size());

        a1.add(11);
        a1.add("Jose");
        a1.add(55.3);
        a1.add("Maria");
        a1.add(1, "A1");
        a1.add(0, "B1");
        System.out.println(a1);
        System.out.println(a1.get(0));

        a1.remove("Jose");
        a1.remove(3);
        System.out.println(a1);
    }
}