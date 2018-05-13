/*****
Given Linked list
1
2
3
4
5
6
7
8
9
10

Reversed linked list 
3
2
1
6
5
4
9
8
7
10


*******/


public class ReverseLinkedListInKthNode {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node reverseInKthNode(Node node,int k){
        Node current=node;
        Node previous=null;
        Node next=null;
        int count=0;
        while(current!=null && count < k){
           next=current.next;
           current.next=previous;
           previous=current;
           current=next;
           count++;
        }
        if(next!=null)
        node.next=reverseInKthNode(next,k);
        return previous;
        
    }
	public void printList(Node head){
	   while(head!=null){
	       System.out.println(head.data);
	       head=head.next;
	   }
	    
	}
	public static void main(String[] args) {
        ReverseLinkedListInKthNode list = new ReverseLinkedListInKthNode();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);
        list.head.next.next.next.next.next.next.next.next = new Node(9);
        list.head.next.next.next.next.next.next.next.next.next = new Node(10);
         
        System.out.println("Given Linked list");
        list.printList(list.head);
        head = ReverseLinkedListInKthNode.reverseInKthNode(list.head ,3);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(list.head );
        
    }

}
