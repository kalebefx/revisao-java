package ArrayList_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) {
        List<Integer> numeros = new LinkedList<>();
        numeros.add(0, 10);
        numeros.add(1, 20);
        numeros.add(2, 30);
        numeros.add(3, 40);
        numeros.add(4, 50);
        numeros.add(3, 35);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
