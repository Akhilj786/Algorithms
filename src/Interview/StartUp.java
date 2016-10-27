package Interview;

/**
 * Created by AkhilJain on 10/24/16.
 */
public class StartUp {
    public StartUp() {
    }

    public void callFunc() {
        int[][] var1 = new int[][]{{1, 1, 0, 0, 1}, {1, 0, 0, 1, 0}, {1, 1, 0, 1, 0}, {0, 0, 1, 0, 0}};
        System.out.println("Total Group:" + countGroups(var1));
        int[] var2 = new int[]{1, 2, 10, 0, 9};
        System.out.println("Maximum Profit:" + maxProfit(var2));
    }

    public static int countGroups(int[][] var0) {
        int var1 = 0;
        int var2 = var0.length - 1;
        int var3 = var0[0].length - 1;

        for(int var4 = 0; var4 < var0.length; ++var4) {
            for(int var5 = 0; var5 < var0[0].length; ++var5) {
                if(var0[var4][var5] == 1) {
                    makeAdjacentZero(var0, var4, var5, var2, var3);
                    ++var1;
                }
            }
        }

        return var1;
    }

    public static void makeAdjacentZero(int[][] var0, int var1, int var2, int var3, int var4) {
        if(var1 < var3 && var0[var1 + 1][var2] == 1) {
            var0[var1 + 1][var2] = 0;
            makeAdjacentZero(var0, var1 + 1, var2, var3, var4);
        }

        if(var2 < var4 && var0[var1][var2 + 1] == 1) {
            var0[var1][var2 + 1] = 0;
            makeAdjacentZero(var0, var1, var2 + 1, var3, var4);
        }

        if(var1 > 0 && var0[var1 - 1][var2] == 1) {
            var0[var1 - 1][var2] = 0;
            makeAdjacentZero(var0, var1 - 1, var2, var3, var4);
        }

        if(var2 > 0 && var0[var1][var2 - 1] == 1) {
            var0[var1][var2 - 1] = 0;
            makeAdjacentZero(var0, var1, var2 - 1, var3, var4);
        }

    }

    public static int maxProfit(int[] var0) {
        int var1 = var0[0];
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;

        for(int var5 = 1; var5 < var0.length; ++var5) {
            if(var0[var5] - var1 > var3) {
                var3 = var0[var5] - var1;
                if(var0[var5] > var2) {
                    var2 = var0[var5];
                    var4 = var1;
                }
            }

            if(var0[var5] < var1) {
                var1 = var0[var5];
            }
        }

        System.out.println("Buy:" + var4 + " Sell:" + var2);
        return var3;
    }
}