/*.java
->Deamon threads are thread which run in the background eg.Garbage collector
->A thread can be made as Demaon before starting 
->Main Thread cannot be made as Deamon Thread if done it will throw illegalStateException
->Deamon thread will stop the execution once the Main thread is completed find the below example

Outpuut Without Deamon Scenario-1
___________________________________
Main Thread Ended
Child Thread -0
Child Thread -1
Child Thread -2
Child Thread -3
Child Thread -4

Outpuut With Deamon Scenario-2
___________________________________
Main Thread Ended

**/
public class DaemonThread {
    public static void main(String args[]) {
       Mythread mythread=new Mythread();
     //comment for scenario 1 
     mythread.setDaemon(true);
       mythread.start();
       System.out.println("Main Thread Ended");
    }
}
class Mythread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
        try{
            Thread.sleep(1000);
        }catch(Exception ex){}
        System.out.println("Child Thread -"+i);
        }
    }
}
