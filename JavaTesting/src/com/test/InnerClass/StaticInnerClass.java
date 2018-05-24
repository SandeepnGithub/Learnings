/**

Static Inner Classare created inside the class .

it can access only static members of the class.

OuterClass.StaticClass outerstatic=new OuterClass.StaticClass();
OuterClass.StaticClass.display();

Output:
_____________________________

Inside the Static Inner display james
Inside the Static Inner hello james



*/
public class StaticInnerClass {
    private static String name="james";
    static class Inner{
        public void display(){
            System.out.println("Inside the Static Inner display "+name);
        }
        public static void hello(){
             System.out.println("Inside the Static Inner hello "+name);
        }
    }
    public static void main(String args[]) {
        StaticInnerClass.Inner staticInnerClass=new StaticInnerClass.Inner();
        staticInnerClass.display();
        StaticInnerClass.Inner.hello();
    }
}
