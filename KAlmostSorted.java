/**
 * @see
 */
public class KAlmostSorted {
    public static void main(String[] args) {
        System.out.println(
                kAlmostSorted(new int[] { 3, 0, 0, 4, 7, 9, 0, 0, 0, 0, 11, 15, 0, 19, 20, 0, 0, 31, 40, 0 }, 31)); // 17
        System.out.println(
                kAlmostSorted(new int[] { 3, 0, 0, 4, 7, 9, 0, 0, 0, 0, 11, 15, 0, 19, 20, 0, 0, 31, 40, 0 }, 40)); // 18
        System.out.println(
                kAlmostSorted(new int[] { 3, 0, 0, 4, 7, 9, 0, 0, 0, 0, 11, 15, 0, 19, 20, 0, 0, 31, 40, 0 }, 11)); // 10
        System.out.println(
                kAlmostSorted(new int[] { 3, 0, 0, 4, 7, 9, 0, 0, 0, 0, 11, 15, 0, 19, 20, 0, 0, 31, 40, 0 }, 7)); // 4
        System.out.println(
                kAlmostSorted(new int[] { 3, 0, 0, 4, 7, 9, 0, 0, 0, 0, 11, 15, 0, 19, 20, 0, 0, 31, 40, 0 }, 200)); // -1
        System.out.println(
                kAlmostSorted(new int[] { 3, 0, 0, 4, 7, 9, 0, 0, 0, 0, 11, 15, 0, 19, 20, 0, 0, 31, 40, 0 }, 33)); // -1
    }

    public static int kAlmostSorted(int[] a, int num) {
        int low = 0, high = a.length - 1;
        while (a[low] == 0 || a[high] == 0) {
            if (a[low] == 0)
                low++;
            if (a[high] == 0)
                high--;
            if (low == high) {
                if (a[low] == num)
                    return low;
                return -1;
            }
        }
        while (low < high) {
            if (a[low] == num)
                return low;
            if (a[high] == num)
                return high;
            int mid = (low + high) / 2;
            while (a[mid] == 0) {
                mid++;
            }
            if (a[mid] == num)
                return mid;
            if (a[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}