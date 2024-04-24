/**
 * @see https://kef-code.vercel.app/courses/intro-to-computer-science/efficiency/findPeak
 */
public class FindPeak {
    public static void main(String[] args) {
        System.out.println(findPeak(new int[] { 1, 2, 5, 4, 3, 7, 3 }));
    }

    public static int findPeak(int[] arr) {
        if (arr[0] > arr[1])
            return arr[0];
        if (arr[arr.length - 1] > arr[arr.length - 2])
            return arr[arr.length - 1];
        int right = arr.length - 2, left = 0;

        while (left < right) {
            int mid = (right + left) / 2;

            if (arr[mid] >= arr[mid + 1] && arr[mid] >= arr[mid - 1])
                return arr[mid];
            if (arr[mid] <= arr[mid + 1]) {
                left = mid + 1;
                if (arr[left] >= arr[left + 1] && arr[left] >= arr[mid])
                    return arr[left];
            } else if (arr[mid] <= arr[mid - 1]) {
                right = mid - 1;
                if (arr[right] >= arr[right - 1] && arr[right] >= arr[mid])
                    return arr[right];
            }
        }
        return -1;
    }
}