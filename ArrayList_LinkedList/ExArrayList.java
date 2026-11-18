package ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ExArrayList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Kalebe");
        nomes.add("Jeniffer");
        nomes.add("Bolsonaro");
        nomes.add("Lula");
        nomes.remove(2);

        System.out.println("Lista completa: ");

        for (int i = 0; i < nomes.size(); i++)
            System.out.println(nomes.get(i));

    }

}
