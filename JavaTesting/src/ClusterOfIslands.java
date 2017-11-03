public class ClusterOfIslands {
	int[] indexes = new int[] { -1, 0, 1 };

	public static void main(String arg[]) {
		int[][] matrix = { { 1, 0, 1, 0, 1 }, { 1, 1, 0, 0, 0 },
				{ 0, 1, 0, 1, 1 }, };
		ClusterOfIslands clusterOfIslands = new ClusterOfIslands();

		System.out.println(clusterOfIslands.findNumberofClusters(matrix));
	}

	private int findNumberofClusters(int[][] matrix) {
		int count = 0;
		boolean[][] isVisited = new boolean[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1 && !isVisited[i][j]) {
					count += 1;
					dodfs(matrix, i, j, isVisited);
				}

			}
		}
		return count;
	}

	public void dodfs(int matrix[][], int i, int j, boolean[][] isVisited) {
		if (isVisited[i][j]) {
			return;
		}
		isVisited[i][j] = true;
		int koffset = 0, loffset = 0;
		for (int k = 0; k < indexes.length; k++) {
			koffset = indexes[k];
			for (int l = 0; l < indexes.length; l++) {
				loffset = indexes[l];
				if (koffset == 0 && loffset == 0) {
					continue;
				}
				if (checkNeighbours(matrix, i + koffset, j + loffset)) {
					dodfs(matrix, i + koffset, j + loffset, isVisited);
				}
			}
		}
	}

	private boolean checkNeighbours(int[][] matrix, int i, int j) {
		if ((i >= 0) && (i < matrix.length) && (j >= 0)
				&& (j < matrix[0].length)) {
			if (matrix[i][i] == 1) {
				return true;
			}
		}
		return false;
	}
}
