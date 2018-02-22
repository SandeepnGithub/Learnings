package com.test;

import java.util.*;
/*
 Comparable interface is used for comparing the single sorting sequence.
 It is present in java.lang package
 Collections.sort();
 By default uses comparable interface 
 It uses "---compareTo---" method
 
 Note:
 Collections.sort is used to sorting list only for sorting set use TreeSet and for Map use TreeMap

Output:
____________________________________________________________
-----------------Before Sorting--------------------
3------------Employee3
400------------Employee400
1------------Employee1
2------------Employee2
-----------------After Sorting--------------------
1------------Employee1
2------------Employee2
3------------Employee3
400------------Employee400


**/

public class ComparableExample {
    public static void main(String args[]) {
        Employee e1=new Employee(1,"Employee1");
        Employee e2=new Employee(2,"Employee2");
        Employee e3=new Employee(3,"Employee3");
        Employee e4=new Employee(400,"Employee400");
        List<Employee> listEmployee=new ArrayList<>();
        listEmployee.add(e3);
        listEmployee.add(e4);
        listEmployee.add(e1);
        listEmployee.add(e2);
        System.out.println("-----------------Before Sorting--------------------");
        for(Employee e:listEmployee)
        System.out.println(e.id+"------------"+e.name);
        System.out.println("-----------------After Sorting--------------------");
        Collections.sort(listEmployee);
        for(Employee e:listEmployee)
        System.out.println(e.id+"------------"+e.name);
    }
}

class Employee implements Comparable<Employee>{
    public int id;
    public String name;
    Employee(int id,String name){
        this.name=name;
        this.id=id;
    }
    public int compareTo(Employee e){
        if(this.id<e.id){
            return -1;
        }else if(this.id>e.id){
            return 1;
        }else{
            return 0;
        }
    }
    
}
