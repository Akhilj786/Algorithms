package DynamicProgram;

public class MaxCoins {

    public static void main(String args[]) {
        int arr[] = {3, 11, 2, 6, 1, 2};
        System.out.println(maxCoin(arr));
    }

    public static int maxCoin(int array[]) {
        int len = array.length;
        int maxValue[][] = new int[len][len];
        int a, b, c;
        for (int i = 0; i < len; i++) {
            for (int m = 0, n = i; n < len; m++, n++) {
                assert (m < len);
                assert (n < len);
                a = ((m + 2 <= len - 1) ? maxValue[m + 2][n] : 0);
                b = ((m + 1 <= len - 1 && n - 1 >= 0) ? maxValue[m + 1][n - 1]
                        : 0);
                c = ((n - 2 >= 0) ? maxValue[m][n - 2] : 0);
                maxValue[m][n] = Math.max(array[m] + Math.min(a, b), array[n]
                        + Math.min(b, c));
            }
        }
        printMove(maxValue, array, len);
        return maxValue[0][len - 1];
    }

    public static void printMove(int maxVal[][], int array[], int len) {
        boolean myturn = true;
        int m = 0, n = len - 1;
        while (m <= n) {
            int P1 = maxVal[m + 1][n];
            int P2 = maxVal[m][n - 1];
            System.out.println((myturn ? "I" : "You") + " take coin no. ");
            if (P1 <= P2) {
                System.out.println(m + 1 + " (" + array[m] + ")");
                m++;
            } else {
                System.out.println(n + 1 + " (" + array[n] + ")");
                n--;
            }
            System.out.println((myturn ? ", " : ".\n"));
            myturn = !myturn;
        }
    }
    
}
