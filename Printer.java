
import java.util.Arrays;

public class Printer {
    public static void main (String[] args) {
        int[] a;
        if (args.length == 0){
            a = new int[] {-1, 2, -3, 4, -5, 6};
        }else {
            a= Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        FilterNegative_1 answer = new FilterNegative_1();
        String itresume_res = Arrays.toString(answer.filterNegative(a));
        System.out.println(itresume_res);
    }
}
        
       

