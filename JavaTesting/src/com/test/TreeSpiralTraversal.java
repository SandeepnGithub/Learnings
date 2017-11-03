package com.test;

import java.util.Stack;

public class TreeSpiralTraversal {
	public static void main(String arg[]) {
		TreeSpiralTraversal spiralTraversal = new TreeSpiralTraversal();
		NodeClass node_0 = new NodeClass(0);
		NodeClass node_1 = new NodeClass(1);
		NodeClass node_2 = new NodeClass(2);
		NodeClass node_3 = new NodeClass(3);
		NodeClass node_4 = new NodeClass(4);
		NodeClass node_5 = new NodeClass(5);
		NodeClass node_6 = new NodeClass(6);
		NodeClass node_7 = new NodeClass(7);
		NodeClass node_8 = new NodeClass(8);
		NodeClass node_9 = new NodeClass(9);
		node_0.left = node_1;
		node_0.right = node_2;

		node_1.left = node_4;
		node_1.right = node_5;

		node_2.left = node_3;
		node_2.right = node_6;

		node_5.left = node_7;
		node_5.right = node_8;

		node_6.left = node_9;
		spiralTraversal.display(node_0);
	}

	private void display(NodeClass node) {
		boolean iseven = true;
		Stack<NodeClass> stackEven = new Stack<>();
		Stack<NodeClass> stackOdd = new Stack<>();
		stackEven.push(node);
		while ((iseven && !stackEven.empty()) || !stackOdd.empty()) {

			if (iseven) {
				while (!stackEven.empty()) {
					NodeClass nodeClass = stackEven.pop();
					System.out.print(" " + nodeClass.nodeVal);
					if (nodeClass.right != null) {
						stackOdd.push(nodeClass.right);
					}
					if (nodeClass.left != null) {
						stackOdd.push(nodeClass.left);
					}

				}
			} else {
				while (!stackOdd.empty()) {
					NodeClass nodeClass = stackOdd.pop();
					System.out.print(" " + nodeClass.nodeVal);
					if (nodeClass.left != null) {
						stackEven.push(nodeClass.left);
					}

					if (nodeClass.right != null) {
						stackEven.push(nodeClass.right);
					}
				}

			}
			iseven = !iseven;
		}

	}
}

class NodeClass {
	int nodeVal;
	NodeClass left;
	NodeClass right;

	NodeClass(int val) {
		this.nodeVal = val;
	}
}