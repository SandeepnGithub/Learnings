package com.Thread;
import java.util.concurrent.locks.*;
/*

Without using the synchronised keyword we are using the ReentrantLock class for getting the lock and unlock

Output:
_________________________________
Good Morning Test1
Good Morning Test1
Good Morning Test2
Good Morning Test2


*/
public class ReentrantLockExample{
    public static void main(String args[]) {
     Display d=new Display();
     Mythread mythread=new Mythread("Test1",d);
     Mythread mythread2=new Mythread("Test2",d);
     mythread.start();
     mythread2.start();
    }
}
class Mythread extends Thread{
    public String name;
    public Display display;
    public Mythread(String name,Display display){
        this.name=name;
        this.display=display;
    }
    public void run(){
        display.hello(name);
    }
}

class Display{
    ReentrantLock l=new ReentrantLock();
    public  void hello(String name){
        
        try{
            l.lock();
            for(int i=0;i<2;i++){
            System.out.println("Good Morning "+name);
            Thread.sleep(1000);
            }
            l.unlock();
        }catch(Exception ex){
        }
        
    }    
}
