package Arrays;

/**
 * Created by AkhilJain on 10/24/16.
 */

import java.util.Arrays;

public class ThreeArrayMinVal {
    int[] array1 = new int[]{1, 5, 9, 11, 15};
    int[] array2 = new int[]{6, 8, 18, 19, 25};
    int[] array3 = new int[]{4, 7, 13, 20};

    public ThreeArrayMinVal() {
    }

    public int minimumVal() {
        int var1 = 2147483647;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Arrays.sort(this.array1);
        Arrays.sort(this.array2);
        Arrays.sort(this.array3);

        while(var2 < this.array1.length && var3 < this.array2.length && var4 < this.array3.length) {
            int var5 = Math.abs(this.array1[var2] - this.array2[var3]) + Math.abs(this.array2[var3] - this.array3[var4]) + Math.abs(this.array3[var4] - this.array1[var2]);
            if(var1 > var5) {
                var1 = var5;
            }

            int var6 = this.findMinIndex(this.array1[var2], this.array2[var3], this.array3[var4]);
            if(var6 == this.array1[var2]) {
                ++var2;
            } else if(var6 == this.array2[var3]) {
                ++var3;
            } else {
                ++var4;
            }
        }

        return var1;
    }

    public int findMinIndex(int var1, int var2, int var3) {
        int var4 = var1;
        if(var1 > var2) {
            var4 = var2;
            if(var2 > var3) {
                var4 = var3;
            }
        } else if(var1 > var3) {
            var4 = var3;
        }

        return var4;
    }
}