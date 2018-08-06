/**
Output:
_______________________
3
1
1
2
********************1
********************1
********************2
********************3
----------------1
----------------2
----------------3
**/
import java.util.*;
public class Comparing {
    public static void main(String args[]) {
       Employee emp4=new Employee(3,"hari33");
       Employee emp1=new Employee(1,"hari");
       Employee emp2=new Employee(1,"hari2");
       Employee emp3=new Employee(2,"hari33");
       List<Employee> list=new ArrayList<>();
       list.add(emp4);
       list.add(emp1);
       list.add(emp2);
       list.add(emp3);
       for(Employee e:list)
       System.out.println(e.getID());
       Collections.sort(list);
        for(Employee e:list)
       System.out.println("********************"+e.getID());
       Set<Employee> empset=new TreeSet<>();
        empset.add(emp4);
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        for(Employee e:empset)
       System.out.println("----------------"+e.getID());
    }
}

class Employee implements Comparable<Employee>{
    
   
    private Integer id;
    private String name;
    
     Employee(Integer id,String name){
        this.id=id;
        this.name=name;
    }
    
    public Integer getID(){
        return id;
    }
    public void  setID(Integer id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name=name;
    }
    
    public int compareTo(Employee emp){
        if(this.id==emp.id){
            return 0;
        }else if(this.id > emp.id){
            return 1;
        }else{
            return -1;
        }
    }
}
