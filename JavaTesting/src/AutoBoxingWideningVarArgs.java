/*
Autoboxing ,Widening varargs
_____________________________________________________

Widening beats autoboxing
Widening beats varargs
Autoboxing beats varargs

Note :
Varargs is given least priority

1. First Compiler will look for the respective primitive value if not 
2. It will go for widening if not 
3. It will go for autoboxing if not
4. It will go for varargs


*/

public class AutoBoxingWideningVarArgs {
    public static void main(String args[]) {
       Case1 case1=new Case1();
       case1.display(10);
	   Case2 case2=new Case2();
       case2.display(10);
	   Case3 case3=new Case3();
       case3.display(10);
	   Case4 case4=new Case4();
       case4.display(10);
    }
}

class Case1{
     public void display(int a){
        System.out.println("Display Int");
    }
    public void display(Integer a){
        System.out.println("Display Integer");
    }
    public void display(long a){
        System.out.println("Display long");
    }
     public void display(Object a){
        System.out.println("Display Object");
    }
	 public void display(int...a){
        System.out.println("Display Object");
    }
}

class Case2{
    public void display(Integer a){
        System.out.println("Display Integer");
    }
    public void display(long a){
        System.out.println("Display long");
    }
     public void display(Object a){
        System.out.println("Display Object");
    }
	 public void display(int...a){
        System.out.println("Display Object");
    }
}

class Case3{
    public void display(Integer a){
        System.out.println("Display Integer");
    }
	 public void display(int...a){
        System.out.println("Display Object");
    }
}
class Case4{
	 public void display(int...a){
        System.out.println("Display Varargs");
    }
}
