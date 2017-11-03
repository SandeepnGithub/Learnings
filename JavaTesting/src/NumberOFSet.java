import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOFSet {
	public static void main(String arg[]) {
		int[] array = new int[] { 4, 2, 12, 34, 23, 35, 44, 55 };
		List<Node> listNodes = new ArrayList<>();
		int index = 0;
		for (int a : array) {
			if ((index + 3 - 1) < array.length) {
				listNodes.add(new Node(a));
				Node node = listNodes.get(index);
				List<Integer> listInteger = new ArrayList<>();
				for (int i = index; ((i <= (index + 3 - 1) && ((index + 3 - 1) < array.length))); i++) {
					listInteger.add(array[i]);
				}
				if (listInteger.size() > 0)
					node.list = listInteger;
				index++;
			}

		}

		for (Node node : listNodes) {
			//System.out.println(node.list);
			Collections.sort(node.list);
			int val = node.list.get(node.list.size() - 1);
			System.out.print(val + " ");
		}

	}
}

class Node {
	int val;
	List<Integer> list;

	Node(int val) {
		this.val = val;
	}

}