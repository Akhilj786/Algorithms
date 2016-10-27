package Arrays;

import java.util.PriorityQueue;

/**
 * Created by AkhilJain on 10/11/16.
 */
public class PrintKCloset {

    public static void main(String args[]) {
        int array[] = {23, 38, 76, 99, 147, 147, 148, 159, 163, 189,
                197, 230, 231, 279, 293, 316, 337, 353, 362,
                393, 398, 399, 419, 449, 450, 459, 463, 487,
                499, 521, 541, 561, 568, 570, 576, 601, 603,
                634, 639, 648, 656, 659, 664, 676, 715, 755,
                763, 793, 800, 808, 817, 829, 831, 852, 883,
                898, 926, 926, 941, 947
        };
        printKCloset(array, 926, 4);

        PriorityQueue<Points> pQueue = new PriorityQueue<>();
        Points[] pArray = new Points[4];
        int x[] = {1, 2, 3, 2};
        int y[] = {2, 1, 3, 2};
        int k = 1;
        for (int i = 0; i < pArray.length; i++) {
            pArray[i] = new Points(x[i], y[i]);
        }

        closetPoints(pArray, pQueue, k);


    }

    public static void printKCloset(int array[], int x, int k) {
        int left = findIndex(array, x, 0, array.length - 1);
        int right = left + 1;
        int count = 0;

        if (array[left] == x)
            left--;

        while (left >= 0 && right < array.length && count < k) {
            if (x - array[left] < array[right] - x)
                System.out.println(array[left--] + " ");
            else
                System.out.println(array[right++] + " ");
            count++;
        }
        while (count < k && left >= 0) {
            System.out.println(array[left--] + " ");
            count++;
        }
        while (count < k && right < array.length) {
            System.out.println(array[right++] + " ");
            count++;
        }

    }

    public static int findIndex(int array[], int x, int low, int high) {
        if (array[high] <= x)
            return high;
        if (array[low] > x)
            return low;

        int mid = (low + high) / 2;
        if (array[mid] == x)
            return mid;
        else if (array[mid] > x)
            return findIndex(array, x, low, high - 1);
        else
            return findIndex(array, x, low + 1, high);
    }

    public static void closetPoints(Points[] pointList, PriorityQueue<Points> queue, int k) {
        for (Points p : pointList) {
            if (queue.size() == k && p.compareTo(queue.peek()) > 0)
                queue.poll(); // remove least element, current is better
            if (queue.size() < k) // we removed one or haven't filled up, so add
                queue.add(p);
        }

        for (Points p : queue) {
            System.out.print(p + ",");
        }

    }


}

class Points implements Comparable<Points> {
    int x;
    int y;

    Points(int a, int b) {
        this.x = a;
        this.y = b;
    }

    @Override
    public int compareTo(Points o1) {
        double dist1 = calculateDist(this);
        double dist2 = calculateDist(o1);
        return (int) (dist1 - dist2);

    }

    public double calculateDist(Points o1) {
        return (Math.sqrt(Math.pow(o1.x - 0, 2) + Math.pow(o1.y - 0, 2)));
    }

    @Override
    public String toString() {
        return "{" + this.x + "," + this.y + "}";
    }

}

