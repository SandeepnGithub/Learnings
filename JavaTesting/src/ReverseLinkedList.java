/*****
Output:
Given Linked list
85
15
4
20

Reversed linked list 
20
4
15
85
Recursive linked list 
85
15
4
20

*******/


public class ReverseLinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
	public static Node reverseIterative(Node head){
	  Node current=head,next=null,prev=null;
	  while(current!=null){
	    next=current.next;
		current.next=prev;
		prev=current;
		current=next;
	  }
	  head=prev;
	  return head;
	}
	public static void reverseRecursive(Node current){
	 if(current==null){
	     return;
	 }
	 if(current.next==null){
	     head=current;
	     return;
	 }
	 reverseRecursive(current.next);
	 Node prev=current.next;
	 prev.next=current;
	 current.next=null;
	}
	public void printList(Node head){
	   while(head!=null){
	       System.out.println(head.data);
	       head=head.next;
	   }
	    
	}
	public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
         
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverseIterative(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
        System.out.println("Recursive linked list ");
        reverseRecursive(head);
        list.printList(head);
        
    }

}
