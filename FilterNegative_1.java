
import java.util.ArrayList;

public class FilterNegative_1 {
    public static int[] filterNegative(int[] a) {
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (num >= 0){
                result.add(num);
            }
            
        }
        // Преобразуем ArrayList в массив
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
            
        }
        return resultArray;
    }

}
