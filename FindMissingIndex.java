public class FindMissingIndex {
    public static void main(String[] args) {
        System.out.println(findMissingIndex(new int[] { 22, 24, 26, 32, 34, 36, 38, 40 }));
    }

    public static int findMissingIndex(int[] arr) {
        if (arr.length < 3)
            return arr.length - 1;
        int gap = Math.min(arr[1] - arr[0], arr[arr.length - 1] - arr[arr.length - 2]);
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] - arr[i] > gap)
                return i;
        }
        return arr.length - 1;
    }
}
