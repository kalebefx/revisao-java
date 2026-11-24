package HashMap_LinkedHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01HashMap {

    public static void main(String[] args) {
        List<String> palavras = List.of("java", "python", "java", "c", "python", "java");
        Map<String, Integer> contagem = new HashMap<>();
        for (String palavra : palavras) {
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);


        }
        System.out.println(contagem);

    }

}
