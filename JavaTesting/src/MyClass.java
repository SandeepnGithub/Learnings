/****

Thread Example


****/


public class MyClass {
    public static void main(String args[]) throws Exception{
        Mythread.mt=Thread.currentThread();
        Mythread mythread=new Mythread();
        mythread.start();
         for(int i=0;i<10;i++){
          System.out.println("I am main thread"+Thread.currentThread().getName());
          Thread.sleep(2000);
        }
    }
}
class Mythread extends Thread{
    static Thread mt;
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("I am child thread"+Thread.currentThread().getName());
                mt.join();
            }
        }catch(Exception ex){
            
        }
    }
}
