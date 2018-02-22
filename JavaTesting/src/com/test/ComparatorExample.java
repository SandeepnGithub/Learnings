package com.test;
import java.util.*;
/*
 Comparator interface is used for comparing the multiple sorting sequence.
 It is present in java.util package
 Collections.sort(list,new Comparator());
 By default uses Comparator interface 
 It uses "---compare---" method
 
 Note:
 Collections.sort is used to sorting list only for sorting set use TreeSet and for Map use TreeMap
 
 Output:
 ____________________________________________________________________________
 
 -----------------Before Sorting--------------------
3------------H
400------------A
1------------Z
2------------D
-----------------After Sorting By ID--------------------
1------------Z
2------------D
3------------H
400------------A
-----------------After Sorting By Name--------------------
400------------A
2------------D
3------------H
1------------Z



**/

public class ComparatorExample {
    public static void main(String args[]) {
        Employee e1=new Employee(1,"Z");
        Employee e2=new Employee(2,"D");
        Employee e3=new Employee(3,"H");
        Employee e4=new Employee(400,"A");
        List<Employee> listEmployee=new ArrayList<>();
        listEmployee.add(e3);
        listEmployee.add(e4);
        listEmployee.add(e1);
        listEmployee.add(e2);
        System.out.println("-----------------Before Sorting--------------------");
        for(Employee e:listEmployee)
        System.out.println(e.id+"------------"+e.name);
        System.out.println("-----------------After Sorting By ID--------------------");
        Collections.sort(listEmployee,new CompareByID());
        for(Employee e:listEmployee)
        System.out.println(e.id+"------------"+e.name);
        
        System.out.println("-----------------After Sorting By Name--------------------");
        Collections.sort(listEmployee,new CompareByName());
        for(Employee e:listEmployee)
        System.out.println(e.id+"------------"+e.name);
    }
}

class Employee{
    public int id;
    public String name;
    Employee(int id,String name){
        this.name=name;
        this.id=id;
    }
}

class CompareByID implements Comparator{
    public int compare(Object obj1,Object obj2){
        Employee e=(Employee)obj1;
        Employee e1=(Employee)obj2;
        if(e.id<e1.id){
            return -1;
        }else if(e.id>e1.id){
            return 1;
        }else{
            return 0;
        }
    }
}

class CompareByName implements Comparator{
    public int compare(Object obj1,Object obj2){
        Employee e=(Employee)obj1;
        Employee e1=(Employee)obj2;
        return(e.name.compareTo(e1.name));
    }
}
