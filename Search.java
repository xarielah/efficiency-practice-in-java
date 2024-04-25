public class Search {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 3, 7, 9 },
                { 6, 4, 15, 11 },
                { 36, 50, 21, 22 },
                { 60, 55, 30, 26 }
        };
        System.out.println(search(mat, 26));
    }

    public static boolean search(int[][] mat, int num) {
        int n = mat.length;
        if (num > mat[n - 1][0] || num < mat[0][0])
            return false;
        int i = 0, j = 0;

        while (n > 1) {
            int maxS1 = mat[(n / 2) - 1 + i][j];
            int maxS2 = mat[(n / 2) - 1 + i][(n / 2) + j];
            int maxS3 = mat[(n - 1)][(n / 2) + j];

            if (num > maxS2) {
                if (num > maxS3) {

                    i += n / 2;
                } else {
                    i += n / 2;
                    j += n / 2;
                }
            } else {
                if (num > maxS1) {
                    j += n / 2;
                }
            }
            n = n / 2;
        }
        if (num == mat[i][j]) {
            System.out.println("row=" + i);
            System.out.println("col=" + j);
            return true;
        }
        return false;
    }
}
