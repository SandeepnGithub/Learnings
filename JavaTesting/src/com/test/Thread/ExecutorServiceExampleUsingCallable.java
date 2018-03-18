package com.Thread;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;
/*
Executor Service Example using Callable

Callable:
____________________________________________________________________________________
Callable interface there is an method CALL whose return type is Object
Since runnable method is not returning us any value we can go for Callable which will return us some value.

Future:

________________________________________________

It is used to store the returned value after executing the CALL method


Output:
_________________________________
Good Morning Executed by pool-1-thread-1
Good Morning Completed by pool-1-thread-1
James
Good Morning Executed by pool-1-thread-2
Good Morning Completed by pool-1-thread-2
Patrick
Good Morning Executed by pool-1-thread-3
Good Morning Completed by pool-1-thread-3
Billa
Good Morning Executed by pool-1-thread-1
Good Morning Completed by pool-1-thread-1
David


*/
public class ExecutorServiceExampleUsingCallable{
    public static void main(String args[])throws Exception {
      ExecutorService es=Executors.newFixedThreadPool(3);
      Mythread[] mythreads={
          new Mythread("James"),
            new Mythread("Patrick"),
              new Mythread("Billa"),
                new Mythread("David")
      };
      for(Mythread mythread:mythreads){
        Future s=  es.submit(mythread);
        System.out.println(s.get());
      }
      es.shutdown();
    }
}
class Mythread implements Callable{
    public String name;
  
    public Mythread(String name){
        this.name=name;
    }
    public String call() throws Exception{
            System.out.println("Good Morning Executed by "+Thread.currentThread().getName());
            Thread.sleep(1000);
        System.out.println("Good Morning Completed by "+Thread.currentThread().getName());
        return name;
    }
}
