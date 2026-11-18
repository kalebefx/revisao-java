package ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparacaoRemocao {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Elemento 0");
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");
        arrayList.add("Elemento 4");

        List<String> linkedList = new LinkedList<>(arrayList);

        arrayList.remove(2);
        linkedList.remove(2);

        System.out.println("ArrayList após remoção:  " + arrayList);
        System.out.println("LinkedList após remoção: " + linkedList);
    }
}
