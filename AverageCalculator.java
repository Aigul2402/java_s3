public class AverageCalculator {
    public static int   calculateAverage(int[] a) {
        if (a.length == 0) return 0;
            int sum1 = 0;
            for (int num : a) {
            sum1+=num;}
        return (int) Math.round ((double) sum1 /a.length);
        }
}
    

