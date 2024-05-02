/**
 * @see https://kef-code.vercel.app/courses/intro-to-computer-science/efficiency/minNumWithSum
 */
public class MinNumWithSum {
    public static void main(String[] args) {
        int[] arr = new int[4];
        minSumWithNum(arr, 14);
        printArr(arr); // 1 1 3 9

        int[] arr2 = new int[4];
        minSumWithNum(arr2, 36);
        printArr(arr2); // 9 9 9 9

        int[] arr3 = new int[2];
        minSumWithNum(arr3, 20);
        printArr(arr3); // 0 0
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // O(n)
    public static void minSumWithNum(int[] arr, int s) {
        if (arr.length * 9 < s || arr.length > s)
            return;
        int s2 = arr.length, sumIdx = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        while (s2 < s) {
            arr[sumIdx] += 1;
            s2++;
            if (arr[sumIdx] == 9) {
                sumIdx--;
            }
        }
    }
}
