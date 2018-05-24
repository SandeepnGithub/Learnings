/**

Nested Interface has to be explicitly referred 

InterfaceOuter.Interfaceinner a=new Class();


Output:
_____________________________

Show
display


*/
public class NestedInterface implements A,A.B{
    public void show(){
        System.out.println("Show");
    }
    public void display(){
        System.out.println("display");
    }
    public static void main(String args[]) {
        A a=new NestedInterface();
        a.show();
        A.B b=new NestedInterface();
        b.display();
    }
}
interface A{
    void show();
    interface B{
        void display();
    }
}
