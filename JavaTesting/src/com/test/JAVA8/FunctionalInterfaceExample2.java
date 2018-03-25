package com.test.JAVA8;
/*******
FuntionalInterface 
A functional interface can have methods of object class. See in the following example.

Output:
_________________________________________________________
Display from Interface

******/
@FunctionalInterface
interface FI{
public void display();
boolean equals(Object o);

 /**
 * Object class method implementation will throw error only method definition is allowed
 * 
 * 
 * error: default method equals in interface FI overrides a member of java.lang.Object
 
   default boolean equals(Object o){
    return true;
    }
   ***/
}

public class FunctionalInterfaceExample2 implements FI{
    public static void main(String args[]){
        FI fi=new FunctionalInterfaceExample2();
        fi.display();
    }
    public void display(){
        System.out.println("Display from Interface");
    }
    
}
