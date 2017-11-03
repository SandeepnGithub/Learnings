public class SubMatrix {

	public static void main(String arg[]) {
		int matrix[][] = { { 1, 1, 0, 0, 1, 1 }, 
				           { 0, 0, 1, 0, 1, 1 },
				           { 1, 1, 1, 1, 1, 0 }, 
				           { 1, 1, 1, 1, 1, 1 },
				           { 1, 1, 1, 1, 1, 1 }, 
				           { 0, 1, 1, 1, 1, 1 },
				           { 1, 0, 0, 0, 1, 1 } 
				           };
		int count = 0;
		int r = matrix.length;
		int c = matrix[0].length;
		int[][] temp = new int[matrix.length][matrix[0].length];
		for (int i = 0; i <r; i++) {
			for (int j = 0; j < c; j++) {
				if (i == 0 || j == 0) {
					temp[i][j] = matrix[i][j];
					count = temp[i][j] > count ? temp[i][j] : count;
				} else if (matrix[i][j] == 0) {
					temp[i][j] = 0;
				} else {
					temp[i][j] = Min(temp[i - 1][j - 1], temp[i - 1][j],
							temp[i][j - 1]) + 1;
					if (temp[i][j] > count) {
						count = temp[i][j];
					}
				}
			}
		}
		System.out.println(count);
	}

	public static int Min(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		} else if (b <= a && b <= c) {
			return b;
		} else {
			return c;
		}
	}
}
