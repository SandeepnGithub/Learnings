public class Islands {
	int[] index = new int[] { -1, 0, 1 };

	public static void main(String arg[]) {
		int[][] matrix = { { 1, 0, 1, 0, 1 }, { 1, 1, 0, 0, 0 },
				{ 0, 1, 0, 1, 1 }, };
		Islands islands = new Islands();
		System.out.println(islands.countNoOfIslands(matrix));
	}

	private int countNoOfIslands(int[][] matrix) {
		int count = 0;
		boolean[][] isVisited = new boolean[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1 && !isVisited[i][j]) {
					count = count + 1;
					doDFS(matrix, isVisited, i, j);
				}
			}
		}
		return count;
	}

	private void doDFS(int[][] matrix, boolean[][] isVisited, int i, int j) {
		if (isVisited[i][j]) {
			return;
		}
		isVisited[i][j] = true;
		int koffset, loffset;
		for (int k = 0; k < index.length; k++) {
			koffset = index[k];
			for (int l = 0; l < index.length; l++) {
				loffset = index[l];
				if (koffset == 0 && loffset == 0) {
					continue;
				}

				if (checkneighbors(matrix, i + koffset, j + loffset)) {
					doDFS(matrix, isVisited, i + koffset, j + loffset);
				}
			}
		}

	}

	private boolean checkneighbors(int[][] matrix, int i, int j) {
		if ((i >= 0) && (i < matrix.length) && (j >= 0)
				&& (j < matrix[0].length)) {
			if (matrix[i][j] == 1) {
				return true;
			}
		}
		return false;
	}

}
