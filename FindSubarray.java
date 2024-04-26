/**
 * @see https://kef-code.vercel.app/courses/intro-to-computer-science/efficiency/findSubarray
 */
public class FindSubarray {
    public static void main(String[] args) {
        findSubarray(new int[] { 2, 6, 0, 1, 9, 7, 3, 1, 4, 1, 8 }, 16); // [1, 4]
        findSubarray(new int[] { 2, 6, 0, 1, 9, 7, 3, 1, 4, 1, 8 }, 15); // [5, 8]
        findSubarray(new int[] { 2, 6, 0, 1, 9, 7, 3, 1, 4, 1, 8 }, 8); // [0, 1]
    }

    public static void findSubarray(int[] arr, int target) {
        int sum = 0, left = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > target) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                System.out.println("Subarray found between indexes " + left + " and " + right + " with sum " + target);
                return;
            }
        }
        System.out.println("No subarray found with sum " + target);
        return;
    }
}
