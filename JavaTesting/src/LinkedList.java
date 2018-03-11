/********
 Output:
--------------AFTER INSERTION---------------------
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
--------------AFTER INSERTION IN BETWEEN THE NODES---------------------
1
2
3
4
5
99
6
7
8
9
10
--------------REMOVING HEAD---------------------
2
3
4
5
99
6
7
8
9
10
--------------REMOVING PARTICULAR NODE---------------------
2
4
5
99
6
7
8
9
10
--------------REMOVING TAIL---------------------
2
4
5
99
6
7
8
9




****************/
import java.util.*;
public class LinkedList {
     Node head;
    public static void main(String args[]) {
        LinkedList linkedList=new LinkedList();
		linkedList.insert(10);
		linkedList.insert(9);
		linkedList.insert(8);
		linkedList.insert(7);
		linkedList.insert(6);
		linkedList.insert(5);
		linkedList.insert(4);
		linkedList.insert(3);
		linkedList.insert(2);
		linkedList.insert(1);
		System.out.println("--------------AFTER INSERTION---------------------");
		Node temp=linkedList.head;
		while(temp!=null){
		System.out.println(temp.val);
		temp=temp.next;
		}
		System.out.println("--------------AFTER INSERTION IN BETWEEN THE NODES---------------------");
		linkedList.insertInBetween(5,99);
		temp=linkedList.head;
		while(temp!=null){
		System.out.println(temp.val);
		temp=temp.next;
		}
		System.out.println("--------------REMOVING HEAD---------------------");
		linkedList.remove(1);
		temp=linkedList.head;
		while(temp!=null){
		System.out.println(temp.val);
		temp=temp.next;
		}
		System.out.println("--------------REMOVING PARTICULAR NODE---------------------");
		linkedList.remove(3);
		temp=linkedList.head;
		while(temp!=null){
		System.out.println(temp.val);
		temp=temp.next;
		}
		System.out.println("--------------REMOVING TAIL---------------------");
		linkedList.remove(10);
		temp=linkedList.head;
		while(temp!=null){
		System.out.println(temp.val);
		temp=temp.next;
		}
    }
	public void insert(int data){
	Node node=new Node(data);
	   if(head==null){
	      head=node;
	   }else{
	      node.next=head;
		  head=node;
	   }
	}
	public void insertInBetween(int after,int data){
	Node node=new Node(data);
	Node temp=head;
	   while(temp.next!=null){
	       if(temp.next.val==after){
	           Node t=temp.next.next;
	           temp.next.next=node;
	           temp.next.next.next=t;
	           break;
	       }else{
	           temp=temp.next;
	       }
	   }
	}
	public void remove(int data){
	   Node temp=head;
	   while(temp.next!=null){
	       if(temp.next.val!=data){
	           temp=temp.next;
	       }else{
	           temp.next=temp.next.next;
	       }
	   }
	   if(head.val==data){
	       head=head.next;
	   }
	}
}
class Node{
    Node next;
    int val;
    Node(int val){
        this.val=val;
    }
}
