import java.util.Stack;

public class LeastCommonAncestor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LeastCommonAncestor leastCommonAncestor = new LeastCommonAncestor();
		TreeNode treeNode5 = new TreeNode(5);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode6 = new TreeNode(6);
		TreeNode treeNode0 = new TreeNode(0);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode9 = new TreeNode(9);
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode7 = new TreeNode(7);
		TreeNode treeNode8 = new TreeNode(8);

		treeNode5.left = treeNode2;
		treeNode5.right = treeNode6;

		treeNode2.left = treeNode0;
		treeNode2.right = treeNode3;

		treeNode6.right = treeNode9;

		treeNode0.right = treeNode1;

		treeNode9.left = treeNode7;

		treeNode7.right = treeNode8;
		int depth = leastCommonAncestor.findDepth(treeNode5);
		System.out.println(depth);
		Stack<Integer> stack = leastCommonAncestor.findV1Nodes(treeNode5, 5);
		Stack<Integer> stack2 = leastCommonAncestor.findV1Nodes(treeNode5, 3);
		System.out.println(stack + "----------------" + stack2);
		stack.retainAll(stack2);
		System.out.println("---------Final answer------- " + stack.pop());

	}

	private Stack<Integer> findV1Nodes(TreeNode node, int v1) {
		TreeNode tempNode = node;
		Stack<Integer> stack = new Stack<>();
		while (tempNode != null) {
			if (tempNode.val < v1) {
				stack.add(tempNode.val);
				tempNode = tempNode.right;
			}
			if (tempNode.val > v1) {
				stack.add(tempNode.val);
				tempNode = tempNode.left;
			}
			if (tempNode.val == v1) {
				break;
			}
		}
		stack.add(v1);
		return stack;
	}

	private int findDepth(TreeNode treeNode) {
		if (treeNode == null) {
			return 0;
		}
		return (1 + Math.max(findDepth(treeNode.left),
				findDepth(treeNode.right)));
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
	}
}
