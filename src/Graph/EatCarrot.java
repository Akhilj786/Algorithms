package Graph;

// https://github.com/checkcheckzz/coding-questions/blob/master/problem/Graph/How%20many%20carrots%20can%20the%20rabbit%20eat.cpp
public class EatCarrot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(eatCarrot(3, 3, 4));
	}

	public static int eatCarrot(int x, int y, int len) {
		int result = 0;

		for (int i = 0; i < len; ++i) {

			for (int j = 0; j < len; ++j) {

				int diffx = x - i;
				int diffy = y - j;

				if (diffx == 0 && diffy != 0) {

					result++;

				} else if (diffy == 0 && diffx != 0) {

					result++;

				} else if ((diffx != 0 && diffy != 0)
						&& (diffy / diffx == 1 || diffy / diffx == -1)) {

					result++;

				}

			}

		}

		return result;
	}

}
