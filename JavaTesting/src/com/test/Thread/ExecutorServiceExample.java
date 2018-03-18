import java.util.concurrent.locks.*;
import java.util.concurrent.*;
/*
Executor Service Example


Output:
_________________________________
Good Morning Executed by pool-1-thread-1
Good Morning Executed by pool-1-thread-2
Good Morning Executed by pool-1-thread-3
Good Morning Completed by pool-1-thread-1
Good Morning Completed by pool-1-thread-2
Good Morning Completed by pool-1-thread-3
Good Morning Executed by pool-1-thread-3
Good Morning Completed by pool-1-thread-3


*/
public class ExecutorServiceExample{
    public static void main(String args[]) {
      ExecutorService es=Executors.newFixedThreadPool(3);
      Mythread[] mythreads={
          new Mythread("James"),
            new Mythread("Patrick"),
              new Mythread("Billa"),
                new Mythread("David")
      };
      for(Mythread mythread:mythreads){
          es.submit(mythread);
      }
      es.shutdown();
    }
}
class Mythread implements Runnable{
    public String name;
  
    public Mythread(String name){
        this.name=name;
    }
    public void run(){
       
           try{
            System.out.println("Good Morning Executed by "+Thread.currentThread().getName());
            Thread.sleep(1000);
           }catch(Exception ex){
          }
        System.out.println("Good Morning Completed by "+Thread.currentThread().getName());
    }
}
