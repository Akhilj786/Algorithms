package Strings;

/**
 * Created by AkhilJain on 12/5/16.
 *
 * Interview Cake FB Question: https://www.interviewcake.com/question/python/find-rotation-point?
 */
public class RotatedWords {
    public static void main(String[] args) {
        String words[] = {"ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "asymptote",
                "babka",
                "banoffee",
                "engender",
                "karpatka",
                "othellolagkage"};
        int findRotation=findRotateMax(words);
        System.out.println("Rotation found at:"+(findRotation+1)%words.length);

    }

    public static int findRotateMax(String a[]) {
        if (a[0].compareToIgnoreCase(a[a.length - 1]) < 0)
            return a.length - 1;

        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            /*
			 * if(left==right) return left;
			 *
			 *
			 * if(a[left]>a[mid]) right=mid-1; else left=mid+1;
			 */
            int mid = (left + right) / 2;
            if (a[left].compareToIgnoreCase(a[mid]) > 0) {
                if (a[mid - 1].compareToIgnoreCase(a[mid]) > 0)
                    return mid - 1;
                else
                    right = mid - 1;

            } else {
                if (a[mid].compareToIgnoreCase(a[mid + 1]) > 0)
                    return mid;
                else
                    left = mid + 1;
            }

        }
        return -1;

    }

}
