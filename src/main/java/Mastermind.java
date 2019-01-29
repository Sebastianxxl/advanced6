import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mastermind {
    public static void main(String[] args) {
        new Mastermind().run();
    }

    public Mastermind() {
    }

    public void run() {
        int number = randomNumber();
    }

    private int randomNumber() {
        Integer number;
        Set digits;
        do {
            number = (int) (Math.random() * 987);
            System.out.println(number);
        } while (getNumberOfDigits(number) != 3);
        return number;
    }

    private int getNumberOfDigits(Integer number) {
        Set digits;
        String n= number.toString();
        Character[] chars = n.split();
        List<Character> list = Arrays.asList(chars);
        list.stream().forEach(a -> System.out.println(a));

        digits = new HashSet(Arrays.asList(number.toString().toCharArray()));
        return digits.size();
    }
}
