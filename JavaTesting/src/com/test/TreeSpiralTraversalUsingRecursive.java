package com.test;

public class TreeSpiralTraversalUsingRecursive {

	public static void main(String arg[]) {
		TreeSpiralTraversalUsingRecursive spiralTraversal = new TreeSpiralTraversalUsingRecursive();
		Node node_0 = new Node(0);
		Node node_1 = new Node(1);
		Node node_2 = new Node(2);
		Node node_3 = new Node(3);
		Node node_4 = new Node(4);
		Node node_5 = new Node(5);
		Node node_6 = new Node(6);
		Node node_7 = new Node(7);
		Node node_8 = new Node(8);
		Node node_9 = new Node(9);
		node_0.left = node_1;
		node_0.right = node_2;

		node_1.left = node_4;
		node_1.right = node_5;

		node_2.left = node_3;
		node_2.right = node_6;

		node_5.left = node_7;
		node_5.right = node_8;

		node_6.left = node_9;
		int depth = spiralTraversal.finddepth(node_0);
		boolean righttofalse = true;
		for (int level = 0; level < depth; level++) {
			spiralTraversal.printnodes(node_0, 0, level, righttofalse);
			righttofalse = !righttofalse;
		}

	}

	private void printnodes(Node node, int i, int level, boolean righttofalse) {
		if (node == null) {
			return;
		}
		if (i == level) {
			System.out.print(" " + node.nodeVal);
			return;
		}

		if (righttofalse) {
			printnodes(node.right, i + 1, level, righttofalse);
			printnodes(node.left, i + 1, level, righttofalse);

		} else {
			printnodes(node.left, i + 1, level, righttofalse);
			printnodes(node.right, i + 1, level, righttofalse);
		}
	}

	private int finddepth(Node node_0) {
		if (node_0 == null) {
			return 0;
		}
		return (1 + Math.max(finddepth(node_0.left), finddepth(node_0.right)));
	}

}

class Node {
	int nodeVal;
	Node left;
	Node right;

	Node(int val) {
		this.nodeVal = val;

	}
}
