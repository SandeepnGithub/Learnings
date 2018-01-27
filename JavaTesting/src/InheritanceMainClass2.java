/**
 * 
 * o/p:
 * ___________________
   3000
   300
   if super and child object have the same instance variable if no super is specified then by 
   default it refers to child class instance variable
 * 
 * 
 * 
 * */


class MyParentClass {
    int a=10;
    int b=20;
   
}

class MyChildClass extends MyParentClass{
    int a=100;
    int b=200;
    public void add(int x ,int y){
        System.out.println(x+y);
        System.out.println(a+b);
    }
    
}

public class InheritanceMainClass2{
    
    public static void main(String args[]) {
       MyChildClass myChildClass=new MyChildClass();
       myChildClass.add(1000,2000);
    }
}
