import java.util.ArrayList;

public class UniqueElements_2 {
    public static int[] getUniqueElements(int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (!result.contains(num)) {
        result.add(num);
        }
        }
        //Преобразуем ArrayList вмассив
        int[] resultArray=new int[result.size()];
        for(int i=0; i < result.size();i++){
        resultArray[i]=result.get(i);
     }
    return resultArray;
    }
 }

