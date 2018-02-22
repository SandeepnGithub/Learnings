/**
We cannot override static method it is way of hiding the method in the class A

Output:
_________________________________________

sayHello method in Class B
Display method in Class B

*/
public class OverridingWithStaticMethod {
    public static void main(String args[]) {
       B b=new B();
       b.sayHello();
       b.display();
    }
}

class A{
    public void display(){
        System.out.println("Display method in Class A");
    }
    
    public static void sayHello(){
         System.out.println("sayHello method in Class A");
    }
}

class B extends A{
    public void display(){
        System.out.println("Display method in Class B");
    }
    
     public static void sayHello(){
         System.out.println("sayHello method in Class B");
    }
}
