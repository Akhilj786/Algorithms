package Greedy;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

//http://www.geeksforgeeks.org/greedy-algorithms-set-1-activity-selection-problem/
public class ActivitySelection {

	public static void main(String[] args) {
		int start[] = { 1, 3, 0, 5, 8, 5 };
		int end[] = { 2, 4, 6, 7, 9, 9 };

		ArrayList<Activity> activityList = fillActivity(start, end);
		
		selectActivityMax(activityList);
	}

	public static ArrayList<Activity> fillActivity(int start[], int end[]) {
		ArrayList<Activity> activityList = new ArrayList<Activity>(start.length);
		for (int i = 0; i < start.length; i++) {
			Activity act = new Activity(start[i], end[i]);
			activityList.add(act);
		}
		Collections.sort(activityList, new A());
		return activityList;
	}

	public static void selectActivityMax(ArrayList<Activity> blist) {
		int count = 0;
		int plast = -1;
		for (Activity a : blist) {
			int current_start = a.start;
			if (count == 0) {
				System.out.println(a);
				plast = a.end;
				count++;
			} else {
				if (current_start >= plast) {
					System.out.println(a);
					plast = a.end;
				}
			}
		}

	}

	public static void printB(ArrayList<Activity> blist) {
		for (Activity b : blist) {
			System.out.println(b);
		}
	}

}

class A implements Comparator<Activity> {
	@Override
	public int compare(Activity b1, Activity b2) {
		return (b1.end - b2.end);
	}
}

class Activity {
	int start;
	int end;

	public Activity(int x, int y) {
		this.start = x;
		this.end = y;
	}

	public String toString() {
		return (this.start + "-" + this.end);
	}
}
