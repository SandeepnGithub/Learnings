package com.test.JAVA8;
/*
StaticMethodInInterface
_________________________________________________

Interface can have a static method implementation which can be called 

Output:
______________________________________
A


**/
public class StaticMethodInInterface implements A{
    public static void main(String args[]) {
       A.show();
    }
}

interface A{
    static void show(){
        System.out.println("A");
    }
}
