package com.Thread;
/*
Yield Method:
Once Thread yield executes will put the child thread in waiting state and gives options to another threads with same priority
Output:
________________________________

Total 1
Thread Total 55


*/
public class ThreadYieldExample {
    public static void main(String args[])throws Exception {
     Mythread mythread=new Mythread();
     mythread.start();
     System.out.println("Total "+mythread.total);
    }
}
class Mythread extends Thread{
  int total=0;
    
    public void run(){
       for(int i=1;i<=10;i++){
           total=total+i;
           Thread.yield();
       }
        System.out.println("Thread Total "+ total);
    }
}
