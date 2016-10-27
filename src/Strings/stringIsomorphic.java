package Strings;

/**
 * Created by AkhilJain on 10/24/16.
 */
import java.util.Hashtable;

public class stringIsomorphic {
    public stringIsomorphic() {
    }

    public boolean checkIsomorphic(String var1, String var2) {
        int var3 = var1.length();
        int var4 = var1.length();
        if(var3 != var4) {
            return false;
        } else {
            Hashtable var5 = new Hashtable();

            for(int var6 = 0; var6 < var3; ++var6) {
                char var7 = var1.charAt(var6);
                char var8 = var2.charAt(var6);
                if(!var5.containsKey(Character.valueOf(var7)) && !var5.containsValue(Character.valueOf(var8))) {
                    var5.put(Character.valueOf(var7), Character.valueOf(var8));
                }

                if(var5.get(Character.valueOf(var7)) == null) {
                    return false;
                }

                if(!((Character)var5.get(Character.valueOf(var7))).equals(Character.valueOf(var8))) {
                    return false;
                }
            }

            return true;
        }
    }
}

