package com.Thread;
/*
Wait  and Notify Method:
_________________________________________________________________
1. wait and notify method can be called only in synchronized method
2. after calling the wait method the thread will release the lock  immediately enter into the waiting state 
3. after calling the notify method the thread will not release the lock immmediately 

Output:
________________________________

Main Method calling the wait state
Child thread executing calculation
Child thread giving notification
Main Method received  the notification
Total 55

*/
public class ThreadWaitAndNotifyExample{
    public static void main(String args[])throws Exception {
     Mythread mythread=new Mythread();
     mythread.start();
     synchronized(mythread){
           System.out.println("Main Method calling the wait state");
           mythread.wait();
           System.out.println("Main Method received  the notification");
           System.out.println("Total "+mythread.total);
     }
    
    }
}
class Mythread extends Thread{
  int total=0;
    
    public void run(){
       synchronized(this){
           System.out.println("Child thread executing calculation");
           for(int i=1;i<=10;i++){
           total=total+i;
           }
           System.out.println("Child thread giving notification");
           this.notify();
      }
       
    }
}
