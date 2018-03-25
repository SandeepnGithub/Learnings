/***
ref:https://www.geeksforgeeks.org/wp-content/uploads/2009/06/tree12.gif

    (a) Inorder (Left, Root, Right) : 4 2 5 1 3
    (b) Preorder (Root, Left, Right) : 1 2 4 5 3
    (c) Postorder (Left, Right, Root) : 4 5 2 3 1
    LevelOrder based on depth:
    1 2 3 4 5
    Spiral Traversal:
    0 1 2 6 3 5 4 7 8 9
ref:https://www.ideserve.co.in/learn/spiral-level-order-traversal-of-a-binary-tree-set-2
    
Output:
______________________________________________________

--------------------Inorder Traversal----------------------------
4 2 5 1 3 
--------------------Preorder Traversal----------------------------
1 2 4 5 3 
--------------------Postorder Traversal----------------------------
4 5 2 3 1 
--------------------Level order Traversal----------------------------
1 2 3 4 5 
--------------------Spiral order Traversal----------------------------
0 1 2 6 3 5 4 7 8 9



*****/


public class BinarySearchTreeTraversal {
    Node root;
    public static void main(String args[]) {
        BinarySearchTreeTraversal tree = new BinarySearchTreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("--------------------Inorder Traversal----------------------------");
        inOrdertreetraversal(tree.root);
        System.out.println("");
        System.out.println("--------------------Preorder Traversal----------------------------");
        preOrdertreetraversal(tree.root);
        System.out.println("");
        System.out.println("--------------------Postorder Traversal----------------------------");
        postOrdertreetraversal(tree.root);
        System.out.println("");
        System.out.println("--------------------Level order Traversal----------------------------");
        int depth=findDepth(tree.root);
        for(int i=0;i<depth;i++)
        levelOrderTraversal(tree.root,0,i);
        System.out.println("");
        System.out.println("--------------------Spiral order Traversal----------------------------");
        BinarySearchTreeTraversal tree2 = new BinarySearchTreeTraversal();
        tree2.root = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
         
        tree2.root.left  = n1;
        tree2.root.right = n2;
         
        n1.left  =  n4;
        n1.right = n5;
         
        n2.left  = n3;
        n2.right = n6;
 
        n5.left  = n7;
        n5.right = n8;
         
        n6.left  = n9;
        boolean lefttoright=false;
        int spiraldepth=findDepth(tree2.root);
     //   System.out.println("------------"+spiraldepth);
        for(int i=0;i<spiraldepth;i++){
             spirallevelOrderTraversal(tree2.root,0,i,lefttoright);
              lefttoright=!lefttoright;
        }
       
        System.out.println("");
        
    }
    public static void inOrdertreetraversal(Node root){
        if(root==null){
            return;
        }
        inOrdertreetraversal(root.left);
        System.out.print(root.data+" ");
        inOrdertreetraversal(root.right);
        
    }
    public static void preOrdertreetraversal(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preOrdertreetraversal(node.left);
        preOrdertreetraversal(node.right);
    }
    public static void postOrdertreetraversal(Node node){
        if(node==null){
            return;
        }
        postOrdertreetraversal(node.left);
        postOrdertreetraversal(node.right);
        System.out.print(node.data+" ");
       
    }
    
    public static int findDepth(Node node){
        if(node==null){
            return 0;
        }
        return (1+(Math.max(findDepth(node.left),findDepth(node.right))));
    }
    
    public static void levelOrderTraversal(Node node,int level,int maxlevel){
        if(node==null){
            return;
        }
        if(level==maxlevel){
            System.out.print(node.data+" ");
            return;
        }
        levelOrderTraversal(node.left,level+1,maxlevel);
        levelOrderTraversal(node.right,level+1,maxlevel);
    }
    
     public static void spirallevelOrderTraversal(Node node,int level,int maxlevel,boolean lefttoright){
        if(node==null){
            return;
        }
        if(level==maxlevel){
            System.out.print(node.data+" ");
            return;
        }
        if(!lefttoright){
         spirallevelOrderTraversal(node.right,level+1,maxlevel,lefttoright);
         spirallevelOrderTraversal(node.left,level+1,maxlevel,lefttoright);
        }else{
         spirallevelOrderTraversal(node.left,level+1,maxlevel,lefttoright);
         spirallevelOrderTraversal(node.right,level+1,maxlevel,lefttoright);
        }
       
       
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
