public class Average {
    public static void main(String[] args) {
        System.out.println(average(new int[] { 5, 7, -2, 10 })); // 2
    }

    public static int average(int[] arr) {
        if (arr.length == 0)
            return 0;
        int leftItems = 1, rightItems = arr.length - 2;
        double leftSum = arr[0], rightSum = 0;
        for (int i = 1; i < arr.length; i++) {
            rightSum += arr[i];
        }
        double gap = Math.abs((rightSum / rightItems) - (leftSum / leftItems));
        int gapIndex = 0;
        for (int j = 1; j < arr.length; j++) {
            leftSum += arr[j];
            leftItems++;
            rightSum -= arr[j];
            rightItems--;
            gapIndex = Math.abs((rightSum / rightItems) - (leftSum - leftItems)) > gap ? j : gapIndex;
            gap = Math.max(gap, Math.abs((rightSum / rightItems) - (leftSum / leftItems)));
        }
        return gapIndex;
    }
}
