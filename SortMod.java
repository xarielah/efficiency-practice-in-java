/**
 * @see https://kef-code.vercel.app/courses/intro-to-computer-science/efficiency/sortmod
 */
public class SortMod {
    public static void main(String[] args) {
        sortMod(new int[] { 35, 17, 13, 252, 4, 128, 7, 3, 81 }, 10);
    }

    public static void sortMod(int[] arr, int k) {
        if (arr.length == 1 || arr.length == 0)
            return;
        int temp, s = 0, j = 0;
        for (int i = 0; i < k; i++) {
            while (j < arr.length) {
                if (arr[j] % k == i) {
                    temp = arr[s];
                    arr[s] = arr[j];
                    arr[j] = temp;
                    s++;
                }
                j++;
            }
            j = s;
        }
    }
}
