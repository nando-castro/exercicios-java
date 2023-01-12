import java.util.ArrayList;
import java.util.List;

public class App {
    /*
     * Escreva um código que encontre os elementos em comum que existem em dois
     * arrays e imprima os nomes dos itens em comum! Exemplo:
     */
    public static void main(String[] args) throws Exception {

        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();
        List<String> duplicados = new ArrayList<>();

        array1.add("uva");
        array1.add("coco");
        array1.add("acerola");
        array1.add("banana");

        array2.add("buriti");
        array2.add("manga");
        array2.add("abacate");
        array2.add("melancia");
        array2.add("uva");

        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if (array1.get(i) == array2.get(j)) {
                    duplicados.add(array2.get(j));
                }
            }
        }

        System.out.println(duplicados);

    }
}
