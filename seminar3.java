import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class seminar3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt());
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
    }

}
