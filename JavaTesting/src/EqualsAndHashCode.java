/**
Output:
_____________________________

1------list---hari
1------list---hari2
1------list---hari2
1---------hari
1---------hari2


**/
import java.util.*;
public class EqualsAndHashCode {
    public static void main(String args[]) {
       Employee emp1=new Employee(1,"hari");
       Employee emp2=new Employee(1,"hari2");
       Employee emp3=new Employee(1,"hari2");
       List<Employee> list=new ArrayList<>();
       list.add(emp1);
       list.add(emp2);
       list.add(emp3);
       for(Employee e:list)
       System.out.println(e.getID()+"------list---"+e.getName());
       Set<Employee> empset=new HashSet<>();
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        for(Employee e:empset)
       System.out.println(e.getID()+"---------"+e.getName());
    }
}

class Employee{
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
    
    @Override
    public boolean equals(Object obj){
        if(obj==this)
           return true;
        if(!(obj instanceof Employee)){
            return false;
        }
        Employee emp=(Employee) obj;
        if((this.name.equals(emp.name))&&(this.id==emp.id)){
           return true;
        }
        return false;
    }
    
    @Override
    public int hashCode(){
            return 31*this.id;
    }
}
