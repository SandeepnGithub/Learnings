/**
 * 
 * o/p:
 * ___________________
   3000
   300
   30
   this refers to current class object
   super refers to parent class object 
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
    public void add(int a ,int b){
        System.out.println(a+b);
        System.out.println(this.a+this.b);
        System.out.println(super.a+super.b);
    }
    
}

public class InheritanceMainClass{
    
    public static void main(String args[]) {
       MyChildClass myChildClass=new MyChildClass();
       myChildClass.add(1000,2000);
    }
}
