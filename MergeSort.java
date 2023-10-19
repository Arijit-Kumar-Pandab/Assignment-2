import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 88, 2, 1, 3, 2, 4, 9, 9, 0, 3, 7, 88, -1, -99, 99, 999, 64, 54 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] temp = new int[arr.length];
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                ++i;
            } else {
                temp[k] = arr[j];
                ++j;
            }
            ++k;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            ++i;
            ++k;
        }
        while (j <= high) {
            temp[k] = arr[j];
            ++j;
            ++k;
        }
        // System.out.println(Arrays.toString(temp));
        for (int l = low; l <= high; l++) {
            arr[l] = temp[l];
        }
    }
}
