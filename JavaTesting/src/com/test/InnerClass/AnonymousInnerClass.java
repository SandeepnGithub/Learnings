/**

Anouymous Inner Class is used to create object for Interface and Abstract Class .

while creating .class it will be created as static class 

Output:
_____________________________

 Anonymous Inner Interface
 Anonymous Inner Abstract



*/
public class AnonymousInnerClass {
    private static String name="James";
    private  String s="Testing";
    public static void main(String args[]) {
     int a =10;
     AnonymousInnerClass anonymousInnerClass=new AnonymousInnerClass();
     AnonymousInnerInterface anonymousInnerInterface = new AnonymousInnerInterface(){
         
         public void display(){
             System.out.println(" Anonymous Inner Interface "+a+"-------"+anonymousInnerClass.s);
         }  
       };
       anonymousInnerInterface.display();
      AnonymousInnerAbstract anonymousInnerAbstract= new AnonymousInnerAbstract(){
         public void display(){
             System.out.println(" Anonymous Inner Abstract "+name);
         }   
       };
      anonymousInnerAbstract.display();
    }
}
interface AnonymousInnerInterface{
    public void display();
}

abstract class AnonymousInnerAbstract{
  abstract  public void display();
}
