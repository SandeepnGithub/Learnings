package com.Thread;
import java.util.concurrent.locks.*;
/*

With using trylock after getting lock the thread will execute the safe operations and the else block will excuted by other threads which didnt get the lock

Output:
_________________________________
Good Morning Executed by Thread-0
Good Morning Executed by In Else Block Thread-1
Good Morning Executed by Thread-0


*/
public class ReentrantLockExample2{
    public static void main(String args[]) {
     Mythread mythread=new Mythread("Test1");
     Mythread mythread2=new Mythread("Test2");
     mythread.start();
     mythread2.start();
    }
}
class Mythread extends Thread{
   static  ReentrantLock l=new ReentrantLock();
    public String name;
  
    public Mythread(String name){
        this.name=name;
    }
    public void run(){
       if(l.tryLock()){
           try{
            for(int i=0;i<2;i++){
            System.out.println("Good Morning Executed by "+Thread.currentThread().getName());
            Thread.sleep(1000);
            }
           }catch(Exception ex){
          }
          l.unlock();
       }else{
             System.out.println("Good Morning Executed by In Else Block "+Thread.currentThread().getName());
       }
       
    }
}
