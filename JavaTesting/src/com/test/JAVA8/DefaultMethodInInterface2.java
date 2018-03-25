package com.test.JAVA8;
/*
DefaultMethodInInterface
_________________________________________________
CASE 2:
In case we reimplement the defined method in the interface then first preference will be given to class level implementation

Output:
______________________________________

Inside class DefaultMethodInInterface2


**/
public class DefaultMethodInInterface2 implements A{
    public static void main(String args[]) {
       A ca=new DefaultMethodInInterface2();
       ca.show();
    }
    public void show(){
        System.out.println("Inside class DefaultMethodInInterface2");
    }
}

interface A{
    default void show(){
        System.out.println("A");
    }
}
