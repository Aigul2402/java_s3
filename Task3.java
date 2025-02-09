import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List items = new ArrayList<String>();
        items.add("tttt");
        items.add(2);
        items.add("ef");
        items.add(4);
        for (int i = 0; i < items.size(); i++) {
            Object item = items.get(i);
            if (item instanceof Integer)
                items.remove(i);
        }
        System.out.println(items);
    }

}
