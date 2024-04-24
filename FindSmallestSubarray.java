
public class FindSmallestSubarray {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 1, 9, 7, 3, 1, 4, 1, 8 };
        System.out.println(findSmallestSubarrayLen(arr, 15));
    }

    public static int findSmallestSubarrayLen(int[] arr, int num) {
        int sum = 0, minLeft = 0, minRight = Integer.MAX_VALUE, left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (sum <= num) {
                sum += arr[right];
            }

            if (sum > num) {
                while (sum > num) {
                    System.out.println("Subarray found [" + left + ", " + right + "]");
                    if ((right - left) < (minRight - minLeft)) {
                        minRight = right;
                        minLeft = left;
                    }
                    sum -= arr[left];
                    left++;
                }
            }
        }

        if (minRight == Integer.MAX_VALUE) {
            System.out.println("No subarray exists");
            return 0;
        }

        System.out.println("Smallest subarray found [" + minLeft + ", " + minRight + "]");
        return minRight - minLeft;
    }
}