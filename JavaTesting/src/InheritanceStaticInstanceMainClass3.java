/*
Output:
_______________________________________

Constructor Parent class
3000
300
Constructor Parent class
Displaying Inside Child
Constructor Parent class
Displaying Inside Child
10---------------------20
Constructor Parent class
Displaying Inside Child2

*/
class MyParentClass {
    int a=10;
    int b=20;
   MyParentClass(){
        System.out.println("Constructor Parent class");
   }
   
   public void display(){
       System.out.println("Displaying Inside Parent");
   }
}

class MyChildClass extends MyParentClass{
    int a=100;
    int b=200;
    
   public void display(){
       System.out.println("Displaying Inside Child");
   }
    public void add(int x ,int y){
        System.out.println(x+y);
        System.out.println(a+b);
    }
    
}

class MyChildClass2 extends MyChildClass{
    int a=100;
    int b=200;
    
    public void display(){
       System.out.println("Displaying Inside Child2");
   }
    public void add(int x ,int y){
        System.out.println(x+y);
        System.out.println(a+b);
    }
    
}

public class InheritanceStaticInstanceMainClass3{
    
    public static void main(String args[]) {
       MyChildClass myChildClass=new MyChildClass();
       myChildClass.add(1000,2000);
       MyParentClass myParentClass=new MyChildClass();
       myParentClass.display();
       MyChildClass myChildClass1=new MyChildClass();
       myChildClass1.display();
       System.out.println(myParentClass.a +"---------------------"+myParentClass.b);
       
         MyChildClass myChildClass2=new MyChildClass2();
         myChildClass2.display();
    }
}
