import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList(
                "Coconut", "Banana", "Cherry",
                "Cranberry", "Apple", "Goji",
                "Lemon", "Mango");

        List<String> cFruits = new ArrayList<String>();
        for (String fruit : myList) {
            if (fruit.indexOf('C') == 0) {
                cFruits.add(fruit.toUpperCase());
            }
        }
        cFruits.sort(Comparator.naturalOrder());

        myList.stream()
                .filter(fruit -> fruit.indexOf('C') == 0)
                .map(fruit -> fruit.toUpperCase())
                .sorted();
    }
}
