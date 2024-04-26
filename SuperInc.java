/**
 * @see https://kef-code.vercel.app/courses/intro-to-computer-science/efficiency/superInc
 */
public class SuperInc {
    public static void main(String[] args) {
        System.out.println(superInc(new int[] { 2, 3, 8, 27 }, 30)); // true
    }

    public static boolean superInc(int[] arr, int k) {
        if (arr.length == 1)
            return arr[0] == k;
        if (arr.length == 0)
            return false;
        int sum = k;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == sum)
                return true;
            if (arr[i] < sum)
                sum -= arr[i];
        }
        return false;
    }
}
