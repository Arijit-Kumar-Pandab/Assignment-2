public class CheckSubset {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 88, 2, 1, 3, 2, 4, 9, 9, 0, 3, 7, 88 };
        int[] sub = { 2, 1, 3, 8, 4 };
        int[] sub2 = { 4, 9, 9, 0, 3 };
        System.out.println(check(arr, sub2));
        System.out.println(check(arr, sub));
    }

    private static boolean check(int[] arr, int[] subset) {
        int i = 0, j = 0;
        while (i < arr.length && j < subset.length) {
            if (arr[i] == subset[j]) {
                ++j;
                if (j > subset.length - 1) {
                    return true;
                }
            } else {
                j = 0;
            }
            ++i;
        }
        return false;
    }
}
