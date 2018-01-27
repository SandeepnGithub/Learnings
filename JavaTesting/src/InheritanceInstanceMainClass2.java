/*
Output:
_______________________________________

Instance Parent class
Constructor Parent class
Instance Child class
Constructor Child class
3000
300
*/
class MyParentClass {
    int a=10;
    int b=20;
    {
        System.out.println("Instance Parent class");
    }
   MyParentClass(){
        System.out.println("Constructor Parent class");
   }
}

class MyChildClass extends MyParentClass{
    int a=100;
    int b=200;
     MyChildClass(){
        System.out.println("Constructor Child class");
   }
    
    {
        System.out.println("Instance Child class");
    }
    public void add(int x ,int y){
        System.out.println(x+y);
        System.out.println(a+b);
    }
    
}

public class InheritanceInstanceMainClass2{
    
    public static void main(String args[]) {
       MyChildClass myChildClass=new MyChildClass();
       myChildClass.add(1000,2000);
    }
}
