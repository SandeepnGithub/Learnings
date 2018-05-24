/**

Member Inner class can access all the member variables inside the class 

Way to create Object

OuterClass outer=new OuterClass();
OuterClass.Inner inner=outer.new Inner();


Output:
_____________________________

David Billa
I am Back


*/public class MemberInnerClass {
    private static String name="David Billa";
    public static void main(String args[]) {
        MemberInnerClass memberInnerClass=new MemberInnerClass();
        MemberInnerClass.Inner inner=memberInnerClass.new Inner();
         System.out.println(memberInnerClass.name);
        inner.display();
    }
    class Inner{
        public void display(){
            name="I am Back";
            System.out.println(name);
        }
    }
}
