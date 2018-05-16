/*
 * TreeNode definition: 
 * class TreeNode {
 * 		int data;
 * 		TreeNode left;
 * 		TreeNode right;
 * }
 */

public class MirrorImageOfBinaryTree {
	public static void convertToMirror(TreeNode root) {
	    TreeNode temp=root;
		int depth = findDepth(root);
	//	System.out.println(depth);
		for(int i=depth-1;i>0;i--){
		    treelevelTraverse(i,1,temp);
		}
	/*	for(int i=0;i<depth;i++){
		    treelevelTraverse1(i,0,temp);
		}*/
		
	}
    public static void treelevelTraverse(int depth,int level,TreeNode root){
	    if(root==null){
	        return;
	    }
	    if(depth==level){
	           TreeNode temp=root.left;
	           root.left=root.right;
	           root.right=temp;
	           return;
	    }
	 //   System.out.println("--"+depth+"---"+level+"--"+root.data);
	    treelevelTraverse(depth,level+1,root.left);
	    treelevelTraverse(depth,level+1,root.right);
	}
	
	 public static void treelevelTraverse1(int depth,int level,TreeNode root){
	    if(root==null){
	        return;
	    }
	    if(depth==level){
	         System.out.print(root.data+" ");
	           return;
	    }
	   // System.out.println("---------------"+depth+"----------"+level+"==="+root.data);
	    treelevelTraverse1(depth,level+1,root.left);
	    treelevelTraverse1(depth,level+1,root.right);
	}
	
	public static int findDepth(TreeNode root){
	    if(root==null){
	        return 0;
	    }
	    return(1+(Math.max(findDepth(root.left),findDepth(root.right))));
	}
}
