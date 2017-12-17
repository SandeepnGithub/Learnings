public class PermutationString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length() - 1;
		PermutationString permutationString = new PermutationString();
		permutationString.permute(str, 0, n);
	}

	private void permute(String str, int l, int n) {
		if (l == n) {
			System.out.println(str);
		} else {
			for (int i = l; i <= n; i++) {
				str = swap(str, l, i);
			  System.out.println(i + " After swap " + str);
				permute(str, l + 1, n);
				str = swap(str, l, i);
			  System.out.println(i + " After 2 swap " + str);
			}
		}

	}

	private String swap(String str, int l, int i) {
		char[] ch = str.toCharArray();
		char temp = ch[l];
		ch[l] = ch[i];
		ch[i] = temp;
		return String.valueOf(ch);

	}
}
