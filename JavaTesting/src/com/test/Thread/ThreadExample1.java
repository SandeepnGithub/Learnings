package com.Thread;
/*

With two threads and one  display objects
Output:
_________________________________
Good Morning Test1
Good Morning Test1
Good Morning Test2
Good Morning Test2


*/
public class ThreadExample1 {
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
    public synchronized void hello(String name){
        try{
            for(int i=0;i<2;i++){
            System.out.println("Good Morning "+name);
            Thread.sleep(1000);
            }
        }catch(Exception ex){
        }
        
    }    
}