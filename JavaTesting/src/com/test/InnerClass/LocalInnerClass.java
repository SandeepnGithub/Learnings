/**

Local Inner Class are created inside the method .


Output:
_____________________________

Hellooooooooooooooo   name     hellow



*/
public class LocalInnerClass {
    private String s="name";
    public static void main(String args[]) {
        LocalInnerClass localInnerClass=new LocalInnerClass();
        localInnerClass.display();
    }
    
    public void display(){
        String name="hellow";
        class Local{
            public void hello(){
                System.out.println("Hellooooooooooooooo   "+s+"     "+name);
            }
        }
        Local l=new Local();
        l.hello();
    }
}
