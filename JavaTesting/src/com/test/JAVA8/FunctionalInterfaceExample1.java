package com.test.JAVA8;

/*******
FuntionalInterface 
FuntionalInterface is an interface which can contain only one abstract method and can contain any number of default or static or class methods like (equals,hashcode only definition)

Note :
A functional Interface can extend another interface with only when that interface does not contain any abstract method
eg:
https://www.javatpoint.com/java-8-functional-interfaces
Output:
_________________________________________________________
Display from Interface

******/
@FunctionalInterface
interface FI{
public void display();
}

public class FunctionalInterfaceExample1 implements FI{
    public static void main(String args[]){
        FI fi=new FunctionalInterfaceExample1();
        fi.display();
    }
    public void display(){
        System.out.println("Display from Interface");
    }
    
}
