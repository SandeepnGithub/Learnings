package com.test.JAVA8;
/*
DefaultMethodInInterface
_________________________________________________
CASE 1:
Using default keyword we can define a method in interface and the same can be called in the class by implementing


Output:
______________________________________________
 A

**/
public class DefaultMethodInInterface implements A{
    public static void main(String args[]) {
       A ca=new DefaultMethodInInterface();
       ca.show();
    }
}

interface A{
    default void show(){
        System.out.println("A");
    }
}
