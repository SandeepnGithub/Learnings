/*

IdeserveQuestion
 * TreeNode definition: 
 * class TreeNode {
 * 		int data;
 * 		TreeNode left;
 * 		TreeNode right;
 * }
 */

public class BinaryTreesAreIdentical {
	public static boolean areIdenticalTrees(TreeNode root1, TreeNode root2) {
	   if(root1!=null && root2!=null && root1.data==root2.data && 
	      checkIdenticalleftSubtress(root1.left,root2.left) && 
	      checkIdenticalRightSubtress(root1.right,root2.right)){
	       return true;
	   }
	   return false;
	}
	
	public static boolean checkIdenticalleftSubtress(TreeNode root1,TreeNode root2){
	   if(root1 ==null && root2 == null){
	       return true;
	   } 
	   if(root1 !=null && root2 != null && root1.data==root2.data &&
	      checkIdenticalleftSubtress(root1.left,root2.left) && 
	      checkIdenticalleftSubtress(root1.right,root2.right)){
            return true;	       
	   }
	   return false;
	   }
	public static boolean checkIdenticalRightSubtress(TreeNode root1,TreeNode root2){
	   if(root1 ==null && root2 == null){
	       return true;
	   }
	   if(root1!=null && root2!=null && root1.data==root2.data &&
	      checkIdenticalRightSubtress(root1.left,root2.left) && 
	      checkIdenticalRightSubtress(root1.right,root2.right)){
            return true;	       
	   }
	   return false;
	   }
	}
