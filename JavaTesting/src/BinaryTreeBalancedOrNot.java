/**
Ref Link:
https://www.youtube.com/watch?v=yEwSGhSsT0U

***/
public class BinaryTreeBalancedOrNot {
  public static void main(String args[])
    {
        BinaryTreeBalancedOrNot tree = new BinaryTreeBalancedOrNot();
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
 
        if (tree.isBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
        System.out.println("---------------------Another Way-----------------------------------------------");
       if (tree.isBSTAnotherWay(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
    
    public static boolean isBST(Node root){
        if(root==null){
            return true;
        }
        if(!isLeftBST(root.left,root.data)||!isRightBST(root.right,root.data)||!isBST(root.left)||!isBST(root.right)){
            return false;
        }
        return true;
    }
    
    public static boolean isLeftBST(Node root,int data){
        if(root==null){
            return true;
        }
       if(root.data < data && isLeftBST(root.left,data) && isLeftBST(root.right,data)){
           return true;
       }
       return false;
    }
     public static boolean isRightBST(Node root,int data){
        if(root==null){
            return true;
        }
       if(root.data>data && isRightBST(root.right,data) && isRightBST(root.left,data)){
           return true;
       }
       return false;
    }
    
    public static boolean isBSTAnotherWay(Node root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.data < max && root.data > min && isBSTAnotherWay(root.left,min,root.data) && isBSTAnotherWay(root.right,root.data,max)){
            return true;
        }
        return false;
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
