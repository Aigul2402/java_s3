
import java.util.Arrays;

public class Printer3 {
    public static void main(String[] args) {
       String[] arr;
       if (args.length==0){
        arr = new String[] {"cat","elephant","dog","giraffe"};
       }
       else{
        arr = args[0].split(",");
       }
       FilterStrings3 answer = new FilterStrings3();
       String itResume_res = Arrays.toString(answer.filterShortStrings(arr));
       System.err.println(itResume_res);
    }
}
