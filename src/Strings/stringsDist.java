package Strings;

/**
 * Created by AkhilJain on 10/24/16.
 */
public class stringsDist {
    public stringsDist() {
    }

    public void minDist(String[] var1, String var2, String var3) {
        int[] var4 = new int[var1.length];
        int var5 = 0;
        String[] var6 = var1;
        int var7 = var1.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6[var8];
            if(var9.equals(var2)) {
                var4[var5++] = 1;
            } else if(var9.equals(var3)) {
                var4[var5++] = 2;
            } else {
                var4[var5++] = 0;
            }
        }

        System.out.println(this.minStringsDist(var4, 1, 2));
    }

    public int minStringsDist(int[] var1, int var2, int var3) {
        int var4 = 2147483647;
        int var5 = 0;

        int var6;
        for(var6 = 0; var6 < var1.length; ++var6) {
            if(var1[var6] == var2 || var1[var6] == var3) {
                var5 = var6;
                break;
            }
        }

        for(var6 = var5 + 1; var6 < var1.length; ++var6) {
            if(var1[var6] == var2 || var1[var6] == var3) {
                if(var1[var5] != var1[var6] && var6 - var5 < var4) {
                    var4 = var6 - var5;
                }

                var5 = var6;
            }
        }

        return var4;
    }
}

