/*
  
   Case without a dead lock :
   
    Since last method is not synchronised  It will execute it without any problem
    
    Output:
    _________________________________________________
    Inside the A display
    Inside the B display
    Waited for 5 seconds in A
    A class calling b last method
    Inside the B last
    Waited for 5 seconds in B
    B class calling A last method
    Inside the A last




*/
public class DeadLock extends Thread{
      A a=new A();
      B b=new B();
    public static void main(String args[]) {
      DeadLock deadLock=new DeadLock();
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
    
    public  void last(){
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
    
    public void last(){
        System.out.println("Inside the B last");
    }
}
