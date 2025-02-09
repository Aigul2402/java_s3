import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted or empty
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        System.out.println("!!!arr: " + Arrays.toString(arr));
        System.out.println("!!!левое "+ Arrays.toString(left));
        System.out.println("!!!правое "+ Arrays.toString(right));
        merge(arr, left, right);
        
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                System.out.println("шаг 1");
                System.out.println("i"+i);
                System.out.println("k" +k);
                arr[k++] = left[i++];               
                System.out.println("i"+i);
                System.out.println("k" +k);
                System.out.println("arr: " + Arrays.toString(arr));
            } else {
                System.out.println("шаг 2");
                System.out.println("i"+i);
                System.out.println("k" +k);
                arr[k++] = right[j++];
                System.out.println("j"+j);
                System.out.println("k" +k);
                System.out.println("arr: " + Arrays.toString(arr));
            }
        }
        while (i < left.length) {
            System.out.println("шаг 3");
            System.out.println("i"+i);
            System.out.println("k" +k);
            arr[k++] = left[i++];
            System.out.println("i"+i);
            System.out.println("k" +k);
            System.out.println("arr: " + Arrays.toString(arr));
        }
        while (j < right.length) {
            System.out.println("шаг 4");
            System.out.println("i"+i);
            System.out.println("k" +k);
            arr[k++] = right[j++];
            System.out.println("j"+j);
            System.out.println("k" +k);
            System.out.println("arr: " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 13, 5, 6, 7};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}


