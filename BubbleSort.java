import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 88, 2, 1, 3, 2, 4, 9, 9, 0, 3, 7, 88, -14, 999, 54 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
