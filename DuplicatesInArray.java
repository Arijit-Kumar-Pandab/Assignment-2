import java.util.ArrayList;
import java.util.List;

class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 88, 2, 1, 3, 2, 4, 9, 9, 0, 3, 7, 88 };
        List<Integer> res = findDuplicates(arr);
        System.out.print("The Duplicate elements are : " + res.toString());
    }

    private static List<Integer> findDuplicates(int[] arr) {
        List<Integer> res = new ArrayList<>();
        sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && !res.contains(arr[i])) {
                res.add(arr[i]);
            }
        }
        return res;
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(j, j - 1, arr);
                }
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}