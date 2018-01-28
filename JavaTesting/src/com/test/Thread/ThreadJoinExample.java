package com.Thread;
/*
Join Method:

Join method wen called on another thread will put the current thread on hold and enters into waiting state and will wait until thread scheduler gives
an oppurtuinity ,after the child thread completes and then rest of the threads starts executing

Output:
_________________________________
Without Join
_______________________________
Total 0
With Join
______________________
Total 55




*/
public class ThreadJoinExample {
    public static void main(String args[])throws Exception {
     Mythread mythread=new Mythread();
     mythread.start();
     mythread.join();
     System.out.println("Total "+mythread.total);
    }
}
class Mythread extends Thread{
  int total=0;
    
    public void run(){
       for(int i=1;i<=10;i++){
           total=total+i;
       }
    }
}
