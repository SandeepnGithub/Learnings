/*
  
   Case with a dead lock :
   
    Since last method is  synchronised  
    
    Class A will  have to wait for object lock of b
    Class B will have to wait for object lock  of a
    
    Output:
    ____________________________________
    
    Inside the A display
    Inside the B display
    Waited for 5 seconds in A
    A class calling b last method
    Waited for 5 seconds in B
    B class calling A last method
    JDoodle - Timeout -  Some common reasons for Timeout 
    */

public class DeadLock1 extends Thread{
      A a=new A();
      B b=new B();
    public static void main(String args[]) {
      DeadLock1 deadLock=new DeadLock1();
      deadLock.m1();
    }
    
    public void m1(){
      this.start();//Child thread creation
      a.display(b);//Main Thread Executing the method
    }
    public void run(){
      b.display(a);//Child thread executing the method
    }
}
class A{
    public synchronized void display(B b){
     System.out.println("Inside the A display"); 
        try{
            Thread.sleep(5000);
            System.out.println("Waited for 5 seconds in A");
        }catch(Exception ex){
            
        }
        System.out.println("A class calling b last method");
        b.last();
    }
    
    public synchronized  void last(){
        System.out.println("Inside the A last");
    }
}

class B{
    public synchronized void display(A a){
        System.out.println("Inside the B display");
        try{
            Thread.sleep(5000);
            System.out.println("Waited for 5 seconds in B");
        }catch(Exception ex){
            
        }
        System.out.println("B class calling A last method");
        a.last();
    }
    
    public synchronized void last(){
        System.out.println("Inside the B last");
    }
}
