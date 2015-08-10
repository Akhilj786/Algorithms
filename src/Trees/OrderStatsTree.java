package Trees;

public class OrderStatsTree {
	int data;
	int size;
	OrderStatsTree left;
	OrderStatsTree right;

	public OrderStatsTree(int val) {
		this.size=1;
		this.data = val;
		this.left = null;
		this.right = null;
	}
}
